package inflearn_study;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteSameWord {
    // me
    public static void main(String[] args) {
        DeleteSameWord T = new DeleteSameWord();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        String[] sArr = str.split("");
        ArrayList<String> tmp = new ArrayList<>();

        for (String c : sArr) {
            if (!tmp.contains(c)) {
                tmp.add(c);
                answer = answer.concat(c);
            }
        }

        return answer;
    }

//    //lecture
//    public static void main(String[] args) {
//        DeleteSameWord T = new DeleteSameWord();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//        System.out.println(T.solution(str));
//    }
//
//    public String solution(String str) {
//        String answer = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (i == str.indexOf(str.charAt(i))) answer += str.charAt(i);
//        }
//
//        return answer;
//    }
}
