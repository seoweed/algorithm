import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int m, n;
    static int[][] A, dp;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        A = new int[m + 2][n + 2];
        dp = new int[m + 2][n + 2];

        // A 배열 초기화
        for (int i = 1; i < m + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < n + 1; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // dp 배열 초기화
        for (int i = 0; i < m + 2; i++) {
            for (int j = 0; j < n + 2; j++) {
                dp[i][j] = -1;
            }
        }
        dp[1][1] = 1;

        // dfs 호출
        int ans = DFS(m, n);
        System.out.println(ans);
    }

    private static int DFS(int m, int n) {
        if (dp[m][n] == -1) {
            dp[m][n] = 0;
            for (int i = 0; i < 4; i++) {
                int nm = m + dx[i];
                int nn = n + dy[i];
                if (A[nm][nn] > A[m][n]) {
                    dp[m][n] += DFS(nm, nn);
                }
            }
        }
        return dp[m][n];
    }
}
