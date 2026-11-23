import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        if (t == 10) {
            if (n == 1) {
                System.out.println(-1);
                return;
            }
            sb.append('1');
            for (int i = 0; i < n - 2; i++) sb.append('0');
            sb.append('0');
        } else {
            sb.append(t);
            for (int i = 0; i < n - 1; i++) sb.append('0');
        }
        System.out.println(sb.toString());
    }
}