import java.io.*;
import java.util.*;

public class Main {
    static int n, m, k, count, max;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        map = new int[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1];
        count = 0;
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = 1;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    DFS(i, j);
                    if (count > max) {
                        max = count;
                    }
                    count = 0;
                }
            }
        }
        System.out.println(max);
    }

    private static void DFS(int x, int y) {
        visited[x][y] = true;
        count++;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 1 && nx < n + 1 && ny >= 1 && ny < m + 1 && !visited[nx][ny] && map[nx][ny] == 1) {
                DFS(nx, ny);
            }
        }
    }

}
