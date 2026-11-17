import java.io.*;
import java.util.*;

public class Main {
    static int n, m, k;
    static char[][] grid;
    static boolean[][] visited;
    static int totalEmpty = 0;
    static int count = 0;
    static int[] dr = {0, 0, 1, -1};
    static int[] dc = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        grid = new char[n][m];
        visited = new boolean[n][m];
        int startR = -1, startC = -1;

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                grid[i][j] = line.charAt(j);
                if (grid[i][j] == '.') {
                    totalEmpty++;
                    startR = i;
                    startC = j;
                }
            }
        }

        if (k > 0) {
            dfs(startR, startC);
        }

        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                out.print(grid[i][j]);
            }
            out.println();
        }
        out.flush();
        out.close();
    }

    static void dfs(int r, int c) {
        visited[r][c] = true;
        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if (nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == '.' && !visited[nr][nc]) {
                dfs(nr, nc);
            }
        }
        if (count < k) {
            grid[r][c] = 'X';
            count++;
        }
    }
}