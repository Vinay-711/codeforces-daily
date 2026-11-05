/* ==============================================================================
 * Platform: Codeforces
 * Language: Java
 * URL: https://codeforces.com/problemset/problem/282/A
 * Generated: 2026-11-05 11:14:28
 *
 * Approach:
 * The problem asks us to track the value of a single variable 'x' starting at 0 after executing n statements. Each statement contains either '++' (which increments x) or '--' (which decrements x). We iterate through each statement, check if it contains the '+' character to increment x, otherwise decrement x, and finally print the result. The time complexity is O(n) and space complexity is O(1).
 * ==============================================================================
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int x = 0;
        for (int i = 0; i < n; i++) {
            String statement = br.readLine();
            if (statement != null && statement.indexOf('+') != -1) {
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
    }
}
