import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            int[] nextDiff = new int[n + 1];
            nextDiff[n] = -1;
            for (int i = n - 1; i >= 1; i--) {
                if (a[i] != a[i + 1]) {
                    nextDiff[i] = i + 1;
                } else {
                    nextDiff[i] = nextDiff[i + 1];
                }
            }
            int q = Integer.parseInt(br.readLine());
            for (int k = 0; k < q; k++) {
                st = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                if (nextDiff[l] != -1 && nextDiff[l] <= r) {
                    out.println(l + " " + nextDiff[l]);
                } else {
                    out.println("-1 -1");
                }
            }
            out.println();
        }
        out.flush();
        out.close();
    }
}