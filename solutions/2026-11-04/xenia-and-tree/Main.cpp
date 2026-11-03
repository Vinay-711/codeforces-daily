#include <algorithm>
#include <iostream>
#include <utility>
#include <vector>
using namespace std;

class RedTree {
    vector<vector<int>> edges;
    vector<vector<pair<int, int>>> ancestors;
    vector<int> parent, size, nearest;
    vector<bool> removed;

    void decompose(int start) {
        vector<int> component{start};
        parent[start] = -1;
        for (size_t i = 0; i < component.size(); ++i) {
            int u = component[i];
            size[u] = 1;
            for (int v : edges[u]) {
                if (!removed[v] && v != parent[u]) {
                    parent[v] = u;
                    component.push_back(v);
                }
            }
        }
        for (auto it = component.rbegin(); it != component.rend(); ++it)
            if (parent[*it] != -1) size[parent[*it]] += size[*it];

        int centroid = start;
        for (int u : component) {
            int largest = int(component.size()) - size[u];
            for (int v : edges[u])
                if (!removed[v] && parent[v] == u) largest = max(largest, size[v]);
            if (2 * largest <= int(component.size())) {
                centroid = u;
                break;
            }
        }

        vector<pair<int, int>> pending{{centroid, -1}};
        ancestors[centroid].emplace_back(centroid, 0);
        for (size_t i = 0; i < pending.size(); ++i) {
            auto [u, prev] = pending[i];
            int distance = ancestors[u].back().second;
            for (int v : edges[u]) {
                if (removed[v] || v == prev) continue;
                ancestors[v].emplace_back(centroid, distance + 1);
                pending.emplace_back(v, u);
            }
        }

        removed[centroid] = true;
        for (int v : edges[centroid])
            if (!removed[v]) decompose(v);
    }

public:
    explicit RedTree(vector<vector<int>> graph)
        : edges(move(graph)), ancestors(edges.size()), parent(edges.size()),
          size(edges.size()), nearest(edges.size(), int(edges.size())),
          removed(edges.size()) {
        decompose(0);
        paint(0);
    }

    void paint(int u) {
        for (auto [centroid, distance] : ancestors[u])
            nearest[centroid] = min(nearest[centroid], distance);
    }

    int query(int u) const {
        int answer = int(edges.size());
        for (auto [centroid, distance] : ancestors[u])
            answer = min(answer, nearest[centroid] + distance);
        return answer;
    }
};

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n, queries;
    if (!(cin >> n >> queries)) return 0;
    vector<vector<int>> edges(n);
    for (int i = 1; i < n; ++i) {
        int a, b;
        cin >> a >> b;
        --a;
        --b;
        edges[a].push_back(b);
        edges[b].push_back(a);
    }
    RedTree tree(move(edges));
    while (queries--) {
        int type, node;
        cin >> type >> node;
        if (type == 1) tree.paint(node - 1);
        else cout << tree.query(node - 1) << '\n';
    }
}
