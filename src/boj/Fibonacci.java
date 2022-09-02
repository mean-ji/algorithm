package boj;

import java.io.*;
// 재귀로 푼 경우..
// DP로 풀어야 됨.
public class Fibonacci {
    static Count count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String answer = "";

        for (int i = 0; i < T; i++) {
            count = new Count();
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            answer += count.getZeroCnt() + " " + count.getOneCnt() + "\n";
        }
        System.out.println(answer);

        br.close();
    }

    static int fibonacci(int N) {
        if (N == 0) {
            count.zeroCnt++;
            return 0;
        }
        if (N == 1) {
            count.oneCnt++;
            return 1;
        }
        return fibonacci(N-1) + fibonacci(N-2);
    }

    static class Count {
        int zeroCnt;
        int oneCnt;

        Count() {
            this.zeroCnt = 0;
            this.oneCnt = 0;
        }

        public int getOneCnt() {
            return oneCnt;
        }

        public int getZeroCnt() {
            return zeroCnt;
        }
    }
}

