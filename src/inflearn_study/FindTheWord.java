package inflearn_study;

import java.util.Scanner;

public class FindTheWord {
    // me
    public static void  main(String[] args) {
        FindTheWord T = new FindTheWord();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        String[] strArr = str.split(" ");
        int maxLen = 0;

        for (String s : strArr) {
            if (s.length() > maxLen) {
                answer = s;
                maxLen = s.length();
            }
        }

        return answer;
    }

//    // lecture
//    // indexOf()와 substring()으로 푸는 방법
//    public static void main(String[] args) {
//        FindTheWord T = new FindTheWord();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.nextLine();
//        System.out.print(T.solution(str));
//    }
//
//    public String solution(String str) {
//        String answer = "";
//        int m = Integer.MIN_VALUE, pos;
//
//        while ((pos = str.indexOf(" ")) != -1) {
//            String tmp = str.substring(0, pos);
//            int len = tmp.length();
//
//            if (len > m) {
//                m = len;
//                answer = tmp;
//            }
//
//            str = str.substring(pos + 1);
//        }
//
//        // 마지막 단어 처리
//        if (str.length() > m) {
//            answer = str;
//        }
//
//        return answer;
//    }
}
