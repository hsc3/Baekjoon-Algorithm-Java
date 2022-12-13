import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [10824] 네 수
 * Bronze 3
 * https://www.acmicpc.net/problem/10824
 */
public class baekjoon_10824 {

    public static void main(String[] args) throws IOException {

        long answer = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        String A = stringTokenizer.nextToken();
        String B = stringTokenizer.nextToken();
        String C = stringTokenizer.nextToken();
        String D = stringTokenizer.nextToken();
        answer = Long.parseLong(A + B) + Long.parseLong(C + D);

        System.out.println(answer);
        bufferedReader.close();
    }
}
