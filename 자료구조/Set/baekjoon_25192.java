import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * [25192] 인사성 밝은 곰곰이
 * Silver 4
 * https://www.acmicpc.net/problem/25192
 */
public class baekjoon_25192 {

    public static void main(String[] args) throws Exception {

        int answer = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        Set<String> user = new HashSet<>();

        while (N-- > 0) {
            String data = bufferedReader.readLine();
            if (data.equals("ENTER")) { // 새로운 사람이 들어오면, 곰곰이 이모티콘을 사용한 횟수 누적
                answer += user.size();
                user.clear();
            } else { // 채팅을 친 유저를 한 번만 추가 (곰곰이 이모티콘을 사용한 횟수)
                user.add(data);
            }
        }

        answer += user.size();
        System.out.println(answer);
    }
}