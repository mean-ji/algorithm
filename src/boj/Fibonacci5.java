package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = fibonacci(n, 0, 0, 1, 1);

        System.out.println(answer);
    }

    public static int fibonacci(int n, int index, int cur, int next, int sum) {
        if (index < n) {
            return fibonacci(n, index + 1, next, sum, next + sum);
        }
        return cur;
    }
}
