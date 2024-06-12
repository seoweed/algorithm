import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (temp != 0) queue.offer(temp);
            else {
                if (queue.isEmpty()) System.out.println(0);
                else System.out.println(queue.poll());
            }
        }
    }
}

