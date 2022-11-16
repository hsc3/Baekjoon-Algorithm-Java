import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [22864] 피로도
 * Bronze 2
 * https://www.acmicpc.net/problem/22864
 */
public class baekjoon_22864 {

    public static void main(String[] args) throws IOException {

        int tiredness = 0; // 피로도
        int answer = 0; // 일의 양
        int hour = 0;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] data = bufferedReader.readLine().split(" ");
        int A = Integer.parseInt(data[0]);
        int B = Integer.parseInt(data[1]);
        int C = Integer.parseInt(data[2]);
        int M = Integer.parseInt(data[3]);

        while (hour < 24) {
            if (tiredness + A > M) { // 피로도가 M을 넘는 경우 -> 쉬어야 한다.
                if (C <= tiredness) {
                    tiredness -= C;
                } else {
                    tiredness = 0;
                }
            } else { // 피로도가 M을 넘지 않는 경우 -> 일을 한다.
                tiredness += A;
                answer += B;
            }

            hour += 1;
        }

        System.out.println(answer);
    }
}