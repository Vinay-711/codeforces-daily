import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long s = Long.parseLong(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] dragons = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            dragons[i][0] = Integer.parseInt(st.nextToken()); // xi
            dragons[i][1] = Integer.parseInt(st.nextToken()); // yi
        }
        Arrays.sort(dragons, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]); // xi ascending
                }
                return Integer.compare(b[1], a[1]); // yi descending for equal xi
            }
        });
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            if (s > dragons[i][0]) {
                s += dragons[i][1];
            } else {
                ok = false;
                break;
            }
        }
        out.println(ok ? "YES" : "NO");
        out.flush();
    }
}