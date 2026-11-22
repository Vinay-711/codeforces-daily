import java.io.*;

public class Main {
    private static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        FastScanner(InputStream in) { this.in = in; }
        private int readByte() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
        long nextLong() throws IOException {
            int c;
            do { c = readByte(); } while (c <= ' ' && c != -1);
            boolean neg = false;
            if (c == '-') { neg = true; c = readByte(); }
            long val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = readByte();
            }
            return neg ? -val : val;
        }
    }

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner(System.in);
        long n = fs.nextLong();
        int m = (int) fs.nextLong();
        long cur = 1;
        long time = 0;
        for (int i = 0; i < m; i++) {
            long a = fs.nextLong();
            if (a >= cur) {
                time += a - cur;
            } else {
                time += n - (cur - a);
            }
            cur = a;
        }
        System.out.println(time);
    }
}