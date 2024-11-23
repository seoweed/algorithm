import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Integer[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        A = new Integer[n + 1];
        A[0] = 0;
        A[1] = 1;

        System.out.println(fibo(n));
    }

    private static int fibo(int n) {
        if (A[n] == null) {
            A[n] = fibo(n - 1) + fibo(n - 2);
            return A[n];
        }
        return A[n];
    }

}
