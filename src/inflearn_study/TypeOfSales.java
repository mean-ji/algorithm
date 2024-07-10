package inflearn_study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TypeOfSales {
    // me
    public static void main(String[] args) {
        TypeOfSales T = new TypeOfSales();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for (int i : T.solution(n, k, arr)) System.out.print(i + " ");
    }
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n + 1; i++) {
            if (i >= k) {
                answer.add(map.size());
                if (map.get(arr[i - k]) == 1) {
                    map.remove(arr[i - k]);
                } else {
                    map.put(arr[i - k], map.get(arr[i - k]) - 1);
                }

            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return answer;
    }

    // lecture
//    public static void main(String[] args) {
//        TypeOfSales T = new TypeOfSales();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int k = kb.nextInt();
//        int[] arr = new int[n + 1];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//        for (int i : T.solution(n, k, arr)) System.out.print(i + " ");
//    }
//    public ArrayList<Integer> solution(int n, int k, int[] arr) {
//        ArrayList<Integer> answer = new ArrayList<>();
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int lt = 0;
//        for (int i = 0; i < k - 1; i++) {
//            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//        }
//        for (int rt = k - 1; rt < n; rt++) {
//            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
//            answer.add(map.size());
//            map.put(arr[lt], map.get(arr[lt]) - 1);
//            if (map.get(arr[lt]) == 0) map.remove(arr[lt]);
//            lt++;
//        }
//
//        return answer;
//    }
}
