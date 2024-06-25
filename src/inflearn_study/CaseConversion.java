package inflearn_study;

import java.util.Scanner;

public class CaseConversion {
    public static void main(String[] args) {
        CaseConversion T = new CaseConversion();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer = answer.concat(String.valueOf(Character.toLowerCase(c)));
            } else {
                answer = answer.concat(String.valueOf(Character.toUpperCase(c)));
            }
        }
        return answer;
    }
}
