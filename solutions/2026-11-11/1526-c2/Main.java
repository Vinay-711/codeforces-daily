import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long currentHealth = 0;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            long potion = Long.parseLong(st.nextToken());
            currentHealth += potion;
            pq.add(potion);
            count++;
            
            if (currentHealth < 0) {
                long smallest = pq.poll();
                currentHealth -= smallest;
                count--;
            }
        }
        
        PrintWriter out = new PrintWriter(System.out);
        out.println(count);
        out.flush();
        out.close();
    }
}