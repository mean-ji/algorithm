package inflearn_study;

import java.util.Scanner;
import java.util.Stack;

public class CraneKaKaoDoll {
    // me
    public static void main(String[] args) {
        CraneKaKaoDoll T = new CraneKaKaoDoll();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] move = new int[m];
        for (int i = 0; i < m; i++) {
            move[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr, m, move));
    }

    public int solution(int n, int[][] arr, int m, int[] move) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < m; i++) {
            int j = 0;
            int tmp = 0;
            while (j < n - 1 && arr[j][move[i] - 1] == 0) j++;
            tmp = arr[j][move[i] - 1];
            arr[j][move[i] - 1] = 0;
            if (tmp != 0) {
                if (!stack.isEmpty() && stack.lastElement() == tmp) {
                    stack.pop();
                    answer += 2;
                } else {
                    stack.push(tmp);
                }
            }
        }

        return answer;
    }
    // lecture
//    public static void main(String[] args) {
//        CraneKaKaoDoll T = new CraneKaKaoDoll();
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        int[][] arr = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = kb.nextInt();
//            }
//        }
//        int m = kb.nextInt();
//        int[] move = new int[m];
//        for (int i = 0; i < m; i++) {
//            move[i] = kb.nextInt();
//        }
//        System.out.println(T.solution(arr, move));
//    }
//
//    public int solution(int[][] board, int[] moves) {
//        int answer = 0;
//        Stack<Integer> stack = new Stack<>();
//        for (int pos : moves) {
//            for (int i = 0; i < board.length; i++) {
//                if (board[i][pos - 1] != 0) {
//                    int tmp = board[i][pos - 1];
//                    board[i][pos - 1] = 0;
//                    if (!stack.isEmpty() && stack.peek() == tmp) {
//                        answer += 2;
//                        stack.pop();
//                    }
//                    else stack.push(tmp);
//                    break;
//                }
//            }
//        }
//
//        return answer;
//    }
}
