import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null || s.isEmpty()) return;
        
        int n = s.length();
        
        // Check 1-digit subsequences
        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';
            if (d % 8 == 0) {
                System.out.println("YES");
                System.out.println(d);
                return;
            }
        }
        
        // Check 2-digit subsequences
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') continue;
            for (int j = i + 1; j < n; j++) {
                int val = (s.charAt(i) - '0') * 10 + (s.charAt(j) - '0');
                if (val % 8 == 0) {
                    System.out.println("YES");
                    System.out.println(val);
                    return;
                }
            }
        }
        
        // Check 3-digit subsequences
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') continue;
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int val = (s.charAt(i) - '0') * 100 + (s.charAt(j) - '0') * 10 + (s.charAt(k) - '0');
                    if (val % 8 == 0) {
                        System.out.println("YES");
                        System.out.println(val);
                        return;
                    }
                }
            }
        }
        
        System.out.println("NO");
    }
}