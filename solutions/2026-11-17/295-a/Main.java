import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long[] a = new long[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }

        int[] l = new int[m + 1];
        int[] r = new int[m + 1];
        long[] d = new long[m + 1];
        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            l[i] = Integer.parseInt(st.nextToken());
            r[i] = Integer.parseInt(st.nextToken());
            d[i] = Long.parseLong(st.nextToken());
        }

        long[] opCountDiff = new long[m + 2];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            opCountDiff[x]++;
            opCountDiff[y + 1]--;
        }

        long[] opCount = new long[m + 1];
        long currentCount = 0;
        for (int i = 1; i <= m; i++) {
            currentCount += opCountDiff[i];
            opCount[i] = currentCount;
        }

        long[] arrDiff = new long[n + 2];
        for (int i = 1; i <= m; i++) {
            if (opCount[i] > 0) {
                arrDiff[l[i]] += opCount[i] * d[i];
                arrDiff[r[i] + 1] -= opCount[i] * d[i];
            }
        }

        long currentAdd = 0;
        PrintWriter out = new PrintWriter(System.out);
        for (int i = 1; i <= n; i++) {
            currentAdd += arrDiff[i];
            a[i] += currentAdd;
            out.print(a[i] + (i == n ? "" : " "));
        }
        out.println();
        out.flush();
        out.close();
    }
}