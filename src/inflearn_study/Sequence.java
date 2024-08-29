package inflearn_study;

import java.util.Scanner;

public class Sequence {
    // me
//    static int N, F = 0;
//    static int[] arr, ch, pm, a;
//    public boolean dfs2 (int L, int sum) {
//        if (L == 1) return sum == F;
//        else {
//            for (int i = 0; i < L - 1; i++) {
//                a[i] = a[i] + a[i + 1];
//            }
//            return dfs2(L - 1, a[0]);
//        }
//    }
//    public void dfs1 (int L, int[] arr) {
//        if (L == N) {
//            a = new int[N];
//            for (int i = 0; i < N; i++) {
//                a[i] = pm[i];
//            }
//            if (dfs2(L, 0)) {
//                for(int x : pm) System.out.print(x + " ");
//                System.exit(0);
//            }
//        } else {
//            for (int i = 0; i < N; i++) {
//                if (ch[i] != 1) {
//                    pm[L] = arr[i];
//                    ch[i] = 1;
//                    dfs1(L + 1, arr);
//                    ch[i] = 0;
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Sequence T = new Sequence();
//        Scanner kb = new Scanner(System.in);
//        N = kb.nextInt();
//        F = kb.nextInt();
//        arr = new int[N];
//        ch = new int[N];
//        pm = new int[N];
//        for (int i = 1; i <= N; i++) arr[i - 1] = i;
//        T.dfs1(0, arr);
//    }

    // lecture
    static int[] b, p, ch;
    static int n, f;
    int[][] dy = new int[35][35];
    boolean flag = false;
    public int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }
    public void DFS(int L, int sum) {
        if (flag) return;
        if (L == n) {
            if (sum == f) {
                for (int x : p) System.out.println(x + " ");
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Sequence T = new Sequence();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        f = kb.nextInt();
        b = new int[n];
        ch = new int[n];
        p = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = T.combi(n - 1, i);
        }
        T.DFS(0, 0);
    }
}
