import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() {
            while (st == null || !st.hasMoreTokens()) {
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
        String firstToken = sc.next();
        if (firstToken == null) return;
        int n = Integer.parseInt(firstToken);
        long l = sc.nextLong();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a);

        long maxGapTimes2 = Math.max(2 * a[0], 2 * (l - a[n - 1]));
        for (int i = 0; i < n - 1; i++) {
            maxGapTimes2 = Math.max(maxGapTimes2, a[i + 1] - a[i]);
        }

        double result = (double) maxGapTimes2 / 2.0;
        System.out.printf("%.10f\n", result);
    }
}