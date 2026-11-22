import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null) return;
        int n = s.length();
        boolean allUpper = true;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!Character.isUpperCase(c)) {
                allUpper = false;
                break;
            }
        }
        boolean allExceptFirstUpper = true;
        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);
            if (!Character.isUpperCase(c)) {
                allExceptFirstUpper = false;
                break;
            }
        }
        if (allUpper || allExceptFirstUpper) {
            StringBuilder sb = new StringBuilder(n);
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
                else sb.append(Character.toUpperCase(c));
            }
            System.out.println(sb.toString());
        } else {
            System.out.println(s);
        }
    }
}