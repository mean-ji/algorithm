package inflearn_study;

import java.util.Scanner;

public class Combi {
    static int n, m;
    static int[] combi;
    public void dfs(int L, int S) {
        if (L == m) {
            for (int x : combi) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = S; i <= n; i++) {
                combi[L] = i;
                dfs(L + 1, i + 1);
            }
        }
    }
    public static void main(String[] args) {
        Combi T = new Combi();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];
        T.dfs(0, 1);
    }
}
