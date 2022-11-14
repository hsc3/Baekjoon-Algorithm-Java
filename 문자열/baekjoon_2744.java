import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [2744] 대소문자 바꾸기
 * Bronze 5
 * https://www.acmicpc.net/problem/2744
 */
public class baekjoon_2744 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] str = bufferedReader.readLine().toCharArray();

        for (int i = 0 ; i < str.length ; i++) {
            if (str[i] >= 'a' && str[i] <= 'z') {
                str[i] -= 32;
            } else if (str[i] >= 'A' && str[i] <= 'Z') {
                str[i] += 32;
            }
        }
        System.out.println(str);
    }
}
