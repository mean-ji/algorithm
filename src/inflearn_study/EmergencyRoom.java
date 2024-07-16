package inflearn_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EmergencyRoom {
    // me
    public static void main(String[] args) {
        EmergencyRoom T = new EmergencyRoom();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i ++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        int max = 0, idx = 0, t = 0;
        for (int i = 0; i < n; i++) {
            q.offer(arr[i]);
            if (i == m) t = arr[i];
        }
        idx = m;
        while (true) {
            int tmp = q.poll();
            // 1. arr 의 max값 구하기
            for (int j : arr) {
                max = Math.max(max, j);
            }
            // 2. tmp 값을 max와 비교
            if (tmp < max) {
                // 위험도가 낮으면 대기 번호 맨 뒤로
                q.offer(tmp);
            } else {
                // 위험도가 가장 높고 0번째면 진료
                answer++;
                n--;
                // arr에서 max값을 0으로 바꿔주기
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == max) {
                        arr[i] = 0;
                        break;
                    }
                }
                max = 0;

                if (idx == 0 && t == tmp) {
                    break;
                }
            }
            // 3. m번째 환자 대기번호 idx 동기화
            if (idx-- == 0) idx = n - 1;
        }

        return answer;
    }
    // lecture
//    public static void main(String[] args) {
//        EmergencyRoom T = new EmergencyRoom();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int m = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i ++) arr[i] = kb.nextInt();
//        System.out.println(T.solution(n, m, arr));
//    }
//    public int solution(int n, int m, int[] arr) {
//        int answer = 0;
//        Queue<Person> q = new LinkedList<>();
//        for (int i = 0; i < n; i++) {
//            q.offer(new Person(i, arr[i]));
//        }
//        while(!q.isEmpty()) {
//            Person tmp = q.poll();
//            for (Person x : q) {
//                if (x.priority > tmp.priority) {
//                    q.offer(tmp);
//                    tmp = null;
//                    break;
//                }
//            }
//            if(tmp != null) {
//                answer++;
//                if (tmp.id == m) return answer;
//            }
//        }
//
//        return answer;
//    }
}

//class Person {
//    int id;
//    int priority;
//    public Person (int id, int priority) {
//        this.id = id;
//        this.priority = priority;
//    }
//}