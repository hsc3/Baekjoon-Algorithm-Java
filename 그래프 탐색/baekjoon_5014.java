import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * [5014] 스타트링크
 * Silver 1
 * https://www.acmicpc.net/problem/5014
 */
public class baekjoon_5014 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int F = Integer.parseInt(stringTokenizer.nextToken());
        int S = Integer.parseInt(stringTokenizer.nextToken());
        int G = Integer.parseInt(stringTokenizer.nextToken());
        int U = Integer.parseInt(stringTokenizer.nextToken());
        int D = Integer.parseInt(stringTokenizer.nextToken());

        int[] visited = new int[F+1]; // 층별 엘리베이터를 탄 횟수
        Arrays.fill(visited, 0);
        visited[S] = 1;

        Queue<Integer> queue = new ArrayDeque<>(); // Deque 사용
        queue.add(S);

        while (!queue.isEmpty()) {
            int stair = queue.poll(); // 맨 앞의 원소 pop
            if (stair == G) {
                break;
            }

            if (stair + U <= F && visited[stair + U] == 0) { // 윗층 이동
                visited[stair + U] = visited[stair] + 1;
                queue.add(stair + U);
            }
            if (stair - D >= 1 && visited[stair - D] == 0) { // 아랫층 이동
                visited[stair - D] = visited[stair] + 1;
                queue.add(stair - D);
            }
        }

        if (visited[G] == 0) {
            System.out.println("use the stairs");
        } else {
            System.out.println(visited[G] - 1);
        }
    }
}
