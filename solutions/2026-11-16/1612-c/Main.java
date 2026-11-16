import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long k = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            if (x >= k * k) {
                out.println(2 * k - 1);
                continue;
            }
            long low = 1, high = 2 * k - 1;
            long ans = 2 * k - 1;
            while (low <= high) {
                long mid = low + (high - low) / 2;
                if (getSum(mid, k) >= x) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            out.println(ans);
        }
        out.flush();
        out.close();
    }

    private static long getSum(long m, long k) {
        if (m <= k) {
            return m * (m + 1) / 2;
        } else {
            long full = k * k;
            long remaining = 2 * k - 1 - m;
            return full - (remaining * (remaining + 1) / 2);
        }
    }
}