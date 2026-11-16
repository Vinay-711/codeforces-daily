import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long x = Long.parseLong(br.readLine());
        if (x == 1) {
            System.out.println("1 1");
            return;
        }
        long bestA = 1;
        long bestB = x;
        for (long i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                long a = i;
                long b = x / i;
                if (gcd(a, b) == 1) {
                    if (Math.max(a, b) < Math.max(bestA, bestB)) {
                        bestA = a;
                        bestB = b;
                    }
                }
            }
        }
        System.out.println(bestA + " " + bestB);
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            a %= b;
            long temp = a;
            a = b;
            b = temp;
        }
        return a;
    }
}