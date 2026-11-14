import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int MOD = 1000000007;

        if (k == 1) {
            System.out.println(n);
            return;
        }

        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = 1;
        }

        for (int len = 2; len <= k; len++) {
            int[] nextDp = new int[n + 1];
            for (int m = 1; m <= n; m++) {
                if (dp[m] == 0) continue;
                for (int j = m; j <= n; j += m) {
                    nextDp[j] = (nextDp[j] + dp[m]) % MOD;
                }
            }
            dp = nextDp;
        }

        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = (ans + dp[i]) % MOD;
        }
        System.out.println(ans);
    }
}