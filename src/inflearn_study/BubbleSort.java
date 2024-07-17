package inflearn_study;

import java.util.Scanner;

public class BubbleSort {
    // me
    public static void main(String[] args) {
        BubbleSort T = new BubbleSort();
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
        for (int i = 0; i < n - 1; i ++) {
            for (int j = 0; j < n - 1 - i; j++) {
                int t1 = arr[j];
                int t2 = arr[j + 1];
                if (t1 > t2) {
                    arr[j] = t2;
                    arr[j + 1] = t1;
                }
            }
        }
        return arr;
    }
    // lecture
//    public static void main(String[] args) {
//        BubbleSort T = new BubbleSort();
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
//        for (int i = 0; i < n - 1; i ++) {
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = tmp;
//                }
//            }
//        }
//        return arr;
//    }
}
