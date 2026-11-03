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

    static int kth(int node, int n, int k) {
        if (count[node] < k) return n + 1;
        int left = 1, right = n;
        while (left < right) {
            int mid = (left + right) / 2;
            int leftCount = count[leftChild[node]];
            if (leftCount >= k) {
                node = leftChild[node];
                right = mid;
            } else {
                k -= leftCount;
                node = rightChild[node];
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) throws IOException {
        Input in = new Input();
        int n = in.next();
        allocate(37 * n + 1);
        int[] color = new int[n + 1], first = new int[n + 1], root = new int[n + 2];
        for (int i = 1; i <= n; i++) color[i] = in.next();
        for (int i = n; i >= 1; i--) {
            int node = root[i + 1], old = first[color[i]];
            if (old != 0) node = update(node, 1, n, old, -1);
            root[i] = update(node, 1, n, i, 1);
            first[color[i]] = i;
        }
        StringBuilder out = new StringBuilder();
        for (int k = 1; k <= n; k++) {
            int groups = 0;
            for (int i = 1; i <= n; i = kth(root[i], n, k + 1)) groups++;
            out.append(groups).append(k == n ? '\n' : ' ');
        }
        System.out.print(out);
    }

}
