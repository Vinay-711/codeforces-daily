import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int odd = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                if ((a[i] & 1) == 1) odd++;
            }
            if (odd % 2 == 0) {
                sb.append("YES\n");
                continue;
            }
            Arrays.sort(a);
            boolean ok = false;
            for (int i = 1; i < n; i++) {
                if (a[i] - a[i - 1] == 1) {
                    ok = true;
                    break;
                }
            }
            sb.append(ok ? "YES\n" : "NO\n");
        }
        System.out.print(sb.toString());
    }
}