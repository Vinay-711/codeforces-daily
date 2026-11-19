import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            int balance = 0;
            int moves = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == '(') {
                    balance++;
                } else { // c == ')'
                    balance--;
                    if (balance < 0) {
                        moves++;
                        balance = 0; // pretend we moved this ')' to the end
                    }
                }
            }
            pw.println(moves);
        }
        pw.flush();
    }
}