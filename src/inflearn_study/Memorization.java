package inflearn_study;

import java.util.Scanner;

public class Memorization {
    // me
//    public int dfs(int n, int r) {
//        if (n == r) return 1;
//        else if (r == 1) return n;
//        else {
//            return dfs(n - 1, r - 1) + dfs(n - 1, r);
//        }
//    }
//    public static void main (String[] args) {
//        Memorization T = new Memorization();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int r = kb.nextInt();
//        System.out.println(T.dfs(n, r));
//    }

    // lecture
    int[][] dy = new int[35][35];
    public int dfs(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else {
            return dy[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
        }
    }
    public static void main (String[] args) {
        Memorization T = new Memorization();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        System.out.println(T.dfs(n, r));
    }
}
