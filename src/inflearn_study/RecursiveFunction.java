package inflearn_study;

public class RecursiveFunction {
    // 재귀함수는 스택프레임을 사용한다.
    // 매개변수 지역변수 복귀주소를 가짐.

    public void dfs(int n) {
        if (n == 0) return;
        else {
            dfs(n - 1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        RecursiveFunction T = new RecursiveFunction();
        T.dfs(3);
    }
}
