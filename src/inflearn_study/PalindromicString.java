package inflearn_study;

import java.util.Scanner;

public class PalindromicString {
    // me
    public static void main(String[] args) {
        PalindromicString T = new PalindromicString();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = "YES";
        str = str.toLowerCase();
        char[] cArr = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while (rt > lt) {
            if (cArr[lt] != cArr[rt]) {
                answer = "NO";
                break;
            }
            lt++;
            rt--;
        }

        return answer;
    }

//    // lecture
//    public static void main(String[] args) {
//        PalindromicString T = new PalindromicString();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//        System.out.println(T.solution(str));
//    }
//
//    public String solution(String str) {
//        String answer = "YES";
//        str = str.toLowerCase();
//        for (int i = 0; i< str.length() / 2; i++) {
//            if (str.charAt(i) != str.charAt(str.length() -1 - i)) {
//                answer = "NO";
//                break;
//            }
//        }
//
//        return answer;
//    }

//    // lecture
//    public static void main(String[] args) {
//        PalindromicString T = new PalindromicString();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//        System.out.println(T.solution(str));
//    }
//
//    public String solution(String str) {
//        String answer = "YES";
//        String tmp = new StringBuilder(str).reverse().toString();
//        if (!tmp.equalsIgnoreCase(str)) answer = "NO";
//
//        return answer;
//    }
}
