package boj;

import java.util.*;

public class MinimumHeap {
    /**
     * 1927번
     * 1. 첫번째 줄 연산의 개수 읽기
     * 2. 0이면 가장 작은 값을 출력하고 배열에서 제거
     * 3. 0이 아니면 배열에 값을 추가
     */
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        ArrayList<Integer> minHeap = new ArrayList<Integer>();
//
//        for (int i = 0; i < n; i++) {
//            int cur = sc.nextInt();
//
//            if (cur == 0) {
//                try {
//                    Collections.min(minHeap);
//                    System.out.println(Collections.min(minHeap));
//                    Collections.sort(minHeap);
//                    minHeap.remove(0);
//                } catch (NoSuchElementException e) {
//                    System.out.println("0");
//                }
//            } else {
//                minHeap.add(cur);
//            }
//        }
//    }

    /**
     * priorityQueue를 이용한 방식
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(x -> x));

        for (int i = 0; i < n; i++) {
            int cur = sc.nextInt();

            if (cur == 0) {
                if(queue.isEmpty()) {
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
