import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] s = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(st.nextToken());
        }
        // 정렬
        int[] array = Arrays.stream(s).sorted().toArray();
        int i = 0, j = n-1, count = 0;
        while(i < j) {
            int sum = array[i] + array[j];
            if (sum == m) { count++; i++; j--; }
            else if (sum < m) i++;
            else j--;
        }
        System.out.println(count);
    }
}