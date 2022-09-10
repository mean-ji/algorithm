package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 지도에 0이 적혀있으면 주사위 숫자 복사
 * 0이 아니면 지도의 숫자를 주사위에 복사
 */
public class RollTheDice {
    // 3번이 바닥
    static int[] dice = new int[7];
    static int[][] map;
    static int n, m, x, y;

    // 1 - 동, 2 - 서, 3 - 북, 4 - 남
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());

         y = Integer.parseInt(st.nextToken());
         x = Integer.parseInt(st.nextToken());

         int k = Integer.parseInt(st.nextToken());

         map = new int[n][m];
         for (int i = 0; i < n; i++) {
             st = new StringTokenizer(br.readLine());
             for (int j = 0; j < m; j++) {
                 map[i][j] = Integer.parseInt(st.nextToken());
             }
         }

         st = new StringTokenizer(br.readLine());
         for (int i = 0; i < k; i++) {
             int d = Integer.parseInt(st.nextToken());
             move(d);
         }
    }

    public static void move(int d) {
        int nx = x + dx[d-1];
        int ny = y + dy[d-1];
        // 지도 범위 밖을 넘어가면 출력 X
        if (nx < 0 || ny < 0 || nx > m-1 || ny > n-1) {
            return;
        }
        roll(d, nx, ny);
        x = nx;
        y = ny;
    }

    //   2
    // 4 1 3
    //   5
    //   6
    public static void roll(int d, int nx, int ny) {
        // 1 - 윗면, 6 - 밑면
        // d) 1 - 동, 2 - 서, 3 - 북, 4 - 남
        int[] temp = dice.clone();
        if (d == 1) {
            dice[6] = temp[3];
            dice[3] = temp[1];
            dice[1] = temp[4];
            dice[4] = temp[6];
        } else if (d == 2) {
            dice[4] = temp[1];
            dice[1] = temp[3];
            dice[3] = temp[6];
            dice[6] = temp[4];
        } else if (d == 3) {
            dice[1] = temp[5];
            dice[2] = temp[1];
            dice[5] = temp[6];
            dice[6] = temp[2];
        } else if (d == 4) {
            dice[1] = temp[2];
            dice[2] = temp[6];
            dice[5] = temp[1];
            dice[6] = temp[5];
        }
        // 지도에 0이 적혀있으면 주사위 숫자 복사
        // 0이 아니면 지도의 숫자를 주사위에 복사
        if (map[ny][nx] == 0) {
            map[ny][nx] = dice[6];
        } else {
            dice[6] = map[ny][nx];
            map[ny][nx] = 0;
        }

        System.out.println(dice[1]);
    }
}
