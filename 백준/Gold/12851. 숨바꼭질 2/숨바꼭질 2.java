import java.io.*;
import java.util.*;

public class Main {
    static int n, k, step, count;
    static boolean[] visited;
    static int[] dist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        visited = new boolean[100001];
        dist = new int[100001]; 
        step = 0;
        count = 0;

        BFS(n);
        System.out.println(step);
        System.out.println(count);
    }

    private static void BFS(int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        visited[n] = true;
        dist[n] = 0;
        count = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == k) {
                step = dist[current];
                count++; 
                continue;
            }

            int[] nextPositions = {current + 1, current - 1, current * 2};
            for (int next : nextPositions) {
                if (next >= 0 && next <= 100000) {
                    if (!visited[next]) {
                        queue.offer(next);
                        visited[next] = true;
                        dist[next] = dist[current] + 1;
                    } else if (dist[next] == dist[current] + 1) {
                        // 이미 방문한 곳이지만 같은 시간에 도달하는 경우 방법의 수만 증가
                        queue.offer(next);
                    }
                }
            }
        }
    }
}
