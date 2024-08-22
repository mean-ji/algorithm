package inflearn_study;

import java.util.Scanner;

public class MaxScore_DFS {
    // me
//    static int N, M, answer = 0;
//
//    public void dfs(int L, int scoreSum, int timeSum, int[][] arr) {
//        if (timeSum > M) return;
//        if (L == N) {
//            answer = Math.max(answer, scoreSum);
//        } else {
//            dfs(L + 1, scoreSum + arr[L][0], timeSum + arr[L][1], arr);
//            dfs(L + 1, scoreSum, timeSum, arr);
//        }
//    }
//    public static void main(String[] args) {
//        MaxScore_DFS T = new MaxScore_DFS();
//        Scanner kb = new Scanner(System.in);
//        N = kb.nextInt();
//        M = kb.nextInt();
//        int[][] arr = new int[N][2];
//        for (int i = 0; i < N; i++) {
//            arr[i][0] = kb.nextInt();
//            arr[i][1] = kb.nextInt();
//        }
//        T.dfs(0, 0, 0, arr);
//        System.out.println(answer);
//    }

    // lecture
    static int N, M, answer = 0;

    public void dfs(int L, int sum, int time, int[] ps, int[] pt) {
        if (time > M) return;
        if (L == N) {
            answer = Math.max(answer, sum);
        } else {
            dfs(L + 1, sum + ps[L], time + pt[L], ps, pt);
            dfs(L + 1, sum , time, ps, pt);
        }
    }
    public static void main(String[] args) {
        MaxScore_DFS T = new MaxScore_DFS();
        Scanner kb = new Scanner(System.in);
        N = kb.nextInt();
        M = kb.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = kb.nextInt();
            b[i] = kb.nextInt();
        }
        T.dfs(0, 0, 0, a, b);
        System.out.println(answer);
    }
}
