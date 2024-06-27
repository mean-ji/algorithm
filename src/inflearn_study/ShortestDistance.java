package inflearn_study;

import java.util.ArrayList;
import java.util.Scanner;

public class ShortestDistance {
    // me
    public static void main(String[] args) {
        ShortestDistance T = new ShortestDistance();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        String t = kb.next();
        System.out.println(T.solution(s, t));
    }

    public String solution(String s, String t) {
        String answer = "";
        int[] distance = new int[s.length()];
        ArrayList<Integer> indexList = new ArrayList<>();

        // t 의 index 배열 만들기
        for (int i = 0; i < s.length(); i++) {
            String tmp = String.valueOf(s.charAt(i));
            if (t.equals(tmp)) {
                indexList.add(i);
            }
        }

        // index 배열과 각 문자 간의 거리 측정
        for (int i = 0; i < s.length(); i++) {
            int minDis = s.length();
            for (Integer integer : indexList) {
                int tmpDis = Math.abs(integer - i);
                if (minDis > tmpDis) {
                    minDis = tmpDis;
                }
            }
            distance[i] = minDis;
        }

        for (int i : distance) {
            answer = answer.concat(i + " ");
        }

        return answer;
    }

//    // lecture
//    public static void main(String[] args) {
//        ShortestDistance T = new ShortestDistance();
//        Scanner kb = new Scanner(System.in);
//        String s = kb.next();
//        char c = kb.next().charAt(0);
//
//        for (int i : T.solution(s, c)) {
//            System.out.print(i + " ");
//        }
//    }
//
//    public int[] solution(String s, char t) {
//        int[] answer = new int[s.length()];
//        int p = 1000;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == t) {
//                p = 0;
//                answer[i] = p;
//            } else {
//                p ++;
//                answer[i] = p;
//            }
//        }
//
//        p = 1000;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if (s.charAt(i) == t) {
//                p = 0;
//            } else {
//                p ++;
//                answer[i] = Math.min(p, answer[i]);
//            }
//        }
//
//        return answer;
//    }
}
