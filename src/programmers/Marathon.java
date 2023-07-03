package programmers;

import java.util.Arrays;

public class Marathon {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 1. 두 배열 모두 알파벳 순으로 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 2. 비교하며 서로 다를 때, participant return
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }

        return answer.equals("") ? participant[participant.length - 1] : answer;
    }
}
