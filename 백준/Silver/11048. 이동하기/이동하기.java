import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[][] A, dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        dp = new int[n + 1][m + 1];
        A = new int[n + 1][m + 1];

        // 원본 배열 초기화
        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < m + 1; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[1][1] = A[1][1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                int temp = Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
                int max = Math.max(temp, dp[i][j - 1]);
                dp[i][j] = max + A[i][j];
            }
        }

        System.out.println(dp[n][m]);
    }
}
