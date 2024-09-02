package inflearn_study;

import java.util.Arrays;
import java.util.Scanner;

public class Maze {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    static int[][] arr, ch;
    static int answer = 0;
    public void dfs(int x, int y) {
//        System.out.println(x + " " + y);
        if (x == 7 && y == 7) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx > 0 && nx <= 7 && ny > 0 && ny <=7 && arr[nx][ny] == 0) {
                    if (ch[nx][ny] == 0) {
                        ch[nx][ny] = 1;
                        dfs(nx, ny);
                        ch[nx][ny] = 0;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Maze T = new Maze();
        Scanner kb = new Scanner(System.in);
        arr = new int[8][8];
        ch = new int[8][8];
        for (int i = 1; i < 8; i++) {
            String[] t = kb.nextLine().split(" ");
            for (int j = 0; j < t.length; j++) {
                arr[i][j + 1] = Integer.parseInt(t[j]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[0][i] = 1;
            arr[i][0] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
        }
        ch[1][1] = 1;
        T.dfs(1,1);
        System.out.println(answer);
    }
}
