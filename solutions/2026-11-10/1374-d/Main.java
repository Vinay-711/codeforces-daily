import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        String tStr = sc.next();
        if (tStr == null) return;
        int t = Integer.parseInt(tStr);

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();

            long[] rem = new long[n];
            int len = 0;

            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                long r = (k - (a % k)) % k;
                if (r > 0) {
                    rem[len++] = r;
                }
            }

            if (len == 0) {
                out.println(0);
                continue;
            }

            Arrays.sort(rem, 0, len);

            long maxMoves = 0;
            int i = 0;
            while (i < len) {
                int j = i;
                while (j < len && rem[j] == rem[i]) {
                    j++;
                }
                long cnt = j - i;
                long r = rem[i];
                long moves = (cnt - 1) * k + r + 1;
                if (moves > maxMoves) {
                    maxMoves = moves;
                }
                i = j;
            }

            out.println(maxMoves);
        }

        out.flush();
    }
}