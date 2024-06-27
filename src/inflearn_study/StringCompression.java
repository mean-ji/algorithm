package inflearn_study;

import java.util.ArrayList;
import java.util.Scanner;

public class StringCompression {
    // me
//    public static void main(String[] args) {
//        StringCompression T = new StringCompression();
//        Scanner kb = new Scanner(System.in);
//        String s = kb.next();
//        System.out.println(T.solution(s));
//    }
//
//    public String solution(String s) {
//        String answer = "";
//        int count = 1;
//        char cur = s.charAt(0);
//        ArrayList<String> arr = new ArrayList<>();
//
//        for (int i = 1; i < s.length(); i++) {
//            if (s.charAt(i) == cur) {
//                count++;
//            } else {
//                arr.add(String.valueOf(cur));
//                if (count > 1) {
//                    arr.add(String.valueOf(count));
//                }
//                count = 1;
//                cur = s.charAt(i);
//            }
//        }
//
//        // 마지막 문자 처리
//        arr.add(String.valueOf(cur));
//        if (count > 1) {
//            arr.add(String.valueOf(count));
//        }
//
//        answer = String.join("", arr);
//
//        return answer;
//    }

    // lecture
    public static void main(String[] args) {
        StringCompression T = new StringCompression();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }

    public String solution(String s) {
        String answer = "";
        s = s + " ";
        int cnt = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) cnt++;
            else {
                answer += s.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }


        return answer;
    }
}
