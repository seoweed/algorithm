import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pqUp = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pqDown = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input > 0) {
                pqUp.offer(input);
            } else {
                pqDown.offer(input);
            }
        }

        int result = 0;
        while (!pqUp.isEmpty()) {
            if (pqUp.size() == 1) {
                result += pqUp.poll();
                break;
            }

            int a = pqUp.poll();
            int b = pqUp.poll();

            if (a == 1 || b == 1) {
                result += a + b;
            } else {
                result += a * b;
            }
        }

        while (!pqDown.isEmpty()) {
            if (pqDown.size() == 1) {
                result += pqDown.poll();
                break;
            }
            result += pqDown.poll() * pqDown.poll();
        }

        System.out.println(result);
    }
}
