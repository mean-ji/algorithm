package inflearn_study;

import java.awt.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    public int x, y;
    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Maze_BFS {
    // me
//    static int[][] board;
//    int[] dx = {-1, 0, 1, 0};
//    int[] dy = {0, 1, 0, -1};
//    static int answer = 0;
//    public void bfs() {
//        Queue<Point> q = new LinkedList<>();
//        q.offer(new Point(1,1));
//        while(!q.isEmpty()) {
//            int len = q.size();
//            int cur = 0;
//            for (int l = 0; l < len; l++) {
//                Point p = q.poll();
//                for (int i = 0; i < 4; i++) {
//                    int nx = p.x + dx[i];
//                    int ny = p.y + dy[i];
//                    if (nx == 7 && ny == 7) {
//                        answer++;
//                        System.out.println(answer);
//                        System.exit(0);
//                    }
//                    if (nx > 0 && nx <= 7 && ny > 0 && ny <= 7 && board[nx][ny] == 0) {
//                        q.offer(new Point(nx, ny));
//                        board[nx][ny] = 1;
//                        cur = 1;
//                    }
//                }
//            }
//            answer += cur;
//        }
//        System.out.println("-1");
//    }
//    public static void main(String[] args) {
//        Maze_BFS T = new Maze_BFS();
//        Scanner kb = new Scanner(System.in);
//        board = new int[8][8];
//        for (int i = 1; i < 8; i++) {
//            String[] t = kb.nextLine().split(" ");
//            for (int j = 0; j < t.length; j++) {
//                board[i][j+1] = Integer.parseInt(t[j]);
//            }
//        }
//        for (int i = 0; i < board.length; i++) {
//            board[0][i] = 1;
//            board[i][0] = 1;
//        }
//        board[1][1] = 1;
//        T.bfs();
//    }

    // lecture
    static int[][] board, dis;
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public void bfs(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(1,1));
        while(!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    q.offer(new Point(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Maze_BFS T = new Maze_BFS();
        Scanner kb = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];
        for (int i = 1; i < 8; i++) {
            String[] t = kb.nextLine().split(" ");
            for (int j = 0; j < t.length; j++) {
                board[i][j+1] = Integer.parseInt(t[j]);
            }
        }
        T.bfs(1, 1);
        if (dis[7][7] == 0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}
