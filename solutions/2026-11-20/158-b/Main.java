import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine().trim());
        st = new StringTokenizer(br.readLine());
        int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0;
        for (int i = 0; i < n; i++) {
            int s = Integer.parseInt(st.nextToken());
            switch (s) {
                case 1: cnt1++; break;
                case 2: cnt2++; break;
                case 3: cnt3++; break;
                case 4: cnt4++; break;
            }
        }
        int taxis = 0;
        // groups of 4
        taxis += cnt4;
        // groups of 3 with 1
        taxis += cnt3;
        cnt1 = Math.max(0, cnt1 - cnt3);
        // groups of 2
        taxis += cnt2 / 2;
        cnt2 = cnt2 % 2;
        if (cnt2 == 1) {
            taxis += 1; // one taxi for the remaining 2
            cnt1 = Math.max(0, cnt1 - 2);
        }
        // remaining 1s
        if (cnt1 > 0) {
            taxis += (cnt1 + 3) / 4;
        }
        System.out.println(taxis);
    }
}