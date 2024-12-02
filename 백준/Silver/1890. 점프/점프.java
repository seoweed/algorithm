import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] A;
    static long[][] dp;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        dp = new long[n][n];
        A = new int[n][n];

        // 원본 배열 초기화
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = 1;

        // DP 배열 값 채우기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] == 0 || A[i][j] == 0) continue;
                int temp = A[i][j];
                if (j + temp < n) dp[i][j + temp] += dp[i][j];
                if (i + temp < n) dp[i + temp][j] += dp[i][j];
            }
        }

        System.out.println(dp[n - 1][n - 1]); 
    }
}
