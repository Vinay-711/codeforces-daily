import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            int[][] dp = new int[n + 1][2];
            for (int i = 0; i <= n; i++) {
                Arrays.fill(dp[i], 1000000000);
            }
            dp[0][1] = 0;
            for (int i = 0; i < n; i++) {
                if (dp[i][1] != 1000000000) {
                    dp[i + 1][0] = Math.min(dp[i + 1][0], dp[i][1] + a[i]);
                    if (i + 2 <= n) {
                        dp[i + 2][0] = Math.min(dp[i + 2][0], dp[i][1] + a[i] + a[i + 1]);
                    }
                }
                if (dp[i][0] != 1000000000) {
                    dp[i + 1][1] = Math.min(dp[i + 1][1], dp[i][0]);
                    if (i + 2 <= n) {
                        dp[i + 2][1] = Math.min(dp[i + 2][1], dp[i][0]);
                    }
                }
            }
            out.println(Math.min(dp[n][0], dp[n][1]));
        }
        out.flush();
        out.close();
    }
}