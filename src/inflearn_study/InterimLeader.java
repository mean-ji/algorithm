package inflearn_study;

import java.util.Scanner;

public class InterimLeader {
    // me
    public static void main(String[] args) {
        InterimLeader T = new InterimLeader();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }

    public int solution(int n, int[][] arr) {
        int answer = 1;
        int max = 0;
        int[][] tmp = new int[n][n];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                int value = arr[j][i];
                for (int k = j + 1; k < n; k ++) {
                    if (value == arr[k][i]) {
                        tmp[j][k] = 1;
                        tmp[k][j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < n ; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                cnt += tmp[j][i];
            }
            if (cnt > max) {
                max = cnt;
                answer = i + 1;
            }
        }

        return answer;
    }

    // lecture
//    public static void main(String[] args) {
//        InterimLeader T = new InterimLeader();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[][] arr = new int[n + 1][6];
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= 5; j++) {
//                arr[i][j] = kb.nextInt();
//            }
//        }
//        System.out.println(T.solution(n, arr));
//    }
//
//    public int solution(int n, int[][] arr) {
//        int answer = 0;
//        int max = 0;
//
//        for (int i = 1; i <= n; i++) {
//            int cnt = 0;
//            for (int j = 1; j <= n; j++) {
//                for (int k = 1; k <= 5; k++) {
//                    if (arr[i][k] == arr[j][k]) cnt++;
//                    break;
//                }
//            }
//            if (cnt > max) {
//                max = cnt;
//                answer = i;
//            }
//        }
//
//        return answer;
//    }
}
