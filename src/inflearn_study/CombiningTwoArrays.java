package inflearn_study;

import java.util.ArrayList;
import java.util.Scanner;

public class CombiningTwoArrays {
    // me
    public static void main(String[] args) {
        CombiningTwoArrays T = new CombiningTwoArrays();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = kb.nextInt();
        }

        for (int i : T.solution(n, arr1, m, arr2)) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int n, int[] arr1, int m, int[] arr2) {
        int[] answer = new int[n + m];
        int a1Idx = 0, a2Idx = 0;

        for (int i = 0; i < n + m; i++) {
            if (a2Idx == arr2.length) {
                answer[i] = arr1[a1Idx];
                a1Idx++;
            } else if (a1Idx == arr1.length) {
                answer[i] = arr2[a2Idx];
                a2Idx++;
            } else if (arr1[a1Idx] <= arr2[a2Idx]) {
                answer[i] = arr1[a1Idx];
                a1Idx++;
            } else if (arr2[a2Idx] < arr1[a1Idx]) {
                answer[i] = arr2[a2Idx];
                a2Idx++;
            }
        }

        return answer;
    }

    // lecture
//    public static void main(String[] args) {
//        CombiningTwoArrays T = new CombiningTwoArrays();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[] arr1 = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr1[i] = kb.nextInt();
//        }
//        int m = kb.nextInt();
//        int[] arr2 = new int[m];
//        for (int i = 0; i < m; i++) {
//            arr2[i] = kb.nextInt();
//        }
//
//        for (int i : T.solution(n, arr1, m, arr2)) {
//            System.out.print(i + " ");
//        }
//    }
//
//    public ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
//        ArrayList<Integer> answer = new ArrayList<>();
//        int p1 = 0, p2 = 0;
//        while (p1 < n && p2 < m) {
//            if (arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
//            else answer.add(arr2[p2++]);
//        }
//        while (p1 < n) answer.add(arr1[p1++]);
//        while (p2 < m) answer.add(arr2[p2++]);
//
//        return answer;
//    }
}
