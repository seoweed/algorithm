import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] Strings = new String[n];
        for (int i = 0; i < n; i++) {
            Strings[i] = br.readLine();
        }

        // 가중치 계산
        Map<Character, Integer> weightMap = new HashMap<>();
        for (String line : Strings) {
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                int weight = (int) Math.pow(10, line.length() - 1 - i);
                weightMap.put(ch, weight + weightMap.getOrDefault(ch, 0));
            }
        }

        // 가중치 정렬
        ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(weightMap.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());

        // 수 대입
        int num = 9;
        HashMap<Character, Integer> resultMap = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : entries) {
            resultMap.put(entry.getKey(), num--);
        }

        // 결과 도출
        int result = 0;
        for (String string : Strings) {
            int temp = 0;
            for (char ch : string.toCharArray()) {
                temp = temp * 10 + resultMap.get(ch);
            }
            result += temp;
        }

        System.out.println(result);
    }
}