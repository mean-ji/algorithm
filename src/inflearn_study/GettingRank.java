package inflearn_study;

import java.util.Arrays;
import java.util.Scanner;

public class GettingRank {
    // me
    public static void main(String[] args) {
        GettingRank T = new GettingRank();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int i : T.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        int[] tmp = new int[n];
        for (int i = 0; i < n; i++) {
            tmp[i] = arr[i];
        }
        Arrays.sort(tmp);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == tmp[j]) answer[i] = n - j;
            }
        }

        return answer;
    }

    // lecture
//    public static void main(String[] args) {
//        GettingRank T = new GettingRank();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//
//        for (int i : T.solution(n, arr)) {
//            System.out.print(i + " ");
//        }
//    }
//
//    public int[] solution(int n, int[] arr) {
//        int[] answer = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            int cnt = 1;
//            for (int j = 0; j < n; j++) {
//                if (arr[i] < arr[j]) {
//                    cnt++;
//                }
//            }
//            answer[i] = cnt;
//        }
//        return answer;
//    }
}
