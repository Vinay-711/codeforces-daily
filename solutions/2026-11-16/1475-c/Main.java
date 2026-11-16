import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] boys = new int[k];
            int[] girls = new int[k];
            int[] countBoy = new int[a + 1];
            int[] countGirl = new int[b + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < k; i++) {
                boys[i] = Integer.parseInt(st.nextToken());
                countBoy[boys[i]]++;
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < k; i++) {
                girls[i] = Integer.parseInt(st.nextToken());
                countGirl[girls[i]]++;
            }
            long totalPairs = (long) k * (k - 1) / 2;
            long invalidPairs = 0;
            for (int i = 0; i < k; i++) {
                long bCount = countBoy[boys[i]] - 1;
                long gCount = countGirl[girls[i]] - 1;
                invalidPairs += (bCount + gCount);
            }
            out.println(totalPairs - (invalidPairs / 2));
        }
        out.flush();
        out.close();
    }
}