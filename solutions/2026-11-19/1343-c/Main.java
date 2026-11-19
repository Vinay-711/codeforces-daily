public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = fs.nextInt();
            long sum = 0;
            long cur = fs.nextLong();
            for (int i = 1; i < n; i++) {
                long x = fs.nextLong();
                if ((cur > 0 && x > 0) || (cur < 0 && x < 0)) {
                    if (x > cur) cur = x;
                } else {
                    sum += cur;
                    cur = x;
                }
            }
            sum += cur;
            sb.append(sum).append('\n');
        }
        System.out.print(sb.toString());
    }

    static class FastScanner {
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        private final java.io.InputStream in = System.in;
        private int readByte() throws java.io.IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }
        long nextLong() throws java.io.IOException {
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
        int nextInt() throws java.io.IOException { return (int) nextLong(); }
    }
}