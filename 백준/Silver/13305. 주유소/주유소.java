import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] streetLen = new long[n - 1];
        long[] literPerPrice = new long[n - 1];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            streetLen[i] = Long.parseLong(st1.nextToken());
            literPerPrice[i] = Long.parseLong(st2.nextToken());
        }
        long minPrice = literPerPrice[0];
        long res = minPrice * streetLen[0];

        for (int i = 1; i < n - 1; i++) {
            if (minPrice >= literPerPrice[i]) {
                minPrice = literPerPrice[i];
            }
            res += minPrice * streetLen[i];
        }
        System.out.println(res);
    }
}