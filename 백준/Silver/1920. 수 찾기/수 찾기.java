import java.io.*;
import java.util.*;

public class Main {
    static long[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        A = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(A);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            System.out.println(BinarySearch(Long.parseLong(st.nextToken())));
        }
    }
    private static int BinarySearch(long i) {
        int s = 0;
        int e = A.length - 1;
        while (s <= e) {
            int center = (s + e) / 2;
            if (A[center] > i) {
                e = center - 1;
            } else if (A[center] < i) {
                s = center + 1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}
