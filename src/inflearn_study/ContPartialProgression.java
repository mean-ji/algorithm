package inflearn_study;

import java.util.Scanner;

public class ContPartialProgression {
    // me
    public static void main(String[] args) {
        ContPartialProgression T = new ContPartialProgression();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i ++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0, idx = 0, sum = 0, i = 0;
        while(idx < n && i < n) {
            if (sum == m) {
                sum += arr[i];
                answer++;
                i++;
            } else if (sum > m) {
                sum = sum - arr[idx];
                idx++;
            } else {
                sum += arr[i];
                i++;
            }
        }

        // 마지막 합이 m과 같으면 +1 추가
        if (sum == m) {
            answer++;
        }

        return answer;
    }

    // lecture
//    public static void main(String[] args) {
//        ContPartialProgression T = new ContPartialProgression();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int m = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i ++) {
//            arr[i] = kb.nextInt();
//        }
//        System.out.println(T.solution(n, m, arr));
//    }
//
//    public int solution(int n, int m, int[] arr) {
//        int answer = 0, sum = 0, lt = 0;
//
//        for (int rt = 0; rt < n; rt++) {
//            sum += arr[rt];
//            if (sum == m) answer++;
//            while(sum >= m) {
//                sum-=arr[lt++];
//                if (sum == m) {
//                    answer++;
//                }
//            }
//        }
//
//        return answer;
//    }
}
