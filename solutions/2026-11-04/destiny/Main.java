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

    static int[] leftChild, rightChild, count;
    static int used;

    static int update(int previous, int left, int right, int position, int delta) {
        int node = ++used;
        leftChild[node] = leftChild[previous];
        rightChild[node] = rightChild[previous];
        count[node] = count[previous] + delta;
        if (left < right) {
            int mid = (left + right) / 2;
            if (position <= mid)
                leftChild[node] = update(leftChild[previous], left, mid, position, delta);
            else
                rightChild[node] = update(rightChild[previous], mid + 1, right, position, delta);
        }
        return node;
    }

    static void allocate(int capacity) {
        leftChild = new int[capacity];
        rightChild = new int[capacity];
        count = new int[capacity];
    }

    static int first(int before, int after, int left, int right, int threshold) {
        if (count[after] - count[before] <= threshold) return -1;
        if (left == right) return left;
        int mid = (left + right) / 2;
        int value = first(leftChild[before], leftChild[after], left, mid, threshold);
        if (value >= 0) return value;
        return first(rightChild[before], rightChild[after], mid + 1, right, threshold);
    }

    public static void main(String[] args) throws IOException {
        Input in = new Input();
        int n = in.next(), q = in.next();
        allocate(21 * n + 1);
        int[] root = new int[n + 1];
        for (int i = 1; i <= n; i++) root[i] = update(root[i - 1], 1, n, in.next(), 1);
        StringBuilder out = new StringBuilder();
        while (q-- > 0) {
            int left = in.next(), right = in.next(), k = in.next();
            out.append(first(root[left - 1], root[right], 1, n, (right - left + 1) / k)).append('\n');
        }
        System.out.print(out);
    }

}
