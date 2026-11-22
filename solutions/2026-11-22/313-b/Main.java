import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        int[] pref = new int[n + 1]; // pref[0]=0, pref[1]=0
        for (int i = 2; i <= n; i++) {
            pref[i] = pref[i - 1] + (s.charAt(i - 2) == s.charAt(i - 1) ? 1 : 0);
        }
        int m = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < m; q++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int ans = pref[r] - pref[l];
            sb.append(ans).append('\n');
        }
        System.out.print(sb.toString());
    }
}