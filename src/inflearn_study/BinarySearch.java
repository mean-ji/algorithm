package inflearn_study;

import java.util.Scanner;

public class BinarySearch {
    // me
    public static void main(String[] args) {
        BinarySearch T = new BinarySearch();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i ++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n, m, arr));
    }

    public int solution(int n, int m, int[] arr) {
        for (int i = 1; i < n; i ++) {
            for (int j = 1; j < n - i + 1; j++) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }
        // 이분검색
        int low = 0, high = n - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == m) return mid + 1;
            else if (arr[mid] > m) high = mid - 1;
            else if (arr[mid] < m) low = mid + 1;
        }
        return low + 1;
    }
    // lecture
//    public static void main(String[] args) {
//        BinarySearch T = new BinarySearch();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int m = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i ++) arr[i] = kb.nextInt();
//        System.out.println(T.solution(n, m, arr));
//    }
//
//    public int solution(int n, int m, int[] arr) {
//        int answer = 0;
//        Arrays.sort(arr);
//        int lt = 0, rt = n - 1;
//        while (lt <= rt) {
//            int mid = (lt + rt) / 2;
//            if (arr[mid] == m) {
//                answer = mid + 1;
//                break;
//            }
//            else if (arr[mid] > m) rt = mid - 1;
//            else lt = mid + 1;
//        }
//        return answer;
//    }
}
