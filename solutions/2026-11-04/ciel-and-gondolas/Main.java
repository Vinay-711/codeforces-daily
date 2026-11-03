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

    static int stride;
    static int[] prefix, previous, current;

    static int cost(int left, int right) {
        int start = left - 1;
        return (prefix[right * stride + right] - prefix[start * stride + right]
              - prefix[right * stride + start] + prefix[start * stride + start]) / 2;
    }

    static void compute(int first, int last, int low, int high) {
        if (first > last) return;
        int middle = (first + last) / 2;
        int split = low, best = Integer.MAX_VALUE;
        for (int j = low; j <= Math.min(high, middle - 1); j++) {
            int value = previous[j] + cost(j + 1, middle);
            if (value < best) {
                best = value;
                split = j;
            }
        }
        current[middle] = best;
        compute(first, middle - 1, low, split);
        compute(middle + 1, last, split, high);
    }

    public static void main(String[] args) throws IOException {
        Input in = new Input();
        int n = in.next(), groups = in.next();
        stride = n + 1;
        prefix = new int[stride * stride];
        for (int i = 1; i <= n; i++) {
            int row = 0;
            for (int j = 1; j <= n; j++) {
                row += in.next();
                prefix[i * stride + j] = prefix[(i - 1) * stride + j] + row;
            }
        }
        previous = new int[stride];
        current = new int[stride];
        for (int i = 1; i <= n; i++) previous[i] = cost(1, i);
        for (int g = 2; g <= groups; g++) {
            compute(g, n, g - 1, n - 1);
            int[] swap = previous;
            previous = current;
            current = swap;
        }
        System.out.println(previous[n]);
    }

}
