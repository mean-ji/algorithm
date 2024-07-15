package inflearn_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Curriculum {
    // me
    public static void main(String[] args) {
        Curriculum T = new Curriculum();
        Scanner kb = new Scanner(System.in);
        String s1 = kb.nextLine();
        String s2 = kb.nextLine();
        System.out.println(T.solution(s1, s2));
    }
    public String solution(String s1, String s2) {
        String answer = "YES";
        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();
        for (char x : s1.toCharArray()) q1.add(x);
        for (char x : s2.toCharArray()) q2.add(x);

        Character t1 = q1.poll();
        for (int i = 0; i < q2.size(); i++) {
            Character t2 = q2.poll();
            if (q1.contains(t2)) return "NO";
            else if (t1 == t2) t1 = q1.poll();
        }
        if (q1.size() > 0) return "NO";

        return answer;
    }
    // lecture
//    public static void main(String[] args) {
//        Curriculum T = new Curriculum();
//        Scanner kb = new Scanner(System.in);
//        String s1 = kb.next();
//        String s2 = kb.next();
//        System.out.println(T.solution(s1, s2));
//    }
//    public String solution(String need, String plan) {
//        String answer = "YES";
//        Queue<Character> q1 = new LinkedList<>();
//        for (char x : need.toCharArray()) q1.offer(x);
//        for (char x : plan.toCharArray()) {
//            if (q1.contains(x)) {
//                if (x != q1.poll()) return "NO";
//            }
//        }
//        if (!q1.isEmpty()) return "NO";
//
//        return answer;
//    }
}
