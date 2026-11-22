import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine().trim());
        int[][] a = new int[n][2]; // [price, quality]
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            a[i][0] = Integer.parseInt(st.nextToken());
            a[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a, Comparator.comparingInt(o -> o[0])); // sort by price
        int maxQuality = 0;
        boolean happy = false;
        for (int i = 0; i < n; i++) {
            int q = a[i][1];
            if (q < maxQuality) {
                happy = true;
                break;
            }
            if (q > maxQuality) maxQuality = q;
        }
        System.out.println(happy ? "Happy Alex" : "Poor Alex");
    }
}