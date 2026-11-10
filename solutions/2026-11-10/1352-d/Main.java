import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            
            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            
            int left = 0;
            int right = n - 1;
            int totalA = 0;
            int totalB = 0;
            int prev = 0;
            int moves = 0;
            int turn = 0; // 0 for Alice, 1 for Bob
            
            while (left <= right) {
                moves++;
                int currentSum = 0;
                if (turn == 0) {
                    while (left <= right && currentSum <= prev) {
                        currentSum += a[left];
                        left++;
                    }
                    totalA += currentSum;
                    prev = currentSum;
                    turn = 1;
                } else {
                    while (left <= right && currentSum <= prev) {
                        currentSum += a[right];
                        right--;
                    }
                    totalB += currentSum;
                    prev = currentSum;
                    turn = 0;
                }
            }
            
            sb.append(moves).append(" ").append(totalA).append(" ").append(totalB).append("\n");
        }
        
        System.out.print(sb);
    }
}