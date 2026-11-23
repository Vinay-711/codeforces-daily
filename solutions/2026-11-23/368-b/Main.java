import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] a = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        // Precompute distinct counts for each suffix
        int[] distinct = new int[n + 1];
        boolean[] seen = new boolean[100001];
        int count = 0;
        
        for (int i = n; i >= 1; i--) {
            if (!seen[a[i]]) {
                seen[a[i]] = true;
                count++;
            }
            distinct[i] = count;
        }
        
        // Answer queries
        for (int i = 0; i < m; i++) {
            int l = Integer.parseInt(br.readLine());
            out.println(distinct[l]);
        }
        
        out.flush();
        out.close();
    }
}