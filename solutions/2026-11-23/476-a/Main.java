import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int lower = (n + 1) / 2; // ceil(n/2)
        int k = ((lower + m - 1) / m) * m; // smallest multiple of m >= lower
        if (k <= n) {
            System.out.println(k);
        } else {
            System.out.println(-1);
        }
    }
}