package inflearn_study;

import java.util.LinkedList;
import java.util.Queue;

class Node4 {
    int data;
    Node4 lt, rt;
    public Node4(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Tree_BFS {
    Node4 root;
    // me
//    public int bfs(Node4 root) {
//        Queue<Node4> q = new LinkedList<>();
//        q.offer(root);
//        int L = 0;
//        int cnt = 0;
//        while(!q.isEmpty()) {
//            Node4 tmp = q.poll();
//            cnt ++;
//            if (cnt > Math.pow(2, L)) {
//                cnt = 0;
//                L++;
//            }
//            if (tmp.lt != null && tmp.rt != null) {
//                q.offer(tmp.lt);
//                q.offer(tmp.rt);
//            } else {
//                return L;
//            }
//        }
//        return L;
//    }

    // lecture
    public int bfs(Node4 root) {
        Queue<Node4> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        while(!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node4 cur = q.poll();
                if (cur.lt == null && cur.rt == null) return L;
                if (cur.lt != null) q.offer(cur.lt);
                if (cur.rt != null) q.offer(cur.rt);
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        Tree_BFS T = new Tree_BFS();
        T.root = new Node4(1);
        T.root.lt = new Node4(2);
        T.root.rt = new Node4(3);
        T.root.lt.lt = new Node4(4);
        T.root.lt.rt = new Node4(5);
        System.out.println(T.bfs(T.root));
    }
}
