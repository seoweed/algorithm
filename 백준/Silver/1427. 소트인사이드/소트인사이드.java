import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Integer[] A = new Integer[str.length()];
        for (int i = 0; i < str.length(); i++) {
            A[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        Arrays.sort(A, Collections.reverseOrder());
        for (int i : A) {
            System.out.print(i);
        }
    }
}