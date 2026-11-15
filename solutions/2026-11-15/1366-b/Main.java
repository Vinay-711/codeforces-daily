import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            long L = x;
            long R = x;
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                long l = Long.parseLong(st.nextToken());
                long r = Long.parseLong(st.nextToken());
                if (Math.max(L, l) <= Math.min(R, r)) {
                    L = Math.min(L, l);
                    R = Math.max(R, r);
                }
            }
            out.println(R - L + 1);
        }
        out.flush();
        out.close();
    }
}