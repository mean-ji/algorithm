package programmers;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class OpenChatting {
    public String[] solution(String[] record) {
        String[] answer = {};
        return writeRecord(record);
    }

    public String[] writeRecord(String[] record) {
        String[] answer = {};
        List<String> answerList = new ArrayList<>();
        Map<String, String> nickName = new HashMap<>();
        List<Map<String, String>> tempRecord = new ArrayList<>();

        for (int i = 0; i < record.length; i++) {
            String[] one = record[i].split(" ");

            if (one[0].equals("Enter") || one[0].equals("Leave")) {
                Map<String, String> tempRecordElement = new HashMap<>();
                tempRecordElement.put(one[0], one[1]);
                tempRecord.add(tempRecordElement);
            }

            if (one[0].equals("Enter") || one[0].equals("Change")) {
                nickName.put(one[1], one[2]);
            }
        }

        for (int i = 0; i < tempRecord.size(); i++) {
            String resultStr = "";
            for (Map.Entry<String, String> elem : tempRecord.get(i).entrySet()) {
                resultStr += nickName.get(elem.getValue()) + "님이 ";
                resultStr += elem.getKey().equals("Enter") ? "들어왔습니다." : "나갔습니다.";
            }
            answerList.add(resultStr);
        }
        return answerList.toArray(answer);
    }
}

