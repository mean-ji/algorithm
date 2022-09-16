package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

/**
 * 2606번
 * 연결된 컴퓨터는 바이러스 전이
 */
public class Virus {
    static boolean[] visited;
    static int[][] board;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int node = Integer.parseInt(br.readLine());
        int connect = Integer.parseInt(br.readLine());

        visited = new boolean[node];
        board = new int[connect][2];

        for (int i = 0; i < connect; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            board[i][0] = Integer.parseInt(st.nextToken());
            board[i][1] = Integer.parseInt(st.nextToken());
        }


    }

    public static void dfs(int node) {
        boolean hasChildNode = Arrays.stream(board)
                .flatMapToInt(Arrays::stream)
                .anyMatch(o -> o == node);

        if (hasChildNode) {
            if (!visited[node]) {

//                dfs();
                answer++;
                visited[node] = true;
            } else {
                return;
            }
        }
    }
}
