package inflearn_study;

import java.util.Scanner;

public class Fibonacci {
    // me, lecture
    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int i : T.solution(n)) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i - 2] + answer[i - 1];
        }

        return answer;
    }
}
