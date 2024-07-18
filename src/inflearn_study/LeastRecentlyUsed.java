package inflearn_study;

import java.util.Scanner;

public class LeastRecentlyUsed {
    // me
    public static void main(String[] args) {
        LeastRecentlyUsed T = new LeastRecentlyUsed();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int x : T.solution(s, n, arr)) System.out.print(x + " ");
    }
    public int[] solution(int s, int n, int[] arr) {
        int[] answer = new int[s];
        for (int i = 0; i < n; i++) {
            int tmp = arr[i], j;
            for (j = 0; j < s; j++) {
                if (answer[j] == tmp) {
                    break;
                }
            }
            if (answer[0] != 0 && j == s) {
                // miss
                for (int k = s - 1; k > 0; k--) {
                    int t1 = answer[k - 1];
                    answer[k] = t1;
                }
                answer[0] = tmp;
            } else if (j < s) {
                // hit
                for (int k = j; k > 0; k--) {
                    if (answer[k - 1] == 0) break;
                    int t1 = answer[k - 1];
                    answer[k] = t1;
                    answer[k - 1] = tmp;
                }
            } else {
                // push
                for (int k = 0; k < s; k++) {
                    if (answer[k] != 0) {
                        answer[k - 1] = tmp;
                        break;
                    }
                    else if (k == s - 1 && answer[k] == 0) answer[k] = tmp;
                }
            }
        }
        return answer;
    }
    // lecture
//    public static void main(String[] args) {
//        LeastRecentlyUsed T = new LeastRecentlyUsed();
//        Scanner kb = new Scanner(System.in);
//        int s = kb.nextInt();
//        int n = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
//        for (int x : T.solution(s, n, arr)) System.out.print(x + " ");
//    }
//    public int[] solution(int size, int n, int[] arr) {
//        int[] cache = new int[size];
//        for (int x : arr) {
//            int pos = -1;
//            for (int i = 0; i < size; i++) {
//                if (cache[i] == x) {
//                    pos = i;
//                    break;
//                }
//            }
//            if (pos == -1) {
//                // miss
//                for (int i = size - 1; i > 0; i--) {
//                    cache[i] = cache[i - 1];
//                }
//            } else {
//                // hit
//                for (int i = pos; i > 0; i--) {
//                    cache[i] = cache[i - 1];
//                }
//            }
//            cache[0] = x;
//        }
//        return cache;
//    }
}
