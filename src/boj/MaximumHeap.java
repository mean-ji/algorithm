package boj;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 11279번
 * 1. 첫번째 줄 연산의 개수 읽기
 * 2. 0이면 가장 큰 값을 출력하고 배열에서 제거
 * 3. 0이 아니면 배열에 값을 추가
 */
public class MaximumHeap {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int cur = sc.nextInt();

            if (cur == 0) {
                if (queue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.add(cur);
            }
        }
    }
}
