import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int totalHours = 0;
        int burnt = 0;
        
        while (a > 0) {
            totalHours += a;
            burnt += a;
            int newCandles = burnt / b;
            burnt = burnt % b;
            a = newCandles;
        }
        
        System.out.println(totalHours);
    }
}