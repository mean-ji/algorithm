package inflearn_study;

import java.util.Scanner;

public class Permutation {
    static int n, m = 0;
    static int[] pm;
    public void dfs(int L) {
        if (L == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                dfs(L + 1);
            }
        }
    }
    public static void main(String[] args) {
        Permutation T = new Permutation();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];
        T.dfs(0);
    }
}
