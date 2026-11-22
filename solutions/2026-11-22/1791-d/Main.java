public class Main {
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.OutputStreamWriter(System.out)));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            int[] pref = new int[n];
            boolean[] seen = new boolean[26];
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                int idx = s.charAt(i) - 'a';
                if (!seen[idx]) {
                    seen[idx] = true;
                    cnt++;
                }
                pref[i] = cnt;
            }
            int[] suff = new int[n];
            boolean[] seen2 = new boolean[26];
            cnt = 0;
            for (int i = n - 1; i >= 0; i--) {
                int idx = s.charAt(i) - 'a';
                if (!seen2[idx]) {
                    seen2[idx] = true;
                    cnt++;
                }
                suff[i] = cnt;
            }
            int ans = 0;
            for (int i = 0; i < n - 1; i++) {
                int cur = pref[i] + suff[i + 1];
                if (cur > ans) ans = cur;
            }
            out.println(ans);
        }
        out.flush();
    }
}