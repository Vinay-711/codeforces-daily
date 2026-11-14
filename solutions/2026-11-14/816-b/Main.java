import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        
        int MAX_TEMP = 200000;
        int[] diff = new int[MAX_TEMP + 2];
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            diff[l]++;
            diff[r + 1]--;
        }
        
        int[] admissible = new int[MAX_TEMP + 1];
        int currentRecipes = 0;
        for (int i = 1; i <= MAX_TEMP; i++) {
            currentRecipes += diff[i];
            if (currentRecipes >= k) {
                admissible[i] = 1;
            }
        }
        
        int[] prefixSum = new int[MAX_TEMP + 1];
        for (int i = 1; i <= MAX_TEMP; i++) {
            prefixSum[i] = prefixSum[i - 1] + admissible[i];
        }
        
        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            out.println(prefixSum[b] - prefixSum[a - 1]);
        }
        out.flush();
        out.close();
    }
}