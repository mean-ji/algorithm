package inflearn_study;

public class Fibonacci2 {
    // me
//    public int dfs(int n) {
//        if (n == 2 || n == 1) {
//            return 1;
//        }
//        else {
//            return dfs(n - 1) + dfs(n - 2);
//        }
//    }
//    public static void main(String[] args) {
//        Fibonacci2 T = new Fibonacci2();
//        System.out.println(T.dfs(10));;
//    }
    // lecture
    // 이 방법은 숫자가 커지면 시간이 오래 걸림.
//    public int dfs(int n) {
//        if (n == 2 || n == 1) {
//            return 1;
//        }
//        else {
//            return dfs(n - 1) + dfs(n - 2);
//        }
//    }
//    public static void main(String[] args) {
//        Fibonacci2 T = new Fibonacci2();
//        int n = 10;
//        for (int i = 1; i <= n; i++) {
//            System.out.print(T.dfs(i) + " ");
//        }
//    }

//    static int[] fibo;
//    public int dfs(int n) {
//        if (n == 2 || n == 1) {
//            return fibo[n] = 1;
//        }
//        else {
//            return fibo[n] = dfs(n - 1) + dfs(n - 2);
//        }
//    }
//    public static void main(String[] args) {
//        Fibonacci2 T = new Fibonacci2();
//        int n = 10;
//        fibo = new int[n + 1];
//        T.dfs(n);
//        for (int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
//    }

    static int[] fibo;
    public int dfs(int n) {
        if (fibo[n] > 0) return fibo[n];

        if (n == 2 || n == 1) {
            return fibo[n] = 1;
        }
        else {
            return fibo[n] = dfs(n - 1) + dfs(n - 2);
        }
    }
    public static void main(String[] args) {
        Fibonacci2 T = new Fibonacci2();
        int n = 45;
        fibo = new int[n + 1];
        T.dfs(n);
        for (int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
    }
}
