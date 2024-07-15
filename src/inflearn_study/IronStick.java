package inflearn_study;

import java.util.Scanner;
import java.util.Stack;

public class IronStick {
    // me
    public static void main(String[] args) {
        IronStick T = new IronStick();
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        System.out.println(T.solution(s));
    }
    public int solution(String s) {
        int answer = 0;
        int r = 0, stick = 0;
        Stack<Character> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '(' && !stack.isEmpty() &&  stack.peek() == '(') {
                // 레이저 초기화 및 쇠막대기 추가
                r = 0;
                stick++;
            } else if (x == ')' && stack.peek() == '(') {
                // 레이저인 경우
                r++;
                if (stick > 0) answer += stick; // 쇠 막대기가 있으면 자르고 개수 추가
            } else if ( x == ')' && stack.peek() == ')') {
                // 쇠막대기 하나 감소 -> 남은 한 조각 더해주기
                stick--;
                answer++;
            }
            stack.push(x);
        }
        return answer;
    }
    // lecture
//    public static void main(String[] args) {
//        IronStick T = new IronStick();
//        Scanner kb = new Scanner(System.in);
//        String s = kb.nextLine();
//        System.out.println(T.solution(s));
//    }
//    public int solution(String s) {
//        int answer = 0;
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(') stack.push('(');
//            else {
//                stack.pop();
//                if (s.charAt(i - 1) == '(') {
//                    answer += stack.size();
//                } else {
//                    answer++;
//                }
//            }
//        }
//        return answer;
//    }
}
