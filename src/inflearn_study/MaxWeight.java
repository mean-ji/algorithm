package inflearn_study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaxWeight {
    // me
//    static int C, sum, L = 0;
//    public void dfs(int n, Integer[] arr) {
//        System.out.println(n + " " + sum);
//        if (L == n) return;
//        else {
//            sum+=arr[n];
//            if(sum > C) {
//                sum-=arr[n];
//            }
//            dfs(n+1, arr);
//        }
//    }
//    public static void main(String[] args) {
//        MaxWeight T = new MaxWeight();
//        Scanner kb = new Scanner(System.in);
//        C = kb.nextInt();
//        int n = kb.nextInt();
//        Integer[] arr = new Integer[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//        L = n;
//        Arrays.sort(arr, Collections.reverseOrder());
//        T.dfs(0, arr);
//        System.out.println(sum);
//    }

    // lecture
    static int c, n, answer = 0;
    public void dfs(int L, int sum, int[] arr) {
        if (sum > c) return;
        if (L == n) {
            answer = Math.max(sum, answer);
        }
        else {
            dfs(L + 1, sum + arr[L], arr);
            dfs(L + 1, sum, arr);
        }
    }
    public static void main(String[] args) {
        MaxWeight T = new MaxWeight();
        Scanner kb = new Scanner(System.in);
        c = kb.nextInt();
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        T.dfs(0, 0, arr);
        System.out.println(answer);
    }
}
