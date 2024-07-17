package inflearn_study;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    // me
    public static void main(String[] args) {
        SelectionSort T = new SelectionSort();
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
        int min = 0, idx = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr));
            min = arr[i];
            for (int j = i; j < n; j++) {
                if (min >= arr[j]) {
                    idx = j;
                    min = arr[j];
                }
            }
            int tmp = 0;
            tmp = arr[i];
            arr[i] = min;
            arr[idx] = tmp;
        }
        return arr;
    }

    // lecture
//    public static void main(String[] args) {
//        SelectionSort T = new SelectionSort();
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
//        for (int i = 0; i < n - 1; i++) {
//            int idx = i;
//            for (int j = i + 1; j < n; j++) {
//                if (arr[idx] > arr[j]) {
//                    idx = j;
//                }
//            }
//            int tmp = arr[i];
//            arr[i] = arr[idx];
//            arr[idx] = tmp;
//        }
//        return arr;
//    }
}
