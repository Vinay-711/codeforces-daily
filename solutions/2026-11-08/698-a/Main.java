import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[n + 1][3];
        for (int[] row : dp) Arrays.fill(row, 1000);
        dp[0][0] = 0;

        for (int i = 0; i < n; i++) {
            // Option 0: Rest
            dp[i + 1][0] = Math.min(dp[i][0], Math.min(dp[i][1], dp[i][2])) + 1;

            // Option 1: Contest (if available)
            if (a[i] == 1 || a[i] == 3) {
                dp[i + 1][1] = Math.min(dp[i][0], dp[i][2]);
            }

            // Option 2: Gym (if available)
            if (a[i] == 2 || a[i] == 3) {
                dp[i + 1][2] = Math.min(dp[i][0], dp[i][1]);
            }
        }

        int ans = Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2]));
        System.out.println(ans);
    }
}