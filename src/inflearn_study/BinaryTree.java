package inflearn_study;

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class BinaryTree {
    Node root;
    public void dfs(Node root) {
        if (root == null) return;
        else {
            dfs(root.lt);
            System.out.print(root.data + " "); // 중위순위
            dfs(root.rt);
        }
    }
    public static void main(String[] args) {
        BinaryTree T = new BinaryTree();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        T.root.rt.rt = new Node(7);
        T.dfs(T.root);
    }
}
