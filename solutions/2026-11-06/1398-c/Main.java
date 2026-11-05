import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            Map<Long, Long> map = new HashMap<>();
            map.put(0L, 1L);
            long currentPrefixSum = 0;
            long count = 0;
            for (int i = 0; i < n; i++) {
                int val = s.charAt(i) - '0';
                currentPrefixSum += (val - 1);
                long freq = map.getOrDefault(currentPrefixSum, 0L);
                count += freq;
                map.put(currentPrefixSum, freq + 1);
            }
            out.println(count);
        }
        out.flush();
        out.close();
    }
}