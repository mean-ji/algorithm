package inflearn_study;

public class Factorial {
    // me
//    public int dfs(int n, int sum) {
//        if (n == 0) {
//            return sum;
//        }
//        else {
//            sum = sum * n;
//            return dfs(n - 1, sum);
//        }
//    }
//    public static void main(String[] args) {
//        Factorial T = new Factorial();
//        System.out.println(T.dfs(5, 1));;
//    }

    // lecture
    public int dfs(int n) {
        if (n == 1) return 1;
        else return n * dfs(n - 1);
    }
    public static void main(String[] args) {
        Factorial T = new Factorial();
        System.out.println(T.dfs(5));;
    }
}
