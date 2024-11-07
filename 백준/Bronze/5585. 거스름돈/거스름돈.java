import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = 1000 - Integer.parseInt(br.readLine());
        int result = 0;
        int[] A = {500, 100, 50, 10, 5, 1};
        for (int i : A) {
            result += (m / i);
            m = m % i;
        }
        System.out.println(result);
    }
}
