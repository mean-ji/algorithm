package inflearn_study;

import java.util.ArrayList;
import java.util.Scanner;

public class FlippingPrimeNumber {
    // me
    public static void main(String[] args) {
        FlippingPrimeNumber T = new FlippingPrimeNumber();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int i : T.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] reverseArr = new int[n];

        // 숫자 뒤집기
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(new StringBuilder(String.valueOf(arr[i])).reverse().toString());
            reverseArr[i] = tmp;
        }

        // 소수인지 판별
        for (int k : reverseArr) {
            int[] ch = new int[k + 1];
            for (int i = 2; i <= k; i++) {
                if (i == k && ch[i] == 0) {
                    answer.add(k);
                }

                if (ch[i] == 0) {
                    for (int j = i; j <= k; j += i) {
                        ch[j] = 1;
                    }
                }
            }
        }

        return answer;
    }
    // lecture
//    public static void main(String[] args) {
//        FlippingPrimeNumber T = new FlippingPrimeNumber();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//
//        for (int i : T.solution(n, arr)) {
//            System.out.print(i + " ");
//        }
//    }
//
//    public ArrayList<Integer> solution(int n, int[] arr) {
//        ArrayList<Integer> answer = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            int tmp = arr[i];
//            int res = 0;
//            while(tmp > 0) {
//                int t = tmp % 10;
//                res = res * 10 + t;
//                tmp = tmp / 10;
//            }
//
//            if (isPrimeNum(res)) answer.add(res);
//        }
//
//        return answer;
//    }
//
//    public boolean isPrimeNum(int res) {
//        if (res == 1) return false;
//        for (int i = 2; i < res; i ++) {
//            if (res % i == 0) return false;
//        }
//        return true;
//    }
}
