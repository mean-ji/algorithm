package inflearn_study;

import java.util.Scanner;

public class GridMaxSum {
    // me
    public static void main(String[] args) {
        GridMaxSum T = new GridMaxSum();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }

    public int solution(int n, int[][] arr) {
        int answer = 0;

        // 행의 합
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            answer = Math.max(answer, sum);
        }

        // 열의 합
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
            }
            answer = Math.max(answer, sum);
        }

        // 대각선의 합
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
        }
        answer = Math.max(answer, sum);

        // 대각선의 합
        sum = 0;
        for (int i = n ; i > 0; i--) {
            sum += arr[i - 1][n - i];
        }
        answer = Math.max(answer, sum);

        return answer;
    }
    // lecture
//    public static void main(String[] args) {
//        GridMaxSum T = new GridMaxSum();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = kb.nextInt();
//            }
//        }
//        System.out.println(T.solution(n, arr));
//    }
//
//    public int solution(int n, int[][] arr) {
//        int answer = 0;
//        int sum1, sum2;
//
//        // 행열의 합
//        for (int i = 0; i < n; i++) {
//            sum1 = sum2 = 0;
//            for (int j = 0; j < n; j++) {
//                sum1 += arr[i][j];
//                sum2 += arr[j][i];
//            }
//            answer = Math.max(answer, sum1);
//            answer = Math.max(answer, sum2);
//        }
//
//        // 대각선의 합
//        sum1 = sum2 = 0;
//        for (int i = 0; i < n; i++) {
//            sum1 += arr[i][i];
//            sum2 += arr[i][n - i - 1];
//        }
//        answer = Math.max(answer, sum1);
//        answer = Math.max(answer, sum2);
//
//        return answer;
//    }
}
