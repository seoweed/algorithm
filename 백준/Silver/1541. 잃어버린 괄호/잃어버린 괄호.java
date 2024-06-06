import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] A = str.split("-");
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            int num = sumStr(A[i]);
            if (i == 0) {
                ans += num;
            } else {
                ans -= num;
            }
        }
        System.out.println(ans);
    }

    private static int sumStr(String s) {
        String[] arr = s.split("\\+");
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp += Integer.parseInt(arr[i]);
        }
        return temp;
    }
}
