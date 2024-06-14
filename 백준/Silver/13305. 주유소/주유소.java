import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] streetLen = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n; i++) {
            streetLen[i] = Integer.parseInt(st.nextToken());
        }
        int[] literPerPrice = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            literPerPrice[i] = Integer.parseInt(st.nextToken());
        }
        int len = 0;
        int startIdx = 0;
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            len += streetLen[i + 1];
            if (literPerPrice[i] >= literPerPrice[i + 1]) {
                res += literPerPrice[startIdx] * len;
                startIdx = i + 1;
                len = 0;
            }
        }
        System.out.println(res);
    }
}
