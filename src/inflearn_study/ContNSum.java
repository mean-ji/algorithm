package inflearn_study;

import java.util.Scanner;

public class ContNSum {
    // me
    public static void main(String[] args) {
        ContNSum T = new ContNSum();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }

//    public int solution(int n) {
//        int answer = 0, sum = 0, idx = 0, i = 0;
//        int[] arr = new int[n];
//        for (int j = 0; j < n; j++) {
//            arr[j] = j + 1;
//        }
//
//        while (idx < n && i < n) {
//            if (sum > n) sum-=arr[idx++];
//            else if (sum == n) {
//                answer++;
//                sum+=arr[i++];
//            } else sum += arr[i++];
//        }
//
//        return answer;
//    }
    public int solution(int n) {
        int answer = 0, sum = 0, lt = 1, rt = 1;

        while (lt < n && rt < n) {
            if (sum > n) sum-=lt++;
            else if (sum == n) {
                answer++;
                sum+=rt++;
            }
            else sum += rt++;
        }

        return answer;
    }

    // lecture
//    public static void main(String[] args) {
//        ContNSum T = new ContNSum();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        System.out.println(T.solution(n));
//    }
////    public int solution(int n) {
////        int answer = 0, sum = 0, lt = 0;
////        int m = n / 2 + 1;
////        int[] arr = new int[m];
////        for (int i = 0; i < m; i ++) {
////            arr[i] = i + 1;
////        }
////
////        for (int rt = 0; rt < m; rt++) {
////            sum += arr[rt];
////            if (sum == n) answer++;
////            while (sum >= n) {
////                sum -= arr[lt++];
////                if (sum == n) answer++;
////            }
////        }
////
////        return answer;
////    }
//
//    public int solution(int n) {
//        int answer = 0, cnt = 1;
//        n--;
//        while (n > 0) {
//            cnt++;
//            n = n - cnt;
//            if (n % cnt == 0) answer++;
//        }
//
//        return answer;
//    }
}
