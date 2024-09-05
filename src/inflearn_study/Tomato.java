package inflearn_study;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point2 {
    int x;
    int y;
    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Tomato {
    static int zeroCnt, N, M;
    static int[][] board;
    static Queue<Point2> q;
    int[] dx = { -1, 0, 1, 0 };
    int[] dy = { 0, 1, 0, -1 };

    public void bfs() {
        int day = -1;
        while(!q.isEmpty()) {
            day++;
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Point2 p = q.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = p.x + dx[j];
                    int ny = p.y + dy[j];
                    if (nx >= 1 && nx <= N && ny >= 1 && ny <= M && board[nx][ny] == 0) {
                        board[nx][ny] = 1;
                        zeroCnt--;
                        q.offer(new Point2(nx, ny));
                    }
                }
            }
        }
        if (zeroCnt != 0) System.out.println(-1);
        else System.out.println(day);
    }

    public static void main(String[] args) {
        Tomato T = new Tomato();
        Scanner kb = new Scanner(System.in);
        M = kb.nextInt();
        N = kb.nextInt();
        kb.nextLine();
        board = new int[N + 1][M + 1];
        q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            String[] arr = kb.nextLine().split(" ");
            for (int j = 1; j <= M; j++) {
                int t = Integer.parseInt(arr[j - 1]);
                board[i][j] = t;
                if (t == 0) zeroCnt++;
                else if (t == 1) q.offer(new Point2(i, j));
            }
        }
//        for (int i = 0; i < board.length; i++) {
//            System.out.println(Arrays.toString(board[i]));
//        }
//        System.out.println(zeroCnt + " " + q.size());
        if (zeroCnt == 0) System.out.println(0);
        else T.bfs();
    }
}
