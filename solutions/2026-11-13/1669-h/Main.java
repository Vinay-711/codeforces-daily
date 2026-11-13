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
            long k = Long.parseLong(st.nextToken());
            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            int[] bitCounts = new int[31];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                for (int j = 0; j <= 30; j++) {
                    if (((a[i] >> j) & 1) == 0) {
                        bitCounts[j]++;
                    }
                }
            }
            long ans = 0;
            for (int j = 30; j >= 0; j--) {
                if (bitCounts[j] <= k) {
                    k -= bitCounts[j];
                    ans |= (1L << j);
                }
            }
            out.println(ans);
        }
        out.flush();
        out.close();
    }
}