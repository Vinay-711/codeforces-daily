/* ==============================================================================
 * Platform: Codeforces
 * Language: Java
 * URL: https://codeforces.com/problemset/problem/158/A
 * Generated: 2026-11-05 11:15:15
 *
 * Approach:
 * We check each participant's score starting from the highest rank (1st place) down to the n-th place. A contestant advances if their score is greater than 0 and at least equal to the score of the k-th place finisher. Since the scores are provided in non-increasing order, we can iterate through the array and increment the count until we encounter a participant who does not satisfy the conditions. Time Complexity: O(n), Space Complexity: O(n).
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
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int targetScore = a[k - 1];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= targetScore && a[i] > 0) {
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);
    }
}
