import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int n, m, k;
    static ArrayList<Integer> result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        A = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        result = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        for (int i = 1; i < n + 1; i++) {
            A[i].sort(Comparator.naturalOrder());
        }

        DFS(k);
        result.forEach(i -> {
            System.out.print(i + " ");
        });
        System.out.println();
        visited = new boolean[n + 1];
        result = new ArrayList<>();
        BFS(k);
        result.forEach(i -> {
            System.out.print(i + " ");
        });
    }

    private static void BFS(int v) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(v);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (!visited[current]) {
                visited[current] = true;
                result.add(current);
                for (int i : A[current]) {
                    queue.offer(i);
                }
            }
        }
    }

    private static void DFS(int v) {
        visited[v] = true;
        result.add(v);
        for (int i : A[v]){
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
}
