import java.io.*;
import java.util.StringTokenizer;

/**
 * [2702] 초6 수학
 * Bronze 2
 * https://www.acmicpc.net/problem/2702
 */
public class baekjoon_2702 {
    //최대공약수
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
    //최소공배수
    public static int LCM(int a, int b) {
        int i = 1;
        while (true) {
            if ((a * i) % b == 0) {
                return a * i;
            }
            i += 1;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0 ; i < T ; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            bufferedWriter.write(String.valueOf(LCM(a, b)) + " " + String.valueOf(GCD(a, b)) + "\n");
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}