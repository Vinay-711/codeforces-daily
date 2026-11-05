import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String recipe = br.readLine();
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        long nb = Long.parseLong(st1.nextToken());
        long ns = Long.parseLong(st1.nextToken());
        long nc = Long.parseLong(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        long pb = Long.parseLong(st2.nextToken());
        long ps = Long.parseLong(st2.nextToken());
        long pc = Long.parseLong(st2.nextToken());
        long r = Long.parseLong(br.readLine());

        long rb = 0, rs = 0, rc = 0;
        for (char c : recipe.toCharArray()) {
            if (c == 'B') rb++;
            else if (c == 'S') rs++;
            else if (c == 'C') rc++;
        }

        long low = 0, high = 2000000000000L + 1000000000000L;
        long ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long neededB = Math.max(0, mid * rb - nb);
            long neededS = Math.max(0, mid * rs - ns);
            long neededC = Math.max(0, mid * rc - nc);

            long cost = neededB * pb + neededS * ps + neededC * pc;

            if (cost <= r) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }
}