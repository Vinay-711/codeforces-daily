/* ==============================================================================
 * Platform: Codeforces
 * Language: Java
 * URL: https://codeforces.com/problemset/problem/231/A
 * Generated: 2026-11-05 11:14:04
 *
 * Approach:
 * We iterate through the n problems, reading the three binary values for each problem. We sum these three values; if the sum is 2 or greater, it means at least two friends are confident in the solution, so we increment our answer counter. Finally, we output the counter. The time complexity is O(n) and space complexity is O(1).
 * ==============================================================================
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int n = Integer.parseInt(line.trim());
        int solvedCount = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a + b + c >= 2) {
                solvedCount++;
            }
        }
        System.out.println(solvedCount);
    }
}
