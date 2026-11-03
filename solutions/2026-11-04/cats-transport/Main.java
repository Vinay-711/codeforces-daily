import java.io.*;
import java.util.*;

public class Main {

    static class Input {
        private final byte[] buffer = new byte[65536];
        private int offset, size;
        int read() throws IOException {
            if (offset == size) {
                size = System.in.read(buffer);
                offset = 0;
                if (size < 0) return -1;
            }
            return buffer[offset++];
        }
        int next() throws IOException {
            int c;
            do { c = read(); } while (c >= 0 && c <= 32);
            int sign = 1, value = 0;
            if (c == '-') { sign = -1; c = read(); }
            while (c > 32) { value = 10 * value + c - '0'; c = read(); }
            return value * sign;
        }
        int operation() throws IOException {
            int first;
            do { first = read(); } while (first >= 0 && first <= 32);
            while (read() > 32) {}
            return first;
        }
    }

    public static void main(String[] args) throws IOException {
        Input in = new Input();
        int hills = in.next(), cats = in.next(), feeders = in.next();
        long[] distance = new long[hills + 1], ready = new long[cats + 1];
        for (int i = 2; i <= hills; i++) distance[i] = distance[i - 1] + in.next();
        for (int i = 1; i <= cats; i++) {
            int hill = in.next();
            ready[i] = in.next() - distance[hill];
        }
        Arrays.sort(ready, 1, cats + 1);
        long[] prefix = new long[cats + 1];
        for (int i = 1; i <= cats; i++) prefix[i] = prefix[i - 1] + ready[i];

        long inf = Long.MAX_VALUE / 4;
        long[] previous = new long[cats + 1], current = new long[cats + 1];
        Arrays.fill(previous, 1, cats + 1, inf);
        int[] hull = new int[cats + 1];
        long[] intercept = new long[cats + 1], start = new long[cats + 1];
        for (int group = 0; group < Math.min(feeders, cats); group++) {
            int head = 0, tail = 1;
            hull[0] = 0;
            start[0] = Long.MIN_VALUE;
            for (int i = 1; i <= cats; i++) {
                while (head + 1 < tail && start[head + 1] <= ready[i]) head++;
                int j = hull[head];
                current[i] = (i - j) * ready[i] - prefix[i] + intercept[j];
                if (previous[i] == inf) continue;
                intercept[i] = previous[i] + prefix[i];

                // The next line first wins at the ceiling of the intersection.
                long cross;
                while (true) {
                    int last = hull[tail - 1];
                    long numerator = intercept[i] - intercept[last];
                    cross = -Math.floorDiv(-numerator, i - last);
                    if (tail == head + 1 || cross > start[tail - 1]) break;
                    tail--;
                }
                hull[tail] = i;
                start[tail++] = cross;
            }
            long[] swap = previous;
            previous = current;
            current = swap;
        }
        System.out.println(previous[cats]);
    }

}
