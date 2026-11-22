public class Main {
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        java.util.Map<String, Integer> cnt = new java.util.HashMap<>();
        for (int i = 0; i < n; i++) {
            String team = br.readLine().trim();
            cnt.put(team, cnt.getOrDefault(team, 0) + 1);
        }
        String winner = null;
        int max = -1;
        for (java.util.Map.Entry<String, Integer> e : cnt.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                winner = e.getKey();
            }
        }
        System.out.println(winner);
    }
}