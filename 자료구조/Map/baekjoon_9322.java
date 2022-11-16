import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * [9322] 철벽 보안 알고리즘
 * Silver 4
 * https://www.acmicpc.net/problem/9322
 */
public class baekjoon_9322 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;
        int idx = 0;

        int T = Integer.parseInt(bufferedReader.readLine());

        while (T-- > 0) {

            int N = Integer.parseInt(bufferedReader.readLine());

            stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 제 1 공개키
            Map<String, Integer> map = new HashMap<>();
            idx = 0;
            while (stringTokenizer.hasMoreTokens()) {
                map.put(stringTokenizer.nextToken(), idx++);
            }

            stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 제 2 공개키
            int[] pattern = new int[N]; // 평문 <-> 암호문 패턴
            idx = 0;
            while (stringTokenizer.hasMoreTokens()) {
                pattern[idx++] = map.get(stringTokenizer.nextToken());
            }

            stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 암호문
            String[] normal = new String[N]; // 평문
            idx = 0;
            while (stringTokenizer.hasMoreTokens()) {
                normal[pattern[idx++]] = stringTokenizer.nextToken();
            }

            for (int i = 0 ; i < N ; i++) {
                stringBuilder.append(normal[i]).append(" ");
            }
            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder);
        bufferedReader.close();
    }
}
