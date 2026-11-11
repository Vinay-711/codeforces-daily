import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null || s.trim().isEmpty()) {
            return;
        }
        s = s.trim();

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        int oddCount = 0;
        for (int c : count) {
            if (c % 2 != 0) {
                oddCount++;
            }
        }

        if (oddCount == 0 || oddCount % 2 == 1) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}