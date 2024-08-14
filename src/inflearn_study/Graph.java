package inflearn_study;

import java.util.Scanner;

public class Graph {
    // main과 dfs에서 모두 접근 가능하도록 static 변수 선언
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public void dfs(int v) {
        // n 번째 노드까지 갔을 때 카운팅
        if (v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                // 인접행렬에서 1인지 확인하고, 체크가 안되어 있는 노드로 이동
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    dfs(i);
                    // back tracking -> 체크했던 부분 다시 원복
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Graph T = new Graph();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        // 인접 행렬 만들기
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        T.dfs(1);
        System.out.println(answer);
    }
}
