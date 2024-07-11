package inflearn_study;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class KthLargestNum {
    // me
    public static void main(String[] args) {
        KthLargestNum T = new KthLargestNum();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        TreeSet<Integer> tree = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int s = 2; s < n; s++) {
                    if (i != j && j != s && i != s) tree.add(arr[i] + arr[j] + arr[s]);
                }
            }
        }
        if (tree.size() < k - 1) return -1;
        answer = Integer.parseInt(tree.toArray()[k-1].toString());
        return answer;
    }
    // lecture
//    public static void main(String[] args) {
//        KthLargestNum T = new KthLargestNum();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int k = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++){
//            arr[i] = kb.nextInt();
//        }
//        System.out.println(T.solution(n, k, arr));
//    }
//    public int solution(int n, int k, int[] arr) {
//        int answer = 0;
//        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
//        for (int i = 0; i < n; i ++) {
//            for (int j = i + 1; j < n; j++) {
//                for (int l = j + 1; l < n; l++) {
//                    tSet.add(arr[i] + arr[j] + arr[l]);
//                }
//            }
//        }
//        int cnt = 0;
//        for (int x : tSet) {
//            cnt++;
//            if (cnt == k) answer = x;
//        }
//        return answer;
//    }
}
