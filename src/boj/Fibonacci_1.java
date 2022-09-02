package boj;

import java.io.*;

public class Fibonacci_1 {
    static Integer[][] d = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String answer = "";

        d[0][0] = 1;
        d[0][1] = 0;
        d[1][0] = 0;
        d[1][1] = 1;

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            System.out.println(d[N][0] + " " + d[N][1]);
        }

        br.close();
    }

    static Integer[] fibonacci(int N) {
        if (d[N][0] == null || d[N][1] == null) {
            d[N][0] = fibonacci(N-1)[0] + fibonacci(N-2)[0];
            d[N][1] = fibonacci(N-1)[1] + fibonacci(N-2)[1];
        }
        return d[N];
    }
}

