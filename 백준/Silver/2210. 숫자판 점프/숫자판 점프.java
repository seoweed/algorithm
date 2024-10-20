import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static Set<String> result;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[] selected;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        map = new int[5][5];
        result = new HashSet<>();
        selected = new int[6];

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                DFS(i, j, 0);
            }
        }
        System.out.println(result.size());

    }

    private static void DFS(int x, int y, int depth) {
        if (depth == 6) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append(selected[i]);
            }
            result.add(sb.toString());
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < 5 && ny < 5) {
                selected[depth] = map[nx][ny];
                DFS(nx, ny, depth + 1);
            }
        }
    }
}
