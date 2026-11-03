#include <iostream>
#include <vector>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    constexpr int mod = 1000000007;
    int n;
    cin >> n;
    vector<int> values(n);
    int unionMask = 0;
    for (int &value : values) {
        cin >> value;
        unionMask |= value;
    }
    int limit = 1;
    while (limit <= unionMask) limit *= 2;
    vector<int> count(limit), powers(n + 1, 1);
    for (int value : values) ++count[value];
    for (int i = 1; i <= n; ++i) powers[i] = 2 * powers[i - 1] % mod;
    for (int bit = 1; bit < limit; bit *= 2)
        for (int start = 0; start < limit; start += 2 * bit)
            for (int mask = start; mask < start + bit; ++mask)
                count[mask] += count[mask + bit];
    long long answer = 0;
    for (int mask = 0; mask < limit; ++mask) {
        int subsets = powers[count[mask]] - 1;
        if (__builtin_parity(unsigned(mask))) answer -= subsets;
        else answer += subsets;
    }
    cout << (answer % mod + mod) % mod << '\n';
}
