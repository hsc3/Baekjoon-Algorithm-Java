import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * [16435] 스네이크버드
 * Silver 5
 * https://www.acmicpc.net/problem/16435
 */
public class baekjoon_16435 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken()); // 과일의 길이
        int L = Integer.parseInt(stringTokenizer.nextToken()); // 스네이크버드의 초기 길이

        String[] data = bufferedReader.readLine().split(" ");
        int[] fruits = new int[N];
        for (int i = 0 ; i < N ; i++) {
            fruits[i] = Integer.parseInt(data[i]);
        }

        Arrays.sort(fruits); // 오름차순 정렬
        for (int i = 0 ; i < N ; i++) {
            if (L >= fruits[i]) { // 몸의 길이 이하의 높이에 과일이 있으면 먹는다.
                L += 1;
            }
        }

        System.out.println(L);
        bufferedReader.close(); 
    }
}
