package programmers;

import java.util.*;

public class NumberAndString {

    public int solution(String s) {
        int answer = 0;
        return convertStrToNum(s);
    }

    public int convertStrToNum(String s) {
        String currentStr = "";
        List<String> answerList = new ArrayList<>();
        int retNum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                answerList.add(s.substring(i, i + 1));
            } else {
                currentStr += s.substring(i, i + 1);
                String num = convertNumber(currentStr);
                if (!num.equals("NOTHING")) {
                    answerList.add(num);
                    currentStr = "";
                }
            }
        }
        String answer[] = answerList.toArray(new String[answerList.size()]);
        for (int i = (answer.length - 1); i >= 0; i--) {
            retNum += Integer.parseInt(answer[(answer.length - 1) - i]) * (Math.pow(10, i));
        }
        return retNum;
    }

    public String convertNumber(String s) {
        String num = "";
        switch (s) {
            case "zero":
                num = "0";
                break;
            case "one":
                num = "1";
                break;
            case "two":
                num = "2";
                break;
            case "three":
                num = "3";
                break;
            case "four":
                num = "4";
                break;
            case "five":
                num = "5";
                break;
            case "six":
                num = "6";
                break;
            case "seven":
                num = "7";
                break;
            case "eight":
                num = "8";
                break;
            case "nine":
                num = "9";
                break;
            default:
                num = "NOTHING";
                break;
        }
        return num;
    }
}
