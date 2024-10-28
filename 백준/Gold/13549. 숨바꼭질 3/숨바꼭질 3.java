import java.io.*;
import java.util.*;

public class Main {
    static int n, k, max, min;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        visited = new boolean[100001];
        max = 100000;
        min = Integer.MAX_VALUE;


        BFS(n);
        System.out.println(min);
    }

    private static void BFS(int start) {
        LinkedList<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start, 0});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentValue = current[0];
            int currentStep = current[1];
            visited[currentValue] = true;
            if (currentValue == k) min = Math.min(min, currentStep);

            if (currentValue * 2 <= max && !visited[currentValue * 2]) queue.offer(new int[]{currentValue * 2, currentStep});
            if (currentValue + 1 <= max && !visited[currentValue + 1]) queue.offer(new int[]{currentValue + 1, currentStep + 1});
            if (currentValue - 1 >= 0 && !visited[currentValue - 1]) queue.offer(new int[]{currentValue - 1, currentStep + 1});
        }
    }
}
