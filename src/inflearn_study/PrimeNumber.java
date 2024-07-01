package inflearn_study;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    // me
//    public static void main(String[] args) {
//        PrimeNumber T = new PrimeNumber();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        System.out.println(T.solution(n).size());
//    }
//
//    public ArrayList<Integer> solution(int n) {
//        ArrayList<Integer> answer = new ArrayList<>();
//        answer.add(2);
//
//        for (int i = 2; i < n; i++) {
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) break;
//                else if (j == i - 1) answer.add(i);
//            }
//        }
//
//        return answer;
//    }

    // lecture
    public static void main(String[] args) {
        PrimeNumber T = new PrimeNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j += i) {
                    ch[j] = 1;
                }
            }
        }

        return answer;
    }
}
