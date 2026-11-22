import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            
            int ans = 0;
            if (k == 2) {
                boolean hasEven = false;
                for (int x : a) {
                    if (x % 2 == 0) {
                        hasEven = true;
                        break;
                    }
                }
                ans = hasEven ? 0 : 1;
            } else if (k == 3) {
                int minCost = Integer.MAX_VALUE;
                for (int x : a) {
                    int rem = x % 3;
                    int cost = (3 - rem) % 3;
                    if (cost < minCost) {
                        minCost = cost;
                    }
                }
                ans = minCost;
            } else if (k == 4) {
                // Check if product is already divisible by 4
                boolean divisibleBy4 = false;
                int evenCount = 0;
                for (int x : a) {
                    if (x % 4 == 0) {
                        divisibleBy4 = true;
                        break;
                    }
                    if (x % 2 == 0) {
                        evenCount++;
                    }
                }
                if (divisibleBy4 || evenCount >= 2) {
                    ans = 0;
                } else {
                    // Option 1: Make one element divisible by 4
                    int cost1 = Integer.MAX_VALUE;
                    for (int x : a) {
                        int rem = x % 4;
                        int cost = (4 - rem) % 4;
                        if (cost < cost1) {
                            cost1 = cost;
                        }
                    }
                    
                    // Option 2: Make two elements even
                    int cost2 = Integer.MAX_VALUE;
                    int min1 = Integer.MAX_VALUE;
                    int min2 = Integer.MAX_VALUE;
                    for (int x : a) {
                        int rem = x % 2;
                        int cost = (2 - rem) % 2;
                        if (cost < min1) {
                            min2 = min1;
                            min1 = cost;
                        } else if (cost < min2) {
                            min2 = cost;
                        }
                    }
                    if (min2 != Integer.MAX_VALUE) {
                        cost2 = min1 + min2;
                    }
                    
                    ans = Math.min(cost1, cost2);
                }
            } else if (k == 5) {
                int minCost = Integer.MAX_VALUE;
                for (int x : a) {
                    int rem = x % 5;
                    int cost = (5 - rem) % 5;
                    if (cost < minCost) {
                        minCost = cost;
                    }
                }
                ans = minCost;
            }
            
            out.println(ans);
        }
        
        out.flush();
        out.close();
    }
}