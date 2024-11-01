import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] A;
    static int sum;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        A = new int[9];

        for (int i = 0; i < 9; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 9; i++) {
            sum += A[i];
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - A[i] - A[j] == 100) {
                    A[i] = 0;
                    A[j] = 0;

                    Arrays.sort(A);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(A[k]);
                    }
                    return;
                }
            }
        }
    }
}
