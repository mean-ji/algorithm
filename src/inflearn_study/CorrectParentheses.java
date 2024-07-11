package inflearn_study;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParentheses {
    // me
    public static void main(String[] args) {
        CorrectParentheses T = new CorrectParentheses();
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        System.out.println(T.solution(s));
    }

    public String solution(String s) {
        String answer = "YES";
        Stack<Integer> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '(') stack.add(1);
            else if (x == ')') {
                if (stack.size() > 0) stack.pop();
                else return "NO";
            }
        }
        if (stack.size() != 0) {
            answer = "NO";
        }
        return answer;
    }

    // lecture
//    public static void main(String[] args) {
//        CorrectParentheses T = new CorrectParentheses();
//        Scanner kb = new Scanner(System.in);
//        String s = kb.nextLine();
//        System.out.println(T.solution(s));
//    }
//
//    public String solution(String s) {
//        String answer = "YES";
//        Stack<Character> stack = new Stack<>();
//        for (char x : s.toCharArray()) {
//            if (x == '(') stack.push(x);
//            else {
//                if (stack.isEmpty()) return "NO";
//                else stack.pop();
//            }
//        }
//        if (!stack.isEmpty()) return "NO";
//        return answer;
//    }
}
