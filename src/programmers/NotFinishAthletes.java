package programmers;
import java.util.Arrays;

public class NotFinishAthletes {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 1. 두 배열 모두 알파벳 순으로 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 2. 비교하며 서로 다를 때, participant return
        for (int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
            // 타 블로그 풀이를 보니 여기까지 왔다는 것은 마지막 주자가 완주하지 못했다는 의미이다 로 풀었음
            // return participant[i];
        }

        return answer.equals("") ? participant[participant.length - 1] : answer;
    }
}
