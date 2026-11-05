/* ==============================================================================
 * Platform: Codeforces
 * Language: Java
 * URL: https://codeforces.com/problemset/problem/71/A
 * Generated: 2026-11-05 01:32:44
 *
 * Approach:
 * We iterate through the $n$ given words. For each word, if its length is strictly greater than 10, we replace it with its abbreviated form: the first character, followed by the number of middle characters (length - 2), and finally the last character. Words with length 10 or fewer are output unchanged. Time complexity is $O(\sum |s|)$ where $|s|$ is the length of each string, and space complexity is $O(|s|)$.
 * ==============================================================================
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.isEmpty()) return;
        int n = Integer.parseInt(line.trim());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String word = br.readLine().trim();
            int len = word.length();
            if (len > 10) {
                sb.append(word.charAt(0))
                  .append(len - 2)
                  .append(word.charAt(len - 1))
                  .append("\n");
            } else {
                sb.append(word).append("\n");
            }
        }
        System.out.print(sb);
    }
}
