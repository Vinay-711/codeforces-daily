import java.io.*;
import java.util.*;
public class Main {
    static final int MOD = 2520;
    static int[] divisors = new int[48], index = new int[2521];
    static int[][] next = new int[48][10];
    static long[][] memo = new long[20][MOD * 48];
    static char[] digits;
    static int gcd(int a, int b) { while (b != 0) { int t=a%b; a=b; b=t; } return a; }
    static long dfs(int pos, int rem, int lc, boolean tight) {
        if (pos == digits.length) return rem % divisors[lc] == 0 ? 1 : 0;
        int left=digits.length-pos, key=rem*48+lc;
        if (!tight && memo[left][key]>=0) return memo[left][key];
        int limit=tight ? digits[pos]-'0' : 9;
        long ans=0;
        for (int d=0; d<=limit; d++) ans+=dfs(pos+1,(rem*10+d)%MOD,next[lc][d],tight && d==limit);
        if (!tight) memo[left][key]=ans;
        return ans;
    }
    static long count(long x) {
        if(x<0) return 0;
        digits=Long.toString(x).toCharArray();
        return dfs(0,0,index[1],true);
    }
    public static void main(String[] args) throws Exception {
        int size=0;
        for(int d=1;d<=MOD;d++) if(MOD%d==0) { index[d]=size;divisors[size++]=d; }
        for(int i=0;i<48;i++) for(int d=0;d<10;d++) next[i][d]=d==0?i:index[divisors[i]/gcd(divisors[i],d)*d];
        for(long[] row:memo) Arrays.fill(row,-1);
        FastScanner f=new FastScanner(); int t=(int)f.read(); StringBuilder out=new StringBuilder();
        while(t-->0){long l=f.read(),r=f.read();out.append(count(r)-count(l-1)).append('\n');}
        System.out.print(out);
    }
    static class FastScanner {
        final InputStream in=System.in; byte[] b=new byte[65536]; int p=0,n=0;
        int get() throws IOException {if(p==n){n=in.read(b);p=0;if(n<0)return -1;}return b[p++];}
        long read() throws IOException {int c;do{c=get();}while(c<=32&&c>=0);long v=0;while(c>32){v=v*10+c-'0';c=get();}return v;}
    }
}
