import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int limit = 1000000;
        boolean[] isNotPrime = new boolean[limit + 1];
        isNotPrime[0] = isNotPrime[1] = true;
        for (int i = 2; i * i <= limit; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            long x = Long.parseLong(st.nextToken());
            long sqrt = (long) Math.sqrt(x);
            if (sqrt * sqrt == x && !isNotPrime[(int) sqrt]) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.flush();
        out.close();
    }
}