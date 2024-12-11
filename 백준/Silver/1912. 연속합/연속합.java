import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] A;
    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        A = new int[n + 1];
        dp = new long[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        long ans = -1000;
        for (int i = 1; i < n + 1; i++) {
            if (A[i] > ans) {
                ans = A[i];
            }
        }

        if (ans > 0) {
            for (int i = 1; i < n + 1; i++) {
                dp[i] = Math.max(0, dp[i - 1] + A[i]);
            }
            long max = 0;
            for (int i = 1; i < n + 1; i++) {
                if (dp[i] > max) {
                    max = dp[i];
                }
            }
            ans = max;
        }
        System.out.println(ans);
    }
}
