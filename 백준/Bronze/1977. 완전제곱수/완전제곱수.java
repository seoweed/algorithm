import java.io.*;
import java.util.*;

public class Main {
    static int m, n;
    static ArrayList<Integer> result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        result = new ArrayList<>();
        m = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());

        for (int i = 1; i * i <= n; i++) {
            if (m <= i * i) result.add(i * i);
        }

        if (result.isEmpty()) {
            System.out.println(-1);
            return;
        }
        int sum = 0;
        for (int i : result) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(result.get(0));
    }
}
