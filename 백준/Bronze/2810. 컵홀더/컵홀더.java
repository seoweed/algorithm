import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();
        char[] charArray = line.toCharArray();
        int pointer = 0;
        int result = 1;
        while (pointer < n) {
            if (charArray[pointer] == 'S') {
                result++;
                pointer++;
            } else {
                result++;
                pointer += 2;
            }
        }
        if (result > n) {
            System.out.println(n);
        } else {
            System.out.println(result);
        }
    }
}
