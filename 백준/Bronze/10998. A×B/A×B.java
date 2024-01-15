import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int inputA = scanner.nextInt();
        int inputB = scanner.nextInt();
        
        int result = inputA * inputB;
        System.out.println(result);
    }
}