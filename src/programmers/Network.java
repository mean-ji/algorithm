package programmers;

public class Network {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                dfs(computers, visited, i);
            }
        }

        return answer;
    }

    public void dfs(int[][] computers, boolean[] visited, int i) {
        visited[i] = true;

        for (int j = 0; j < computers.length; j++) {
            if (visited[j] == false && j != i && computers[i][j] == 1) {
                dfs(computers, visited, j);
            }
        }
    }
}
