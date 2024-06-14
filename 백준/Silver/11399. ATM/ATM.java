import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int sum = A[0];
        int res = A[0];
        for (int i = 1; i < A.length; i++) {
            sum += A[i];
            res += sum;
        }
        System.out.println(res);
    }
}
