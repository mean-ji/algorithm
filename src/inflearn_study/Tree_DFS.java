package inflearn_study;

import java.util.ArrayList;

// 최단거리 문제는 BFS로 푸는 게 맞음
class Node3 {
    int data;
    Node3 lt, rt;
    public Node3(int val) {
        data = val;
        lt = rt = null;
    }
}

// me
//public class Tree_DFS {
//    Node3 root;
//    static ArrayList<Integer> answer = new ArrayList<>();
//    public void dfs(int L, Node3 root) {
//        if (root.rt == null && root.lt == null) {
//            answer.add(L);
//        } else {
//            dfs(L + 1, root.lt);
//            dfs(L + 1, root.rt);
//        }
//    }
//
//    public static void main(String[] args) {
//        Tree_DFS T = new Tree_DFS();
//        T.root = new Node3(1);
//        T.root.lt = new Node3(2);
//        T.root.rt = new Node3(3);
//        T.root.lt.lt = new Node3(4);
//        T.root.lt.rt = new Node3(5);
//        T.dfs(0, T.root);
//        System.out.println(answer);
//    }
//}

// lecture
public class Tree_DFS {
    Node3 root;
    public int dfs(int L, Node3 root) {
        if (root.rt == null && root.lt == null) {
            return L;
        } else {
            return Math.min(dfs(L + 1, root.lt), dfs(L + 1, root.rt));
        }
    }

    public static void main(String[] args) {
        Tree_DFS T = new Tree_DFS();
        T.root = new Node3(1);
        T.root.lt = new Node3(2);
        T.root.rt = new Node3(3);
        T.root.lt.lt = new Node3(4);
        T.root.lt.rt = new Node3(5);
        System.out.println(T.dfs(0, T.root));
    }
}
