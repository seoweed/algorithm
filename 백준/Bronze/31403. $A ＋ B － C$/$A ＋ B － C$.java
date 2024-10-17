import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a + b - c);
        String d = String.valueOf(a);
        String e = String.valueOf(b);
        System.out.println(Integer.parseInt(d + e) - c);
    }
}