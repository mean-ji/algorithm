package inflearn_study;

import java.util.Scanner;

public class ExtractingNumbers {
    // me
    public static void main(String[] args) {
        ExtractingNumbers T = new ExtractingNumbers();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    public int solution(String s) {
        int answer = 0;
        s = s.toUpperCase().replaceAll("[A-Z]", "");
        answer = Integer.parseInt(s);
        return answer;
    }

//    // lecture
//    public static void main(String[] args) {
//        ExtractingNumbers T = new ExtractingNumbers();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//        System.out.println(T.solution(str));
//    }
//
//    public int solution(String s) {
//        int answer = 0;
//        for (char x : s.toCharArray()) {
//            if (x >= 48 && x <= 57) answer = answer * 10 + (x - 48);
//        }
//
//        return answer;
//    }

//    // lecture
//    public static void main(String[] args) {
//        ExtractingNumbers T = new ExtractingNumbers();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//        System.out.println(T.solution(str));
//    }
//
//    public int solution(String s) {
//        String answer = "";
//        for (char x : s.toCharArray()) {
//            if (Character.isDigit(x)) answer += x;
//        }
//
//        return Integer.parseInt(answer);
//    }
}
