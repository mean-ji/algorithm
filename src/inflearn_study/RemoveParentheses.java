package inflearn_study;

import java.util.Scanner;
import java.util.Stack;

public class RemoveParentheses {
    // me
    public static void main(String[] args) {
        RemoveParentheses T = new RemoveParentheses();
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        System.out.println(T.solution(s));
    }
    public String solution(String s) {
        String answer = "";
        Stack<Integer> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '(') stack.add(1);
            else if (x == ')') stack.pop();
            else {
                if (stack.size() == 0) answer += x;
            }
        }
        return answer;
    }

    // lecture
//    public static void main(String[] args) {
//        RemoveParentheses T = new RemoveParentheses();
//        Scanner kb = new Scanner(System.in);
//        String s = kb.nextLine();
//        System.out.println(T.solution(s));
//    }
//    public String solution(String s) {
//        String answer = "";
//        Stack<Character> stack = new Stack<>();
//        for (char x : s.toCharArray()) {
//            if (x == ')') {
//                while (stack.pop() == '(') stack.pop();
//            } else stack.push(x);
//        }
//        for (char x : stack) answer += x;
//        return answer;
//    }
}
