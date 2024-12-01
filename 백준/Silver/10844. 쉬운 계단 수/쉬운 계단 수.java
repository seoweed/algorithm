import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static long[][] dp;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new long[n + 1][12];

        // dp 초기화
        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }

        // dp 배열 값 추가
        for (int i = 2; i < n + 1; i++) {
            for (int j = 1; j < 11; j++) {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
            }
        }

        // 결과 값 계산
        long sum = Arrays.stream(dp[n]).sum();
        System.out.println(sum % 1000000000);

    }
}
