import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String line = br.readLine();
        if (line == null) return;
        int n = Integer.parseInt(line.trim());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = br.readLine().trim();
            Integer count = map.get(name);
            if (count == null) {
                out.println("OK");
                map.put(name, 1);
            } else {
                while (map.containsKey(name + count)) {
                    count++;
                }
                String newName = name + count;
                out.println(newName);
                map.put(name, count + 1);
                map.put(newName, 1);
            }
        }
        out.flush();
    }
}