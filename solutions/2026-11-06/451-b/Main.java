import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] a = new long[n];
        long[] b = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
            b[i] = a[i];
        }
        Arrays.sort(b);
        int l = -1, r = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                l = i;
                break;
            }
        }
        if (l == -1) {
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] != b[i]) {
                r = i;
                break;
            }
        }
        reverse(a, l, r);
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
        System.out.println((l + 1) + " " + (r + 1));
    }

    private static void reverse(long[] a, int l, int r) {
        while (l < r) {
            long temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
    }
}