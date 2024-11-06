import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] A = new int[3];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        int a = 300;
        int b = 60;
        int c = 10;

        if (t >= a) {
            A[0] = t / a;
            t = t % a;
        }
        if (t >= b) {
            A[1] = t / b;
            t = t % b;
        }
        if (t >= c) {
            A[2] = t / c;
            t = t % c;
        }

        if (t != 0) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.print(A[i] + " ");
            }
        }


    }
}
