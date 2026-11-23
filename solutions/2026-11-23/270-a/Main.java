public class Main {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.io.PrintWriter out = new java.io.PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < t; i++) {
            int a = Integer.parseInt(br.readLine().trim());
            int d = 180 - a;
            if (360 % d == 0) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.flush();
    }
}