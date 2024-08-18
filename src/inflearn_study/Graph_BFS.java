package inflearn_study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph_BFS {
    static int n, m, answer = 0;
    static int ch[];
    static int dis[];
    static ArrayList<ArrayList<Integer>> graph;
    // me
//    public void bfs(int n) {
//        Queue<Integer> q = new LinkedList<>();
//        int L = 0;
//        q.offer(n);
//        while(!q.isEmpty()) {
//            int len = q.size();
//            for (int i = 0; i < len; i++) {
//                int t = q.poll();
//                if (t > 1) System.out.println(t + " : " + L);
//                for (int j : graph.get(t)) {
//                    if (ch[j] == 0) {
//                        ch[j] = 1;
//                        q.offer(j);
//                    }
//                }
//            }
//            L++;
//        }
//    }
//    public static void main(String[] args) {
//        Graph_BFS T = new Graph_BFS();
//        Scanner kb = new Scanner(System.in);
//        n = kb.nextInt();
//        m = kb.nextInt();
//        ch = new int[n + 1];
//        graph = new ArrayList<ArrayList<Integer>>();
//        for (int i = 0; i <= n; i++) {
//            graph.add(new ArrayList<Integer>());
//        }
//        for (int i = 0; i < m; i++) {
//            int a = kb.nextInt();
//            int b = kb.nextInt();
//            graph.get(a).add(b);
//        }
//        ch[1] = 1;
//        T.bfs(1);
//    }
    // lecture
    public void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;
        q.offer(v);
        while(!q.isEmpty()) {
            int cv = q.poll();
            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    q.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Graph_BFS T = new Graph_BFS();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        ch = new int[n + 1];
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b);
        }
        ch = new int[n + 1];
        dis = new int[n + 1];
        T.bfs(1);
        for (int i = 2; i < dis.length; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
