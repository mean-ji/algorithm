package inflearn_study;

import java.util.Scanner;

public class SecretLetter {
    // me
    public static void main(String[] args) {
        SecretLetter T = new SecretLetter();
        Scanner kb = new Scanner(System.in);
        int cnt = kb.nextInt();
        String s = kb.next();
        System.out.println(T.solution(cnt, s));
    }

    public String solution(int cnt, String s) {
        String answer = "";
        int add = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                add += Math.pow(2, (s.length() / cnt) - ((i % (s.length() / cnt)) + 1));
            }

            if (i % (s.length() / cnt) == (s.length() / cnt) - 1) {
                // 아스키 코드로 변환
                answer += (char)add;
                add = 0;
            }

        }

        return answer;
    }

//    // lecture
//    public static void main(String[] args) {
//        SecretLetter T = new SecretLetter();
//        Scanner kb = new Scanner(System.in);
//        int cnt = kb.nextInt();
//        String s = kb.next();
//        System.out.println(T.solution(cnt, s));
//    }
//
//    public String solution(int cnt, String s) {
//        String answer = "";
//        int index = s.length() / cnt;
//        for (int i = 0; i < cnt; i ++) {
//            String tmp = s.substring(0, index).replace('#', '1').replace('*', '0');
//            int num = Integer.parseInt(tmp, 2);
//            answer += (char) num;
//            s = s.substring(index);
//        }
//
//        return answer;
//    }
}
