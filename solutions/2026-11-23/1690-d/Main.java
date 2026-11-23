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
            int whites = 0;
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == 'W') whites++;
            }
            int ans = whites;
            for (int i = k; i < n; i++) {
                if (s.charAt(i) == 'W') whites++;
                if (s.charAt(i - k) == 'W') whites--;
                if (whites < ans) ans = whites;
            }
            out.append(ans).append('\n');
        }
        System.out.print(out.toString());
    }
}