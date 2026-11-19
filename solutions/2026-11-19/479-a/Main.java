import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine().trim());
        long b = Long.parseLong(br.readLine().trim());
        long c = Long.parseLong(br.readLine().trim());
        long ans = Long.MIN_VALUE;
        ans = Math.max(ans, a + b + c);
        ans = Math.max(ans, a * b * c);
        ans = Math.max(ans, (a + b) * c);
        ans = Math.max(ans, a * (b + c));
        System.out.println(ans);
    }
}