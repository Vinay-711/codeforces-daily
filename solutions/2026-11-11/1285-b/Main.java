import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        while (t-- > 0) {
            line = br.readLine();
            while (line != null && line.trim().isEmpty()) {
                line = br.readLine();
            }
            if (line == null) break;
            int n = Integer.parseInt(line.trim());

            long[] a = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                if (!st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                a[i] = Long.parseLong(st.nextToken());
            }

            boolean ok = true;
            long p = 0;
            for (int i = 0; i < n - 1; i++) {
                p += a[i];
                if (p <= 0) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                long s = 0;
                for (int i = n - 1; i > 0; i--) {
                    s += a[i];
                    if (s <= 0) {
                        ok = false;
                        break;
                    }
                }
            }

            if (ok) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.flush();
    }
}