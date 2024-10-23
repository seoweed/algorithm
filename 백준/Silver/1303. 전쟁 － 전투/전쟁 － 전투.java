import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static int n, m, count, result;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];
        count = 0;
        result = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < m; j++) {
                if (line.substring(j, j + 1).equals("W")) {
                    map[i][j] = 1;
                } else {
                    map[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    BFS(i, j, 1);
                    result += count * count;
                    count = 0;
                }
            }
        }
        System.out.print(result + " ");
        result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && map[i][j] == 0) {
                    BFS(i, j, 0);
                    result += count * count;
                    count = 0;
                }
            }
        }
        System.out.print(result);

    }

    private static void BFS(int x, int y, int k) {
        LinkedList<Integer[]> queue = new LinkedList<>();
        queue.offer(new Integer[]{x, y});
        while (!queue.isEmpty()) {
                Integer[] now = queue.poll();
            if (!visited[now[0]][now[1]] && map[now[0]][now[1]] == k) {
                visited[now[0]][now[1]] = true;
                count++;
                for (int i = 0; i < 4; i++) {
                    int nx = now[0] + dx[i];
                    int ny = now[1] + dy[i];
                    if (nx >= 0 && nx < n && ny >=0 && ny < m && !visited[nx][ny] && map[nx][ny] == k) {
                        queue.offer(new Integer[]{nx, ny});
                    }
                }
            }

        }
    }

}
