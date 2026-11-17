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
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            long[] a = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
            boolean[] valid = new boolean[n - 1];
            for (int i = 0; i < n - 1; i++) {
                if (a[i] < 2 * a[i + 1]) {
                    valid[i] = true;
                }
            }
            int count = 0;
            int currentConsecutive = 0;
            for (int i = 0; i < n - 1; i++) {
                if (valid[i]) {
                    currentConsecutive++;
                } else {
                    currentConsecutive = 0;
                }
                if (currentConsecutive >= k) {
                    count++;
                }
            }
            out.println(count);
        }
        out.flush();
        out.close();
    }
}