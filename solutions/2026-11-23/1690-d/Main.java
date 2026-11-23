import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            String s = br.readLine().trim();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = (s.charAt(i) == 'W') ? 1 : 0;
            }
            int sum = 0;
            for (int i = 0; i < k; i++) sum += a[i];
            int ans = sum;
            for (int i = k; i < n; i++) {
                sum += a[i] - a[i - k];
                if (sum < ans) ans = sum;
            }
            out.append(ans).append('\n');
        }
        System.out.print(out.toString());
    }
}