import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] b = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        long minVal = Long.MAX_VALUE;
        long maxVal = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            b[i] = Long.parseLong(st.nextToken());
            if (b[i] < minVal) minVal = b[i];
            if (b[i] > maxVal) maxVal = b[i];
        }
        long diff = maxVal - minVal;
        long minCount = 0;
        long maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] == minVal) minCount++;
            if (b[i] == maxVal) maxCount++;
        }
        long ways;
        if (minVal == maxVal) {
            ways = (long) n * (n - 1) / 2;
        } else {
            ways = minCount * maxCount;
        }
        System.out.println(diff + " " + ways);
    }
}