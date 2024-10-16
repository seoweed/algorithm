import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        ArrayList<Integer> complexSizes = new ArrayList<>();
        int complexCount = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    int size = DFS(i, j);
                    complexSizes.add(size);
                    complexCount++;
                }
            }
        }
        System.out.println(complexCount);
        Collections.sort(complexSizes);
        for (Integer size : complexSizes) {
            System.out.println(size);
        }
    }

    static int DFS(int x, int y) {
        visited[x][y] = true;
        int count = 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < N && ny >= 0 && ny < N && map[nx][ny] == 1 && !visited[nx][ny]) {
                count += DFS(nx, ny);
            }
        }
        return count;
    }
}
