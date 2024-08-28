package inflearn_study;

import java.util.Scanner;

public class Sequence {
    // me
    static int N, F = 0;
    static int[] arr, ch, pm, a;
    public boolean dfs2 (int L, int sum) {
        if (L == 1) return sum == F;
        else {
            for (int i = 0; i < L - 1; i++) {
                a[i] = a[i] + a[i + 1];
            }
            return dfs2(L - 1, a[0]);
        }
    }
    public void dfs1 (int L, int[] arr) {
        if (L == N) {
            a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = pm[i];
            }
            if (dfs2(L, 0)) {
                for(int x : pm) System.out.print(x + " ");
                System.exit(0);
            }
        } else {
            for (int i = 0; i < N; i++) {
                if (ch[i] != 1) {
                    pm[L] = arr[i];
                    ch[i] = 1;
                    dfs1(L + 1, arr);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Sequence T = new Sequence();
        Scanner kb = new Scanner(System.in);
        N = kb.nextInt();
        F = kb.nextInt();
        arr = new int[N];
        ch = new int[N];
        pm = new int[N];
        for (int i = 1; i <= N; i++) arr[i - 1] = i;
        T.dfs1(0, arr);
    }
}
