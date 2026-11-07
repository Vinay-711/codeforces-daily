import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine());
            long a = -1, b = -1, c = -1;
            
            for (long i = 2; i * i * i <= n; i++) {
                if (n % i == 0) {
                    a = i;
                    long remaining = n / a;
                    for (long j = a + 1; j * j < remaining; j++) {
                        if (remaining % j == 0) {
                            b = j;
                            c = remaining / j;
                            if (c != a && c != b && c > 1) {
                                break;
                            }
                        }
                    }
                }
                if (b != -1) break;
            }
            
            if (b != -1) {
                out.println("YES");
                out.println(a + " " + b + " " + c);
            } else {
                out.println("NO");
            }
        }
        out.flush();
        out.close();
    }
}