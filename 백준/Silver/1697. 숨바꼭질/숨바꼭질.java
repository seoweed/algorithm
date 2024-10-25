import java.io.*;
import java.util.*;

public class Main {
    static int n, k, step;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        visited = new boolean[100001];
        step = 0;

        BFS(n, step);
        System.out.println(step);
    }

    private static void BFS(int n, int s) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{n, s});
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentValue = current[0];
            int currentStep = current[1];

            if (currentValue == k) {
                step = currentStep;
                break;
            }
            int nx = currentValue + 1;
            int ny = currentValue - 1;
            int nz = currentValue * 2;
            if (nx <= 100000 && nx >= 0 && !visited[nx]) {
                queue.offer(new int[]{nx, currentStep + 1});
                visited[nx] = true;
            }
            if (ny <= 100000 && ny >= 0 && !visited[ny]) {
                queue.offer(new int[]{ny, currentStep + 1});
                visited[ny] = true;
            }
            if (nz <= 100000 && nz >= 0 && !visited[nz]) {
                queue.offer(new int[]{nz, currentStep + 1});
                visited[nz] = true;
            }
        }
    }
}