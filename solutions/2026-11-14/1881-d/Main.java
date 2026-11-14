import java.io.*;
import java.util.*;

public class Main {
    private static final int MAX = 1000001;
    private static int[] minPrime = new int[MAX];

    private static void sieve() {
        for (int i = 2; i * i < MAX; i++) {
            if (minPrime[i] == 0) {
                for (int j = i * i; j < MAX; j += i) {
                    if (minPrime[j] == 0) minPrime[j] = i;
                }
            }
        }
        for (int i = 2; i < MAX; i++) {
            if (minPrime[i] == 0) minPrime[i] = i;
        }
    }

    public static void main(String[] args) throws IOException {
        sieve();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Map<Integer, Integer> primeCounts = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(st.nextToken());
                while (val > 1) {
                    int p = minPrime[val];
                    int count = 0;
                    while (val % p == 0) {
                        val /= p;
                        count++;
                    }
                    primeCounts.put(p, primeCounts.getOrDefault(p, 0) + count);
                }
            }
            boolean possible = true;
            for (int count : primeCounts.values()) {
                if (count % n != 0) {
                    possible = false;
                    break;
                }
            }
            if (possible) out.println("YES");
            else out.println("NO");
        }
        out.flush();
        out.close();
    }
}