import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[] cats;
    static List<Integer>[] adj;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        cats = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            cats[i] = Integer.parseInt(st.nextToken());
        }

        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        dfs(1, 0, 0);
        System.out.println(count);
    }

    static void dfs(int u, int p, int currentConsecutive) {
        if (cats[u] == 1) {
            currentConsecutive++;
        } else {
            currentConsecutive = 0;
        }

        if (currentConsecutive > m) {
            return;
        }

        boolean isLeaf = true;
        for (int v : adj[u]) {
            if (v != p) {
                isLeaf = false;
                dfs(v, u, currentConsecutive);
            }
        }

        if (isLeaf) {
            count++;
        }
    }
}