package inflearn_study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SameSumSubset {
    // me
//    static int n, halfSum;
//    static Map<Integer, Integer> ch;
//    public void dfs(int v) {
//        if (Integer.parseInt(ch.keySet().toArray()[n - 1].toString()) == v) {
//            int sum = 0;
//            System.out.println(ch);
//            for (Map.Entry<Integer, Integer> entrySet: ch.entrySet()) {
//                if (entrySet.getValue() == 1) {
//                    sum += entrySet.getKey();
//                }
//            }
//            if (sum == halfSum) {
//                System.out.println("YES");
//                System.exit(0);
//            }
//            else if (sum == 0) System.out.println("NO");
//        } else {
//            ch.put(v, 1);
//            int nv = 0;
//            for (int i = 0; i < n; i++) {
//                if (Integer.parseInt(ch.keySet().toArray()[i].toString()) == v) nv = i;
//            }
//            dfs(Integer.parseInt(ch.keySet().toArray()[nv + 1].toString()));
//            ch.put(v, 0);
//            dfs(Integer.parseInt(ch.keySet().toArray()[nv + 1].toString()));
//        }
//    }
//    public static void main(String[] args) {
//        SameSumSubset T = new SameSumSubset();
//        Scanner kb = new Scanner(System.in);
//        n = kb.nextInt();
//        ch = new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            int t = kb.nextInt();
//            ch.put(t, 0);
//            halfSum += t;
//        }
//        if ((float) halfSum % 2 > 0) System.out.println("NO");
//        else {
//            halfSum = Math.round((float) halfSum / 2);
//            T.dfs(Integer.parseInt(ch.keySet().toArray()[0].toString()));
//        }
//    }

    // lecture
    static String answer = "NO";
    static int n, total = 0;
    static boolean flag = false;
    public void dfs(int L, int sum, int[] arr) {
        if (flag) return;
        if (sum > total / 2) return;
        if (L == n) {
            if (total - sum == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            dfs(L + 1, sum + arr[L], arr);
            dfs(L + 1, sum, arr);
        }
    }
    public static void main(String[] args) {
        SameSumSubset T = new SameSumSubset();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
            total += arr[i];
        }
        T.dfs(0, 0, arr);
        System.out.println(answer);
    }
}
