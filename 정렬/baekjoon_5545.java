import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon_5545 {

    public static void main(String[] args) throws IOException {

        int answer = 0; // 토핑을 k개 선택했을때, 1원당 열량이 가장 높은 피자를 구한다.

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        int N = Integer.parseInt(bufferedReader.readLine());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int A = Integer.parseInt(stringTokenizer.nextToken()); // 도우의 가격
        int B = Integer.parseInt(stringTokenizer.nextToken()); // 토핑의 가격
        int C = Integer.parseInt(bufferedReader.readLine()); // 도우의 열량

        List<Integer> D = new ArrayList<>(); // 토핑의 열량
        for (int k = 0 ; k < N ; k++) {
            D.add(Integer.parseInt(bufferedReader.readLine()));
        }

        D.sort(Collections.reverseOrder()); // 내림차순 정렬

        for (int k = 0 ; k <= N ; k++) { // k개의 토핑 선택 (0 <= k <= N)
            int calories = C; // 총 열량 = 도우의 열량 + k개의 토핑의 열량
            for (int i = 0 ; i < k ; i++) {
                calories += D.get(i);
            }
            int price = A + (B * k); // 총 가격
            answer = Math.max(answer, calories / price); // 최대값 갱신
        }

        System.out.println(answer);
        bufferedReader.close();
    }
}
