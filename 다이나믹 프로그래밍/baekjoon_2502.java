import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * [2502] 떡 먹는 호랑이
 * Silver 2
 * https://www.acmicpc.net/problem/2502
 */
public class baekjoon_2502 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int D = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        int[] dp = new int[D+1];
        Arrays.fill(dp, 0);
        dp[D] = K;

        for (int prev = K / 2 + 1 ; prev < K ; prev++) { // 마지막의 전날에 준 떡의 개수
            dp[D-1] = prev;
            
            for (int i = D ; i > 2 ; i--) {
                if (dp[i] >= 2 * dp[i-1]) { // 성립 불가 (다음날에 더 적은 떡을 준 경우)
                    break;
                } else {
                    dp[i-2] = dp[i] - dp[i-1];
                }
            }
            if (dp[1] != 0) { // 성립한 경우
                break;
            }
        }

        System.out.println(dp[1]);
        System.out.println(dp[2]);
    }
}
