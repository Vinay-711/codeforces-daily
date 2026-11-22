import java.io.*;
import java.util.*;

public class Main {
    private static int upperBound(int[] arr, long key) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = (l + r) >>> 1;
            if (arr[m] <= key) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l; // number of elements <= key
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine().trim());
        int[] prices = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(prices);
        int q = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            long m = Long.parseLong(br.readLine().trim());
            int ans = upperBound(prices, m);
            sb.append(ans).append('\n');
        }
        System.out.print(sb.toString());
    }
}