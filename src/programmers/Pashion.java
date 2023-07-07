package programmers;

import java.util.Map;
import java.util.HashMap;

public class Pashion {
    public int solution(String[][] clothes) {
        return countSpyClothType(clothes);
    }

    public Integer countSpyClothType(String[][] clothes) {
        Map<String, Integer> spyClothes = new HashMap<>();
        int answer = 1;

        for (int i = 0; i < clothes.length; i++) {
            int cnt = spyClothes.getOrDefault(clothes[i][1], 0);
            spyClothes.put(clothes[i][1], cnt + 1);
        }

        for (Map.Entry<String, Integer> entry : spyClothes.entrySet()) {
            answer *= entry.getValue() + 1;
        }
        return answer - 1;
    }
}
