package inflearn_study;

import java.awt.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Maze_BFS {
    static int[][] board;
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    static int answer = 0;
    public void bfs() {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(1,1));
        while(!q.isEmpty()) {
//            for (int i = 0; i < board.length; i++) {
//            System.out.println(Arrays.toString(board[i]));
//            }
            int len = q.size();
            int cur = 0;
            for (int l = 0; l < len; l++) {
                Point p = q.poll();
//                System.out.println(p.x + " " + p.y);
                for (int i = 0; i < 4; i++) {
                    int nx = p.x + dx[i];
                    int ny = p.y + dy[i];
                    if (nx == 7 && ny == 7) {
                        answer++;
                        System.out.println(answer);
                        System.exit(0);
                    }
                    if (nx > 0 && nx <= 7 && ny > 0 && ny <= 7 && board[nx][ny] == 0) {
                        q.offer(new Point(nx, ny));
                        board[nx][ny] = 1;
                        cur = 1;
                    }
                }
            }
            answer += cur;
        }
        System.out.println("-1");
    }
    public static void main(String[] args) {
        Maze_BFS T = new Maze_BFS();
        Scanner kb = new Scanner(System.in);
        board = new int[8][8];
        for (int i = 1; i < 8; i++) {
            String[] t = kb.nextLine().split(" ");
            for (int j = 0; j < t.length; j++) {
                board[i][j+1] = Integer.parseInt(t[j]);
            }
        }
        for (int i = 0; i < board.length; i++) {
            board[0][i] = 1;
            board[i][0] = 1;
        }
        board[1][1] = 1;
        T.bfs();
    }
}
