public class Main{
    public static void main(String[] args) throws Exception{
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String line = br.readLine();
        long x = Long.parseLong(line.trim());
        int ans = Long.bitCount(x);
        System.out.println(ans);
    }
}