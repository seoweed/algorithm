import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.offer(Long.parseLong(br.readLine()));
        }

        long sum = 0;
        while (pq.size() > 1) {
            Long a = pq.poll();
            Long b = pq.poll();
            sum += a + b;
            pq.offer(a + b);

        }

        System.out.println(sum);
    }
}
