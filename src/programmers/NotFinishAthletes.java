package programmers;
import java.util.Arrays;

public class NotFinishAthletes {
    public String solution(String[] participant, String[] completion) {
        /**
         * 방법1. loop로 간단하게 구현
         */
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

        /**
         * 방법2. HashMap 사용
         */
        /**
         * String answer = "";
         * HashMap<String, Integer> map = new HashMap<>();
         * for (String player : participant)
         *     map.put(player, map.getOrDefault(ployer, 0) + 1);
         * for (String player : completion)
         *     map.put(player, map.get(ployer) - 1);
         * Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
         *
         * while(iter.hashNext()) {
         *     Map.Entry<String, Integer> entry = iter.next();
         *     if (entry.getValue() != 0) {
         *         answer = entry.getKey();
         *         break;
         *     }
         * }
         * return answer;
         */
    }
}
