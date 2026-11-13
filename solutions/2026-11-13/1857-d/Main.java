import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            long[] a = new long[n];
            long[] b = new long[n];
            
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) a[i] = Long.parseLong(st.nextToken());
            
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) b[i] = Long.parseLong(st.nextToken());

            long[] c = new long[n];
            long maxVal = Long.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                c[i] = a[i] - b[i];
                if (c[i] > maxVal) {
                    maxVal = c[i];
                }
            }

            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (c[i] == maxVal) {
                    result.add(i + 1);
                }
            }

            out.println(result.size());
            for (int i = 0; i < result.size(); i++) {
                out.print(result.get(i) + (i == result.size() - 1 ? "" : " "));
            }
            out.println();
        }
        out.flush();
        out.close();
    }
}