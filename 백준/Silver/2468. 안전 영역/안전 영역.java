import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int safeZone;
    static int max = 1;
    static int min = 100;
    static int result = 0;
    static int current = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];
        safeZone = 0;
        // 맵 데이터 초기화
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int value = Integer.parseInt(st.nextToken());
                if (value > max) {
                    max = value;
                } else if (value < min) {
                    min = value;
                }
                map[i][j] = value;
            }
        }
        for (current = 0; current < max; current++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && map[i][j] > current) {
                        DFS(i, j);
                        safeZone++;
                    }
                }
            }
            if (safeZone > result) {
                result = safeZone;
            }
            safeZone = 0;
            visited = new boolean[n][n];
        }
        System.out.println(result);
    }

    private static void DFS(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny] && map[nx][ny] > current) {
                DFS(nx, ny);
            }
        }
    }
}
