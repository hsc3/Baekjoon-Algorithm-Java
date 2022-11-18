import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * [25305] 커트라인
 * Bronze 2
 * https://www.acmicpc.net/problem/25305
 */
public class baekjoon_25305 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        // string 배열 -> int 배열
        int[] score = new int[N];
        String[] data = bufferedReader.readLine().split(" ");
        for (int i = 0 ; i < N ; i++) {
            score[i] = Integer.parseInt(data[i]);
        }

        Arrays.sort(score); // 오름차순 정렬
        System.out.println(score[N-K]);
        bufferedReader.close();
    }
}
