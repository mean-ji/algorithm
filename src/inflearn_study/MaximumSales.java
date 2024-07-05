package inflearn_study;

import java.util.Scanner;

public class MaximumSales {
    // me
    public static void main(String[] args) {
        MaximumSales T = new MaximumSales();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0, idx = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            if (i < m) {
                sum += arr[i];
                answer = Math.max(sum, answer);
            } else {
                sum = sum - arr[idx] + arr[i];
                answer = Math.max(sum, answer);
                idx++;
            }
        }
        return answer;
    }

    // lecture
//    public static void main(String[] args) {
//        MaximumSales T = new MaximumSales();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int m = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//        System.out.println(T.solution(n, m, arr));
//    }
//
//    public int solution(int n, int m, int[] arr) {
//        int answer, sum = 0;
//        for (int i = 0; i < m; i++) sum += arr[i];
//        answer = sum;
//
//        for (int i = m; i < n; i++) {
//            sum = sum - arr[i - m] + arr[i];
//            answer = Math.max(sum, answer);
//        }
//
//        return answer;
//    }
}
