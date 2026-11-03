#include <algorithm>
#include <cmath>
#include <iostream>
#include <vector>
using namespace std;

struct Query {
    int left, right, threshold, index, block;
};

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int n, m;
    cin >> n >> m;
    vector<int> color(n);
    for (int &c : color) cin >> c;
    vector<vector<int>> graph(n);
    for (int i = 1; i < n; ++i) {
        int u, v;
        cin >> u >> v;
        --u;
        --v;
        graph[u].push_back(v);
        graph[v].push_back(u);
    }
    vector<int> parent(n, -1), start(n), size(n, 1), order, stack{0};
    while (!stack.empty()) {
        int u = stack.back();
        stack.pop_back();
        start[u] = int(order.size());
        order.push_back(u);
        for (int v : graph[u]) {
            if (v == parent[u]) continue;
            parent[v] = u;
            stack.push_back(v);
        }
    }
    for (int i = n - 1; i > 0; --i) size[parent[order[i]]] += size[order[i]];
    int blockSize = max(1, int(n / sqrt(m)));
    vector<Query> queries(m);
    for (int i = 0; i < m; ++i) {
        int u, k;
        cin >> u >> k;
        --u;
        queries[i] = {start[u], start[u] + size[u] - 1, k, i, start[u] / blockSize};
    }
    sort(queries.begin(), queries.end(), [](const Query &a, const Query &b) {
        if (a.block != b.block) return a.block < b.block;
        return a.block % 2 ? a.right > b.right : a.right < b.right;
    });
    vector<int> count(100001), atLeast(100001), answers(m);
    int left = 0, right = -1;
    auto add = [&](int i) { ++atLeast[++count[color[order[i]]]]; };
    auto remove = [&](int i) { --atLeast[count[color[order[i]]]--]; };
    for (const Query &query : queries) {
        while (left > query.left) add(--left);
        while (right < query.right) add(++right);
        while (left < query.left) remove(left++);
        while (right > query.right) remove(right--);
        answers[query.index] = atLeast[query.threshold];
    }
    for (int result : answers) cout << result << '\n';
}
