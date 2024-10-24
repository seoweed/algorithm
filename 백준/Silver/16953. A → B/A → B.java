import java.io.*;
import java.util.*;

public class Main {
    static int a, b, result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        result = -1;

        BFS(a);

        System.out.println(result);

    }

    private static void BFS(int a) {
        LinkedList<long[]> queue = new LinkedList<>();
        queue.offer(new long[]{a, 1});
        while (!queue.isEmpty()) {
            long[] current = queue.poll();
            long currentValue = current[0];
            long currentStep = current[1];

            if (currentValue == b) {
                result = (int) currentStep;
                break;
            }
            long nx = Long.parseLong(currentValue + "1");
            long ny = currentValue * 2;
            if (nx <= b) {
                queue.offer(new long[]{nx, currentStep + 1});
            }
            if (ny <= b) {
                queue.offer(new long[]{ny, currentStep + 1});
            }
        }
    }
}
