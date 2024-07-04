package inflearn_study;

import java.util.Scanner;

public class Mentoring {
    // me
    public static void main(String[] args) {
        Mentoring T = new Mentoring();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, m, arr));
    }

    public int solution(int n, int m, int[][] arr) {
        int answer = 0;
        int[][] tmp = new int[n + 1][n + 1];

        // i = 횟수, j = 등수, k = 비교 학생 인덱스
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    tmp[arr[i][j]][arr[i][k]] = 1;
                }
            }
        }

        for (int i = 1; i <= n; i ++) {
            for (int j = i; j <= n; j++) {
                if (tmp[i][j] != tmp[j][i]) answer++;
            }
        }

        return answer;
    }
}
