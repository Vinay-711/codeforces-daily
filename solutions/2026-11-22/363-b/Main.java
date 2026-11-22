import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] h = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(st.nextToken());
        }
        long cur = 0;
        for (int i = 0; i < k; i++) cur += h[i];
        long best = cur;
        int ans = 1; // 1‑based index
        for (int i = k; i < n; i++) {
            cur += h[i] - h[i - k];
            if (cur < best) {
                best = cur;
                ans = i - k + 2; // convert to 1‑based
            }
        }
        System.out.println(ans);
    }
}