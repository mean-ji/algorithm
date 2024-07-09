package inflearn_study;

import java.util.Scanner;

public class MaxLenContPartialSequence {
    // me
    public static void main(String[] args) {
        MaxLenContPartialSequence T = new MaxLenContPartialSequence();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }

    public int solution(int n, int k, int[] arr) {
        int answer = 0, sum = 0;
        int cnt0 = 0, cnt1 = 0;
        int lt = 0, rt = 0;
        while (lt < n - 1 && rt < n - 1) {
            if (cnt0 > k) {
                lt++;
                if (arr[lt] == 1) cnt1--;
                else cnt0--;
            } else {
                sum = cnt0 + cnt1;
                answer = Math.max(sum, answer);
                rt++;
                if (arr[rt] == 1) cnt1++;
                else cnt0++;
            }
        }

        return answer;
    }

    // lecture
//    public static void main(String[] args) {
//        MaxLenContPartialSequence T = new MaxLenContPartialSequence();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int k = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//        System.out.println(T.solution(n, k, arr));
//    }
//
//    public int solution(int n, int k, int[] arr) {
//        int answer = 0, cnt = 0, lt = 0;
//        for (int rt = 0; rt < n; rt++) {
//            if (arr[rt] == 0) cnt++;
//            while(cnt > k) {
//                if (arr[lt] == 0) cnt--;
//                lt++;
//            }
//            answer = Math.max(answer, rt - lt + 1);
//        }
//
//        return answer;
//    }
}
