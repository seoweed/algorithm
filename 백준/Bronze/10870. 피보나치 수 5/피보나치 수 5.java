import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n + 2];
        A[0] = 0;
        A[1] = 1;

        System.out.println(pibo(n, A));
    }

    private static int pibo(int n, int[] A) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        for (int i = 2; i <= n + 1; i++) {
            A[i] = A[i - 2] + A[i - 1];
        }


        return A[n];
    }
}
