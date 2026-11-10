import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        String line = br.readLine();
        if (line == null) return;
        st = new StringTokenizer(line);
        int t = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            
            st = new StringTokenizer(br.readLine());
            Map<Long, Integer> freq = new HashMap<>();
            long count = 0;
            
            for (int i = 0; i < n; i++) {
                long val = Long.parseLong(st.nextToken());
                long rx = val % x;
                long ry = val % y;
                
                long targetRx = (x - rx) % x;
                long targetRy = ry;
                
                long targetKey = (targetRx << 32) | targetRy;
                count += freq.getOrDefault(targetKey, 0);
                
                long curKey = (rx << 32) | ry;
                freq.put(curKey, freq.getOrDefault(curKey, 0) + 1);
            }
            
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}