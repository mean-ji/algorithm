package inflearn_study;

import java.util.Scanner;

public class CheckDuplicate {
    // me
    public String solution(int n, int[] arr) {
        String answer = "U";
        for (int i = 1; i < n; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] == tmp) return "D";
                else if (arr[j] > tmp) arr[j + 1] = arr[j];
                else break;
            }
            arr[j + 1] = tmp;
        }
        return answer;
    }
    public static void main(String[] args) {
        CheckDuplicate T = new CheckDuplicate();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, arr));
    }
    // lecture
//    public String solution(int n, int[] arr) {
//        String answer = "U";
//        Arrays.sort(arr);
//        for (int i = 0; i < n - 1; i++) {
//            if (arr[i] == arr[i + 1]) return "D";
//        }
//        return answer;
//    }
//    public static void main(String[] args) {
//        CheckDuplicate T = new CheckDuplicate();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
//        System.out.println(T.solution(n, arr));
//    }
}
