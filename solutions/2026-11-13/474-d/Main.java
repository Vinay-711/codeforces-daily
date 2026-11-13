import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    private static final int MOD = 1000000007;
    private static final int MAX = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        String line = br.readLine();
        if (line == null) return;
        StringTokenizer st = new StringTokenizer(line);

        int t = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] dp = new int[MAX + 1];
        int[] pref = new int[MAX + 1];

        dp[0] = 1;
        for (int i = 1; i <= MAX; i++) {
            dp[i] = dp[i - 1];
            if (i >= k) {
                dp[i] = (dp[i] + dp[i - k]) % MOD;
            }
        }

        for (int i = 1; i <= MAX; i++) {
            pref[i] = (pref[i - 1] + dp[i]) % MOD;
        }

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int ans = (pref[b] - pref[a - 1] + MOD) % MOD;
            out.println(ans);
        }

        out.flush();
    }
}