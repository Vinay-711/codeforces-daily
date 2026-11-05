import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] a = new int[n];
        int evenCount = 0;
        int oddCount = 0;
        
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            if (a[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        boolean majorityEven = evenCount > oddCount;
        for (int i = 0; i < n; i++) {
            if (majorityEven && a[i] % 2 != 0) {
                System.out.println(i + 1);
                break;
            } else if (!majorityEven && a[i] % 2 == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}