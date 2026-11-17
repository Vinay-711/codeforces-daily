import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            st = new StringTokenizer(br.readLine());
            List<Integer> trailingZeros = new ArrayList<>();
            long totalDigits = 0;
            for (int i = 0; i < n; i++) {
                String s = st.nextToken();
                totalDigits += s.length();
                int zeros = 0;
                for (int j = s.length() - 1; j >= 0; j--) {
                    if (s.charAt(j) == '0') {
                        zeros++;
                    } else {
                        break;
                    }
                }
                trailingZeros.add(zeros);
            }
            Collections.sort(trailingZeros, Collections.reverseOrder());
            long removedZeros = 0;
            for (int i = 0; i < trailingZeros.size(); i++) {
                if (i % 2 == 0) {
                    removedZeros += trailingZeros.get(i);
                }
            }
            long finalLength = totalDigits - removedZeros;
            if (finalLength >= m + 1) {
                out.println("Sasha");
            } else {
                out.println("Anna");
            }
        }
        out.flush();
        out.close();
    }
}