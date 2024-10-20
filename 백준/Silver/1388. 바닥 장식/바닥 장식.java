import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int n, m, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];
        count = 0;

        for (int i = 0; i < n; i++) {
            char[] charArray = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                String s = charArray[j] + "";
                if (s.equals("-")) {
                    map[i][j] = 0;
                } else {
                    map[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    DFS(i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void DFS(int x, int y) {
        visited[x][y] = true;
        if (map[x][y] == 0) {
            int ny = y + 1;
            if (ny < m && !visited[x][ny] && map[x][ny] == 0) {
                DFS(x, ny);
            }
        } else {
            int nx = x + 1;
            if (nx < n && !visited[nx][y] && map[nx][y] == 1) {
                DFS(nx, y);
            }
        }
    }
}
