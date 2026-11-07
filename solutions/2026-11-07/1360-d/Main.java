import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            
            if (k >= n) {
                out.println(1);
                continue;
            }
            
            long minPackages = n;
            for (long i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    long d1 = i;
                    long d2 = n / i;
                    
                    if (d1 <= k) {
                        minPackages = Math.min(minPackages, n / d1);
                    }
                    if (d2 <= k) {
                        minPackages = Math.min(minPackages, n / d2);
                    }
                }
            }
            out.println(minPackages);
        }
        out.flush();
        out.close();
    }
}