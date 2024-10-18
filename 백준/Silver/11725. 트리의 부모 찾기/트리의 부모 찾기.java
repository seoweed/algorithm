import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int[] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        visited = new boolean[n + 1];
        A = new ArrayList[n + 1];
        result = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }
        StringTokenizer st;
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        DFS(1);
        for (int i = 2; i < n + 1; i++) {
            System.out.println(result[i]);
        }
    }

    private static void DFS(int v) {
        visited[v] = true;
        for (Integer i : A[v]) {
            if (!visited[i]) {
                result[i] = v;
                DFS(i);
            }
        }
    }
}
