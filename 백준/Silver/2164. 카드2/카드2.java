import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (queue.size() != 1) {
            queue.poll();
            Integer temp = queue.poll();
            queue.add(temp);
        }
        System.out.println(queue.peek());
    }
}