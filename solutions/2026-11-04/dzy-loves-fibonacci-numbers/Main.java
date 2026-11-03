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


    static final int MOD = 1_000_000_009;
    static int[] fib, sum, first, second;

    static int add(int a, int b) {
        int value = a + b;
        return value >= MOD ? value - MOD : value;
    }

    static int term(int a, int b, int k) {
        if (k == 1) return a;
        return (int)(((long) a * fib[k - 2] + (long) b * fib[k - 1]) % MOD);
    }

    static void apply(int node, int length, int a, int b) {
        first[node] = add(first[node], a);
        second[node] = add(second[node], b);
        sum[node] = add(sum[node], add(term(a, b, length + 2), MOD - b));
    }

    static void push(int node, int left, int mid, int right) {
        int a = first[node], b = second[node];
        if (a == 0 && b == 0) return;
        int length = mid - left + 1;
        apply(node * 2, length, a, b);
        apply(node * 2 + 1, right - mid, term(a, b, length + 1), term(a, b, length + 2));
        first[node] = second[node] = 0;
    }

    static void update(int node, int left, int right, int start, int end) {
        if (start <= left && right <= end) {
            apply(node, right - left + 1, fib[left - start + 1], fib[left - start + 2]);
            return;
        }
        int mid = (left + right) / 2;
        push(node, left, mid, right);
        if (start <= mid) update(node * 2, left, mid, start, end);
        if (end > mid) update(node * 2 + 1, mid + 1, right, start, end);
        sum[node] = add(sum[node * 2], sum[node * 2 + 1]);
    }

    static int query(int node, int left, int right, int start, int end) {
        if (start <= left && right <= end) return sum[node];
        int mid = (left + right) / 2;
        push(node, left, mid, right);
        int answer = start <= mid ? query(node * 2, left, mid, start, end) : 0;
        if (end > mid) answer = add(answer, query(node * 2 + 1, mid + 1, right, start, end));
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Input in = new Input();
        int n = in.next(), q = in.next();
        fib = new int[n + 3];
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) fib[i] = add(fib[i - 1], fib[i - 2]);
        int[] original = new int[n + 1];
        for (int i = 1; i <= n; i++) original[i] = add(original[i - 1], in.next());
        sum = new int[4 * n];
        first = new int[4 * n];
        second = new int[4 * n];
        StringBuilder out = new StringBuilder();
        while (q-- > 0) {
            int type = in.next(), l = in.next(), r = in.next();
            if (type == 1) update(1, 1, n, l, r);
            else out.append(add(add(original[r], MOD - original[l - 1]), query(1, 1, n, l, r))).append('\n');
        }
        System.out.print(out);
    }
}
