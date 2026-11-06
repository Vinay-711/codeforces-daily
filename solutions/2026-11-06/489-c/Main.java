import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        if (s == 0) {
            if (m == 1) System.out.println("0 0");
            else System.out.println("-1 -1");
            return;
        }

        if (s > 9 * m) {
            System.out.println("-1 -1");
            return;
        }

        int[] minDigits = new int[m];
        int[] maxDigits = new int[m];

        int tempS = s;
        for (int i = 0; i < m; i++) {
            int digit = Math.min(9, tempS);
            maxDigits[i] = digit;
            tempS -= digit;
        }

        tempS = s - 1;
        minDigits[0] = 1;
        for (int i = m - 1; i >= 0; i--) {
            int digit = Math.min(9, tempS);
            minDigits[i] += digit;
            tempS -= digit;
        }

        StringBuilder minStr = new StringBuilder();
        for (int d : minDigits) minStr.append(d);
        StringBuilder maxStr = new StringBuilder();
        for (int d : maxDigits) maxStr.append(d);

        System.out.println(minStr.toString() + " " + maxStr.toString());
    }
}