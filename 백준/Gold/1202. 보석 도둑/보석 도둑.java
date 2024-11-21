import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Jewel[] jewels = new Jewel[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken()); // 무게
            int value = Integer.parseInt(st.nextToken()); // 가격
            jewels[i] = new Jewel(weight, value);
        }

        int[] bag = new int[k];
        for (int i = 0; i < k; i++) {
            bag[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(jewels, (a, b) -> a.weight - b.weight);
        Arrays.sort(bag);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        long maxValue = 0;
        int index = 0;

        for (int i : bag) {
            while (index < n && jewels[index].weight <= i) {
                pq.add(jewels[index].value);
                index++;
            }

            if (!pq.isEmpty()) {
                maxValue += pq.poll();
            }
        }

        System.out.println(maxValue);


    }

    private static class Jewel {
        int weight, value;

        public Jewel(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }
}
