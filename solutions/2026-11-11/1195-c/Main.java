import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) {
            return;
        }
        int n = Integer.parseInt(line.trim());

        long[] h1 = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            h1[i] = Long.parseLong(st.nextToken());
        }

        long[] h2 = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            h2[i] = Long.parseLong(st.nextToken());
        }

        long dp0 = 0; // max height without picking any student at current step
        long dp1 = 0; // max height picking student from row 1 at current step
        long dp2 = 0; // max height picking student from row 2 at current step

        for (int i = 0; i < n; i++) {
            long next0 = Math.max(dp0, Math.max(dp1, dp2));
            long next1 = Math.max(dp0, dp2) + h1[i];
            long next2 = Math.max(dp0, dp1) + h2[i];

            dp0 = next0;
            dp1 = next1;
            dp2 = next2;
        }

        long ans = Math.max(dp0, Math.max(dp1, dp2));
        System.out.println(ans);
    }
}