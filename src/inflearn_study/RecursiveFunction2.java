package inflearn_study;

public class RecursiveFunction2 {
    public void dfs(int n) {
        if (n == 0) {
            return;
        } else {
            dfs(n / 2);
            System.out.print(n % 2);
        }
    }
    public static void main(String[] args) {
        RecursiveFunction2 T = new RecursiveFunction2();
        T.dfs(11);
    }
}
