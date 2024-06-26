package inflearn_study;

import java.util.ArrayList;
import java.util.Scanner;

public class FlippingWords {
    // me
    public static void main(String[] args) {
        FlippingWords T = new FlippingWords();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            String str = kb.next();
            strArr[i] = T.solution(str);
        }

        for (String s : strArr) {
            System.out.println(s);
        }
    }

    public String solution(String str) {
        String answer = "";

        for (int i = str.length(); i > 0; i--) {
            answer = answer.concat(str.substring(i - 1, i));
        }

        return answer;
    }

//    // lecture
//    /*
//    string은 replace나 그런 거 할 때 객체가 계속 생성됨,
//    but StringBuilder는 하나로 계속 사용해서 연산이 많아지면
//    메모리 누수면에서 StringBuilder가 더 낫다고 함
//     */
//    public static void main(String[] args) {
//        FlippingWords T = new FlippingWords();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        String[] strArr = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            strArr[i] = kb.next();
//        }
//
//        for (String x : T.solution(strArr)) {
//            System.out.println(x);
//        }
//    }
//
//    public ArrayList<String> solution(String[] str) {
//        ArrayList<String> answer = new ArrayList<>();
//        for (String x : str) {
//            String s = new StringBuilder(x).reverse().toString();
//            answer.add(s);
//        }
//
//        return answer;
//    }

//    // lecture - reverse 직접 구현
//    public static void main(String[] args) {
//        FlippingWords T = new FlippingWords();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        String[] strArr = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            strArr[i] = kb.next();
//        }
//
//        for (String x : T.solution(strArr)) {
//            System.out.println(x);
//        }
//    }
//
//    public ArrayList<String> solution(String[] str) {
//        ArrayList<String> answer = new ArrayList<>();
//        for (String x : str) {
//            char[] s = x.toCharArray();
//            int lt = 0;
//            int rt = x.length() - 1;
//            while (lt < rt) {
//                char tmp = s[lt];
//                s[lt] = s[rt];
//                s[rt] = tmp;
//                lt ++;
//                rt--;
//            }
//            String tmp = String.valueOf(s);
//            answer.add(tmp);
//        }
//
//        return answer;
//    }
}
