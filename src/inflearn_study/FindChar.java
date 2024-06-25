package inflearn_study;

import java.util.*;

public class FindChar {
    // me
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String findStr = sc.next();

        System.out.println(solution(str, findStr));
    }

    public static int solution(String str, String findStr) {
        int count = 0;

        for (String s : str.toLowerCase().split("")) {
            if (s.equals(findStr.toLowerCase())) {
                count++;
            }
        }

        return count;
    }

//    // lecture
//    public static void main(String[] args) {
//        FindChar T = new FindChar();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//        char c = kb.next().charAt(0);
//
//        System.out.println(T.solution(str, c));
//    }
//
//    public int solution(String str, char c) {
//        int answer = 0;
//        str = str.toLowerCase();
//        c = Character.toLowerCase(c);
//
//        for (char s: str.toCharArray()) {
//            if (s == c) answer++;
//        }
//
//        return answer;
//    }
}
