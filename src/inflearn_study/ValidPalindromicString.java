package inflearn_study;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidPalindromicString {
    // me
    public static void main(String[] args) {
        ValidPalindromicString T = new ValidPalindromicString();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = "YES";
        str = str.toLowerCase();
        char[] cArr = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (rt > lt) {
            if (!Character.isAlphabetic(cArr[lt])) lt++;
            else if (!Character.isAlphabetic(cArr[rt])) rt--;
            else {
                if (cArr[lt] != cArr[rt]) {
                    answer = "NO";
                    break;
                } else {
                    lt++;
                    rt--;
                }
            }
        }

        return answer;
    }

//    // lecture
//    public static void main(String[] args) {
//        ValidPalindromicString T = new ValidPalindromicString();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.nextLine();
//        System.out.println(T.solution(str));
//    }
//
//    public String solution(String str) {
//        String answer = "NO";
//        str = str.toUpperCase().replaceAll("[^A-Z]", "");
//        String tmp = new StringBuilder(str).reverse().toString();
//
//        if (str.equals(tmp)) answer = "YES";
//        return answer;
//    }
}
