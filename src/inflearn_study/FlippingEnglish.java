package inflearn_study;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FlippingEnglish {
    // me
    public static void main(String[] args) {
        FlippingEnglish T = new FlippingEnglish();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        char[] cArr = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;

        while (rt - lt > 0) {
            while (!Pattern.matches("^[a-zA-Z]*$", String.valueOf(cArr[lt]))) {
                lt++;
            }
            while (!Pattern.matches("^[a-zA-Z]*$", String.valueOf(cArr[rt]))) {
                rt--;
            }

            char tmp = cArr[lt];
            cArr[lt] = cArr[rt];
            cArr[rt] = tmp;
            lt++;
            rt--;
        }

        answer = String.valueOf(cArr);

        return answer;
    }

//    // lecture
//    public static void main(String[] args) {
//        FlippingEnglish T = new FlippingEnglish();
//        Scanner kb = new Scanner(System.in);
//        String str = kb.next();
//        System.out.println(T.solution(str));
//    }
//
//    public String solution(String str) {
//        String answer = "";
//        int lt = 0, rt = str.length() - 1;
//        char[] s = str.toCharArray();
//
//        while (rt > lt) {
//            if (!Character.isAlphabetic(s[lt])) lt++;
//            else if (!Character.isAlphabetic(s[rt])) rt--;
//            else {
//                char tmp = s[lt];
//                s[lt] = s[rt];
//                s[rt] = tmp;
//                lt++;
//                rt--;
//            }
//        }
//        answer = String.valueOf(s);
//
//        return answer;
//    }
}
