import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            int s = Integer.MAX_VALUE;
            int t_sub = Integer.MAX_VALUE;
            int penalty = 0;
            for (int x : a) {
                if (s > t_sub) {
                    int temp = s;
                    s = t_sub;
                    t_sub = temp;
                }
                if (x <= s) {
                    s = x;
                } else if (x <= t_sub) {
                    t_sub = x;
                } else {
                    s = x;
                    penalty++;
                }
            }
            out.println(penalty);
        }
        out.flush();
        out.close();
    }
}