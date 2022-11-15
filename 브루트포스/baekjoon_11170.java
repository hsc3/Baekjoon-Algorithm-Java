import java.io.*;
import java.util.StringTokenizer;

/**
 * [11170] 0의 개수
 * Bronze 1
 * https://www.acmicpc.net/problem/11170
 */
public class baekjoon_11170 {

    public static int countZero(int N, int M) {

        int count = 0;

        for (int i = N ; i <= M ; i++) {
            int num = i;

            if (num == 0) {
                count += 1;
                continue;
            }

            while (num != 0) {
                if (num % 10 == 0) {
                    count += 1;
                }
                num = num / 10; // 1003 -> 100 -> 10 -> 1 -> 0
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0 ; i < T ; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int N = Integer.parseInt(stringTokenizer.nextToken());
            int M = Integer.parseInt(stringTokenizer.nextToken());

            bufferedWriter.write(String.valueOf(countZero(N, M)) + "\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}