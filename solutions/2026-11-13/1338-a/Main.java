import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
            long maxDiff = 0;
            long currentMax = a[0];
            for (int i = 1; i < n; i++) {
                if (a[i] < currentMax) {
                    maxDiff = Math.max(maxDiff, currentMax - a[i]);
                } else {
                    currentMax = a[i];
                }
            }
            if (maxDiff == 0) {
                out.println(0);
            } else {
                int bits = 0;
                while ((1L << bits) - 1 < maxDiff) {
                    bits++;
                }
                out.println(bits);
            }
        }
        out.flush();
        out.close();
    }
}