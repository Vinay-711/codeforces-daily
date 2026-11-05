import java.io.*;
import java.util.*;

public class Main {
    static class Edge {
        int to;
        long weight;
        Edge(int to, long weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static class Node implements Comparable<Node> {
        int id;
        long dist;
        Node(int id, long dist) {
            this.id = id;
            this.dist = dist;
        }
        public int compareTo(Node other) {
            return Long.compare(this.dist, other.dist);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<List<Edge>> adj = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) adj.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            long w = Long.parseLong(st.nextToken());
            adj.get(u).add(new Edge(v, w));
            adj.get(v).add(new Edge(u, w));
        }

        long[] dist = new long[n + 1];
        int[] parent = new int[n + 1];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[1] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(1, 0));

        while (!pq.isEmpty()) {
            Node curr = pq.poll();
            if (curr.dist > dist[curr.id]) continue;
            for (Edge e : adj.get(curr.id)) {
                if (dist[curr.id] + e.weight < dist[e.to]) {
                    dist[e.to] = dist[curr.id] + e.weight;
                    parent[e.to] = curr.id;
                    pq.add(new Node(e.to, dist[e.to]));
                }
            }
        }

        if (dist[n] == Long.MAX_VALUE) {
            System.out.println(-1);
        } else {
            List<Integer> path = new ArrayList<>();
            for (int at = n; at != 0; at = parent[at]) {
                path.add(at);
            }
            Collections.reverse(path);
            StringBuilder sb = new StringBuilder();
            for (int node : path) {
                sb.append(node).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}