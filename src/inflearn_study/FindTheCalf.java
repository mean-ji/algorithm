package inflearn_study;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindTheCalf {
    // me
//    public int[] dist = {5, -1, 1};
//    public int bfs(int start, int end, int[] arr) {
//        int answer = 0;
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(start);
//
//        while(!q.isEmpty()) {
//            int index = q.poll();
//            answer++;
//            if (end < index) {
//                q.offer(index + dist[1]);
//            }
//            for (int i = 0; i < dist.length; i++) {
//                int j = dist[i];
//                if (index + j < end) {
//                    q.offer(index + j);
//                    break;
//                } else if (index + j == end) {
//                    q.poll();
//                    break;
//                } else {
//                    if (end - index < 3 && end - index > 0) {
//                        i++;
//                    }
//                }
//            }
//        }
//
//        return answer;
//    }
//    public static void main(String[] args) {
//        FindTheCalf T = new FindTheCalf();
//        Scanner kb = new Scanner(System.in);
//        int S = kb.nextInt();
//        int E = kb.nextInt();
//        int[] arr = new int[E + 1];
//        System.out.println(T.bfs(S, E, arr));
//    }

    // lecture
    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> q = new LinkedList<>();

    public int bfs(int s, int e) {
        ch = new int[10001];
        ch[s] = 1;
        q.offer(s);
        int L = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                int x = q.poll();
//                if (x == e) return L;
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx == e) return L + 1;
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            L++;
        }
        return L;
    }
    public static void main(String[] args) {
        FindTheCalf T = new FindTheCalf();
        Scanner kb = new Scanner(System.in);
        int S = kb.nextInt();
        int E = kb.nextInt();
        int[] arr = new int[E + 1];
        System.out.println(T.bfs(S, E));
    }
}