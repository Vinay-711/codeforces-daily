/* ==============================================================================
 * Platform: Codeforces
 * Language: Java
 * URL: https://codeforces.com/problemset/problem/50/A
 * Generated: 2026-11-05 11:16:42
 *
 * Approach:
 * Each domino covers 2 squares. The maximum number of dominoes that can fit on an M x N board is floor((M * N) / 2). This is always achievable by tiling along the even dimension first and then tiling any remaining 1xN or Mx1 strip. Time complexity is O(1) and space complexity is O(1).
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
        StringTokenizer st = new StringTokenizer(line);
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        System.out.println((m * n) / 2);
    }
}
