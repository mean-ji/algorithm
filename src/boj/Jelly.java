package boj;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Jelly {
    /**
     * 16173번 (bfs)
     * 1. 맵을 board에 넣는다.
     * 2. visited를 초기화 한다.
     * 3. bfs
     *      3-1. 큐에 시작지점을 넣는다.
     *      3-2. 큐가 비어있지 않을 때까지 이동한다.
     */
    static int n;
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {0, 1};
    static int[] dy = {1, 0};

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        board = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        bfs();
    }

    public static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        visited[0][0] = true;
        q.offer(new int[] {0,0});

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int count = board[cur[0]][cur[1]];

            if (count == -1) {
                System.out.println("HaruHaru");
                return;
            }

            for (int i = 0; i < 2; i++) {
                int nx = cur[0] + dx[i] * count;
                int ny = cur[1] + dy[i] * count;
                if (nx >= 0 && ny >=0 && nx < n && ny < n && visited[nx][ny] == false) {
                    visited[nx][ny] = true;
                    q.offer(new int[] {nx, ny});
                }
            }
        }

        System.out.println("Hing");
    }
}
