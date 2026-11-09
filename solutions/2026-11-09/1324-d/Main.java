import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] a = new long[n];
        StringTokenizer stA = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(stA.nextToken());
        }
        long[] b = new long[n];
        StringTokenizer stB = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b[i] = Long.parseLong(stB.nextToken());
        }

        long[] c = new long[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] - b[i];
        }

        Arrays.sort(c);

        long count = 0;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (c[left] + c[right] > 0) {
                count += (right - left);
                right--;
            } else {
                left++;
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(count);
        out.flush();
        out.close();
    }
}