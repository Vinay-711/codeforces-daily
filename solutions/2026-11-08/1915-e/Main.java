import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }
            
            Set<Long> seen = new HashSet<>();
            seen.add(0L);
            long currentPrefixSum = 0;
            boolean found = false;
            
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    currentPrefixSum += a[i];
                } else {
                    currentPrefixSum -= a[i];
                }
                
                if (seen.contains(currentPrefixSum)) {
                    found = true;
                    break;
                }
                seen.add(currentPrefixSum);
            }
            
            if (found) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
        out.flush();
        out.close();
    }
}