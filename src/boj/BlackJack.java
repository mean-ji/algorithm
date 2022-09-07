package boj;

import java.util.Scanner;

/**
 * 2798번
 * 세장의 숫자를 골랐을 때, m보다 작으면서 가장 가까운 수를 출력
 */
public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = 0;
        int[] cards = new int[n];


        for (int t = 0; t < n; t++) {
            cards[t] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    int cur = cards[i] + cards[j] + cards[k];
                    if (cur < m && cur > max) {
                        max = cur;
                    } else if (cur == m) {
                        max = cur;
                        break;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
