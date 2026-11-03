import java.io.*;
import java.util.*;
public class Main {
 public static void main(String[] args) throws Exception {
Scanner in=new Scanner(System.in);String s=in.next();int[] count=new int[4];for(int i=0;i<s.length();i+=2)count[s.charAt(i)-'0']++;
StringBuilder out=new StringBuilder();for(int d=1;d<=3;d++)for(int j=0;j<count[d];j++){if(out.length()>0)out.append('+');out.append(d);}System.out.println(out);
 }
}
