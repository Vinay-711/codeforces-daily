import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] names = new String[n];
        int[] scores = new int[n];
        Map<String, Integer> finalScores = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            names[i] = st.nextToken();
            scores[i] = Integer.parseInt(st.nextToken());
            finalScores.put(names[i], finalScores.getOrDefault(names[i], 0) + scores[i]);
        }
        int maxScore = Integer.MIN_VALUE;
        for (int score : finalScores.values()) {
            if (score > maxScore) maxScore = score;
        }
        Map<String, Integer> currentScores = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = names[i];
            int score = scores[i];
            currentScores.put(name, currentScores.getOrDefault(name, 0) + score);
            if (currentScores.get(name) >= maxScore && finalScores.get(name) == maxScore) {
                System.out.println(name);
                return;
            }
        }
    }
}