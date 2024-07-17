package inflearn_study;

import java.util.Scanner;

public class InsertionSort {
    // me
//    public static void main(String[] args) {
//        InsertionSort T = new InsertionSort();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//        for (int x : T.solution(n, arr)) {
//            System.out.print(x + " ");
//        }
//    }
//    public int[] solution(int n, int[] arr) {
//        int idx = 1;
//        for (int i = 1; i < n; i++) {
//            idx = i;
//            for (int j = i - 1; j >= 0; j--) {
//                int target = arr[idx];
//                if (target < arr[j]) {
//                    arr[idx] = arr[j];
//                    arr[j] = target;
//                    idx = j;
//                }
//            }
//        }
//        return arr;
//    }
    // lecture
    public static void main(String[] args) {
        InsertionSort T = new InsertionSort();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
    public int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (tmp < arr[j]) {
                    arr[j + 1] = arr[j];
                } else break;
            }
            arr[j + 1] = tmp;
        }
        return arr;
    }
}
