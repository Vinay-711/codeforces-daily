import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        long[] a = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }

        long[] diff = new long[n + 1];
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken()) - 1;
            int r = Integer.parseInt(st.nextToken()) - 1;
            diff[l]++;
            diff[r + 1]--;
        }

        long[] counts = new long[n];
        long current = 0;
        for (int i = 0; i < n; i++) {
            current += diff[i];
            counts[i] = current;
        }

        Arrays.sort(a);
        Arrays.sort(counts);

        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += a[i] * counts[i];
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(totalSum);
        out.flush();
        out.close();
    }
}