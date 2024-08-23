package inflearn_study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CoinExchange {
    // me
//    static int n, m, answer = 0;
//    public void dfs(int L, int sum, int cnt, int[] arr) {
//        System.out.println(L + " " + sum + " " + cnt + " " + arr[L % 3]);
//        if (sum > m) return;
//        if (sum == m) {
//            answer = Math.min(answer, cnt);
//        } else {
//            dfs(L + 1, sum + arr[L % 3], cnt++, arr);
//            dfs(L + 1, sum, cnt, arr);
//        }
//    }
//    public static void main(String[] args) {
//        CoinExchange T = new CoinExchange();
//        Scanner kb = new Scanner(System.in);
//        n = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//        m = kb.nextInt();
//        T.dfs(0, 0, 0, arr);
//        System.out.println(answer);
//    }

//    static int n, m, answer = 100;
//    public void dfs(int L, int sum, int[] arr) {
//        if (sum > m) return;
//        if (sum == m) {
//            answer = Math.min(answer, L);
//        } else {
//            for (int i = 0; i < n; i++) {
//                dfs(L + 1, sum + arr[i], arr);
//            }
//        }
//    }
//    public static void main(String[] args) {
//        CoinExchange T = new CoinExchange();
//        Scanner kb = new Scanner(System.in);
//        n = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//        m = kb.nextInt();
//        T.dfs(0, 0, arr);
//        System.out.println(answer);
//    }

    // lecture
    static int n, m = 0;
    static Integer answer = Integer.MAX_VALUE;
    public void dfs(int L, int sum, Integer[] arr) {
        if (sum > m) return;
        if (L >= answer) return;
        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
                dfs(L + 1, sum + arr[i], arr);
            }
        }
    }
    public static void main(String[] args) {
        CoinExchange T = new CoinExchange();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        m = kb.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        T.dfs(0, 0, arr);
        System.out.println(answer);
    }
}
