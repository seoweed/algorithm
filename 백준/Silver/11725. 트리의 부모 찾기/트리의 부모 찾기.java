import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        A = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            A[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            A[a].add(b);
            A[b].add(a);
        }
        visited = new boolean[N + 1];
        result = new int[N + 1];
        DFS(1);
        for (int i = 2; i <= N; i++) {
            System.out.println(result[i]);
        }
    }
    private static void DFS(int v) {
        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) {
                result[i] = v;
                DFS(i);
            }
        }
    }
}

