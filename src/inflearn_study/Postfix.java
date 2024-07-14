package inflearn_study;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    // me
    public static void main(String[] args) {
        Postfix T = new Postfix();
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        System.out.println(T.solution(s));
    }
    public int solution(String s) {
        Stack<Integer> num = new Stack<>();
        for (char x : s.toCharArray()) {
            System.out.println(num);
            if (!Character.isDigit(x)) {
                int tmp1 = num.pop();
                int tmp2 = num.pop();
                int calc = 0;
                if (x == '+') calc = tmp2 + tmp1;
                if (x == '-') calc = tmp2 - tmp1;
                if (x == '*') calc = tmp2 * tmp1;
                if (x == '/') calc = tmp2 / tmp1;
                num.add(calc);
            } else {
                num.add(Integer.parseInt(String.valueOf(x)));
            }
        }

        return num.pop();
    }
    // lecture
//    public static void main(String[] args) {
//        Postfix T = new Postfix();
//        Scanner kb = new Scanner(System.in);
//        String s = kb.nextLine();
//        System.out.println(T.solution(s));
//    }
//    public int solution(String s) {
//        int answer = 0;
//        Stack<Integer> num = new Stack<>();
//        for (char x : s.toCharArray()) {
//            if (Character.isDigit(x)) {
//                num.push(x - 48);
//            } else {
//                int rt = num.pop();
//                int lt = num.pop();
//                if (x == '+') num.push(lt + rt);
//                if (x == '-') num.push(lt - rt);
//                if (x == '*') num.push(lt * rt);
//                if (x == '/') num.push(lt / rt);
//            }
//        }
//        answer = num.get(0);
//        return answer;
//    }
}
