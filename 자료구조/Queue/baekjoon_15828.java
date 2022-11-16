import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * [15828] Router
 * Silver 4
 * https://www.acmicpc.net/problem/15828
 */
public class baekjoon_15828 {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        Queue<Integer> buffer = new LinkedList<>(); // 큐 생성

        while (true) {
            int packet = Integer.parseInt(bufferedReader.readLine());

            if (packet == -1) {
                break;
            } else if (packet == 0) {
                buffer.poll();
            } else if (buffer.size() < N){
                buffer.add(packet);
            }
        }

        if (buffer.isEmpty()) {
            System.out.println("empty");
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            while (!buffer.isEmpty()) {
                stringBuilder.append(buffer.poll()).append(" ");
            }

            System.out.println(stringBuilder);
        }
    }
}