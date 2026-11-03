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

    static int base;
    static long[] tree;
    static final long ABSENT = Long.MAX_VALUE;

    static void update(int position, long entry) {
        int node = base + position - 1;
        tree[node] = entry;
        while ((node /= 2) > 0)
            tree[node] = Math.min(tree[node * 2], tree[node * 2 + 1]);
    }

    static long minimum(int left, int right) {
        long result = ABSENT;
        for (int a = base + left - 1, b = base + right; a < b; a /= 2, b /= 2) {
            if ((a & 1) != 0) result = Math.min(result, tree[a++]);
            if ((b & 1) != 0) result = Math.min(result, tree[--b]);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        Input in = new Input();
        int n = in.next();
        int[] values = new int[n + 1], last = new int[500001];
        for (int i = 1; i <= n; i++) values[i] = in.next();
        int q = in.next();
        int[] head = new int[n + 1], left = new int[q], next = new int[q], answer = new int[q];
        Arrays.fill(head, -1);
        for (int i = 0; i < q; i++) {
            left[i] = in.next();
            int right = in.next();
            next[i] = head[right];
            head[right] = i;
        }
        base = 1;
        while (base < n) base *= 2;
        tree = new long[2 * base];
        Arrays.fill(tree, ABSENT);
        for (int right = 1; right <= n; right++) {
            int value = values[right];
            if (last[value] != 0) update(last[value], ABSENT);
            update(right, ((long) last[value] << 32) | value);
            last[value] = right;
            for (int i = head[right]; i >= 0; i = next[i]) {
                long entry = minimum(left[i], right);
                if ((entry >>> 32) < left[i]) answer[i] = (int) entry;
            }
        }
        StringBuilder out = new StringBuilder();
        for (int value : answer) out.append(value).append('\n');
        System.out.print(out);
    }

}
