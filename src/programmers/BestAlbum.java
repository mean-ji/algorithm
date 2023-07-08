package programmers;

import java.util.*;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays) {
        return makeAlbum(genres, plays);
    }

    public int[] makeAlbum(String[] genres, int[] plays) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        // 1. 많이 재생된 장르 리스트 생성
        for (int i = 0; i < genres.length; i++) {
            int playCnt = map.getOrDefault(genres[i], 0) + plays[i];
            map.put(genres[i], playCnt);
        }

        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));


        // 2. 장르 내에서 많이 재생된 노래 수록
        for (Map.Entry<String, Integer> entry : entryList) {
            Map<Integer, Integer> gernesMap = new HashMap<>();

            for (int i = 0; i < genres.length; i++) {
                if (entry.getKey().equals(genres[i])) {
                    gernesMap.put(i, plays[i]);
                }
            }
            List<Map.Entry<Integer, Integer>> entryGList = new LinkedList<>(gernesMap.entrySet());
            entryGList.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
            int count = 0;
            for (Map.Entry<Integer, Integer> entryG : entryGList) {
                if (count < 2) {
                    answer.add(entryG.getKey());
                }
                count++;
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
