package inflearn_study;

import java.util.ArrayList;
import java.util.Scanner;

public class OutputtingLargeNumbers {
    // me
    public static void main(String[] args) {
        OutputtingLargeNumbers T = new OutputtingLargeNumbers();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.nextLine();
        String str = kb.nextLine();
        ArrayList<Integer> answer = T.solution(n, str);
        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }

    public ArrayList<Integer> solution(int n, String str) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] strArr;
        strArr = str.split(" ");
        int cur = 0;

        for (String s : strArr) {
            int tmp = Integer.parseInt(s);
            if (tmp > cur) answer.add(tmp);
            cur = tmp;
        }
        return answer;
    }

    // lecture
//    public static void main(String[] args) {
//        OutputtingLargeNumbers T = new OutputtingLargeNumbers();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i ++) {
//            arr[i] = kb.nextInt();
//        }
//        for (Integer integer : T.solution(n, arr)) {
//            System.out.print(integer + " ");
//        }
//    }
//
//    public ArrayList<Integer> solution(int n, int[] arr) {
//        ArrayList<Integer> answer = new ArrayList<>();
//        answer.add(arr[0]);
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > arr[i - 1]) answer.add(arr[i]);
//        }
//        return answer;
//    }
}
