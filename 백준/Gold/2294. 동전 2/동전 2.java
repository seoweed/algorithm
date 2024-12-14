import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int n, k;
    static Set<Integer> A;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        A = new HashSet<>();
        dp = new int[k + 1];

        // A 배열 초기화
        for (int i = 0; i < n; i++) {
            A.add(Integer.parseInt(br.readLine()));
        }

        // dp 배열 초기화
        int max = k + 1;
        for (int i = 1; i < k + 1; i++) {
            dp[i] = max;
        }

        // dp 값 채우기
        for (int coin : A) {
            for (int i = 1; i < k + 1; i++) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        int ans = dp[k];
        if (ans == max) {
            ans = -1;
        }
        System.out.println(ans);
    }
}
