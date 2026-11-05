/* ==============================================================================
 * Platform: Codeforces
 * Language: Java
 * URL: https://codeforces.com/problemset/problem/4/A
 * Generated: 2026-11-05 01:32:06
 *
 * Approach:
 * A watermelon can be divided into two even parts if and only if its total weight w is even and strictly greater than 2. If w = 2, the only positive split is 1 + 1, neither of which is even. For any even w > 2, we can split it into 2 and w - 2, both of which are positive even numbers. Time complexity is O(1) and space complexity is O(1).
 * ==============================================================================
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line != null && !line.trim().isEmpty()) {
            int w = Integer.parseInt(line.trim());
            if (w > 2 && w % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
