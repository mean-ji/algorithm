package inflearn_study;

import java.util.LinkedList;
import java.util.Queue;

class Node2 {
    int data;
    Node2 lt, rt;
    public Node2(int val) {
        data = val;
        lt = rt = null;
    }
}

public class BinaryTree2 {
    Node2 root;
    Queue<Node2> q = new LinkedList<>();
    // me
//    public void bfs(Node2 root) {
//        q.offer(root);
//        while(!q.isEmpty()) {
//            if (root.rt != null && root.lt != null) {
//                q.offer(root.lt);
//                q.offer(root.rt);
//            }
//            System.out.print(q.poll().data + " ");
//            root = q.peek();
//        }
//    }
    public void bfs(Node2 root) {
        q.offer(root);
        int L = 0;
        while(!q.isEmpty()) {
            int len = q.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node2 cur = q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) q.offer(cur.lt);
                if (cur.rt != null) q.offer(cur.rt);
            }
            L++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        BinaryTree2 T = new BinaryTree2();
        T.root = new Node2(1);
        T.root.lt = new Node2(2);
        T.root.rt = new Node2(3);
        T.root.lt.lt = new Node2(4);
        T.root.lt.rt = new Node2(5);
        T.root.rt.lt = new Node2(6);
        T.root.rt.rt = new Node2(7);
        T.bfs(T.root);
    }
}
