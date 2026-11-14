import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            Integer[] k = new Integer[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                k[i] = Integer.parseInt(st.nextToken());
            }
            long[] c = new long[m];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                c[i] = Long.parseLong(st.nextToken());
            }
            Arrays.sort(k, Collections.reverseOrder());
            long totalCost = 0;
            int presentIdx = 0;
            for (int i = 0; i < n; i++) {
                int friendLimit = k[i] - 1;
                if (presentIdx < m && presentIdx < friendLimit) {
                    totalCost += c[presentIdx];
                    presentIdx++;
                } else {
                    totalCost += c[friendLimit];
                }
            }
            out.println(totalCost);
        }
        out.flush();
        out.close();
    }
}