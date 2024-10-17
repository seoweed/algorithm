import java.io.*;
import java.util.*;

public class Main {
    static int w;
    static int h;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dy = {0, 0, -1, 1, -1, 1, 1, -1};
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (w == 0 && h == 0) break;
            map = new int[h][w];
            visited = new boolean[h][w];
            count = 0;

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && map[i][j] == 1) {
                        count++;
                        DFS(i, j);
                    }
                }
            }
            System.out.println(count);
        } while (true);
    }

    private static void DFS(int x, int y) {
        visited[x][y] = true;
        for (int a = 0; a < 8; a++) {
            int nx = x + dx[a];
            int ny = y + dy[a];
            if (nx >= 0 && nx < h && ny >= 0 && ny < w && map[nx][ny] == 1 && !visited[nx][ny]) {
                visited[nx][ny] = true;
                DFS(nx, ny);
            }
        }
    }
}
