import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * [10809] 알파벳 찾기
 * Bronze 5
 * https://www.acmicpc.net/problem/10809
 */
public class baekjoon_10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        int[] dict = new int[26];
        Arrays.fill(dict, -1);

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0 ; i < str.length() ; i++) {
            int n = str.charAt(i) - 97; // str[i] = a -> n = 0
            if (dict[n] == -1) {
                dict[n] = i;
            }
        }

        for (int i = 0 ; i < 26 ; i++) {
            stringBuilder.append(dict[i]).append(" ");
        }

        System.out.println(stringBuilder);
    }
}
