package inflearn_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavePrincess {
    // me
    public static void main(String[] args) {
        SavePrincess T = new SavePrincess();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(T.solution(n, k));
    }
    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (i % k != 0) {
                q.add(i);
                idx++;
            } else idx = 0;
        }
        while (q.size() != 1) {
            System.out.println(idx + " " + q);
            if ((idx + 1) % k == 0) {
                idx = 0;
            } else {
                q.add(q.peek());
                idx++;
            }
            q.remove();
        }
        answer = q.peek();
        return answer;
    }
    // lecture
//    public static void main(String[] args) {
//        SavePrincess T = new SavePrincess();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int k = kb.nextInt();
//        System.out.println(T.solution(n, k));
//    }
//    public int solution(int n, int k) {
//        int answer = 0;
//        Queue<Integer> q = new LinkedList<>();
//        for (int i = 1; i <= n; i++) q.add(i);
//        while (!q.isEmpty()) {
//            for (int i = 1; i < k; i++) q.offer(q.poll());
//            q.poll();
//            if (q.size() == 1) {
//                answer = q.poll();
//            }
//        }
//        return answer;
//    }
}
