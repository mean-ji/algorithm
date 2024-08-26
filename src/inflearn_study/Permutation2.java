package inflearn_study;

import java.util.Scanner;

public class Permutation2 {
    static int n, m = 0;
    static int[] pm, ch;
    public void dfs(int L, int[] arr) {
        if (L == m) {
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    pm[L] = arr[i];
                    ch[i] = 1;
                    dfs(L + 1, arr);
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Permutation2 T = new Permutation2();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        int[] arr = new int[n];
        ch = new int[n];
        pm = new int[m];
        for (int i = 0; i < n; i ++) {
            arr[i] = kb.nextInt();
        }
        T.dfs(0, arr);
    }
}
