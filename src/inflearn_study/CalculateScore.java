package inflearn_study;

import java.util.Scanner;

public class CalculateScore {
    // me
    public static void main(String[] args) {
        CalculateScore T = new CalculateScore();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }

    public int solution(int n, int[] arr) {
        int answer = arr[0];
        int cur = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == 0 && arr[i] == 1) cur = 1;
            else if (arr[i - 1] == 1 & arr[i] == 1) cur++;
            else if (arr[i - 1] == 0 && arr[i] == 0) cur = 0;
            else if (arr[i - 1] == 1 && arr[i] == 0) cur = 0;
            answer += cur;
        }

        return answer;
    }

    // lecture
//    public static void main(String[] args) {
//        CalculateScore T = new CalculateScore();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//        System.out.println(T.solution(n, arr));
//    }
//
//    public int solution(int n, int[] arr) {
//        int answer = 0;
//        int cnt = 0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 1) {
//                cnt++;
//                answer +=cnt;
//            }
//            else cnt = 0;
//        }
//
//        return answer;
//    }
}
