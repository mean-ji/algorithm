package inflearn_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mischievous {
    // me
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[2];
        for (int i = 0; i < n - 1; i++) {
            int tmp = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < tmp) {
                    answer[0] = i + 1;
                    answer[1] = j + 1;
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Mischievous T = new Mischievous();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
    // lecture
//    public ArrayList<Integer> solution(int n, int[] arr) {
//        ArrayList<Integer> answer = new ArrayList<>();
//        int[] tmp = arr.clone();
//        Arrays.sort(tmp);
//        for (int i = 0; i < n; i++) {
//            if (arr[i] != tmp[i]) answer.add(i + 1);
//        }
//        return answer;
//    }
//    public static void main(String[] args) {
//        Mischievous T = new Mischievous();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
//        for (int x : T.solution(n, arr)) System.out.print(x + " ");
//    }
}
