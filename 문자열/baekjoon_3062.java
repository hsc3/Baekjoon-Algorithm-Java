import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [3062] 수 뒤집기
 * Bronze 2
 * https://www.acmicpc.net/problem/3062
 */
public class baekjoon_3062 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer;

        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0 ; i < T ; i++) {
            String num = String.valueOf(bufferedReader.readLine());
            stringBuffer = new StringBuffer(num);
            String data = String.valueOf(Integer.valueOf(num) + Integer.valueOf(stringBuffer.reverse().toString()));
            stringBuffer = new StringBuffer(data);
            String reversedData = stringBuffer.reverse().toString();

            if (data.equals(reversedData)) {
                stringBuilder.append("YES\n");
            } else {
                stringBuilder.append("NO\n");
            }
        }

        System.out.println(stringBuilder);
    }
}
