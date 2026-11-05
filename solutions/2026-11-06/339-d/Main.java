import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[] tree;
    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        size = 1 << n;
        tree = new int[2 * size];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            tree[size + i] = Integer.parseInt(st.nextToken());
        }

        build(1, n);

        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            update(p - 1, b);
            out.println(tree[1]);
        }
        out.flush();
        out.close();
    }

    static void build(int node, int height) {
        if (height == 0) return;
        for (int i = 1 << (height - 1); i < (1 << height); i++) {
            int left = 2 * i;
            int right = 2 * i + 1;
            if ((n - height) % 2 == 0) {
                tree[i] = tree[left] | tree[right];
            } else {
                tree[i] = tree[left] ^ tree[right];
            }
        }
        if (height > 1) {
            build(node, height - 1);
        }
    }

    static void update(int idx, int val) {
        int pos = size + idx;
        tree[pos] = val;
        boolean orOp = true;
        while (pos > 1) {
            pos /= 2;
            if (orOp) {
                tree[pos] = tree[2 * pos] | tree[2 * pos + 1];
            } else {
                tree[pos] = tree[2 * pos] ^ tree[2 * pos + 1];
            }
            orOp = !orOp;
        }
    }
}