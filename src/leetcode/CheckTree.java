package leetcode;

public class CheckTree {
    public boolean checkTree(TreeNode root) {
        if(root.val == root.left.val + root.right.val) {
            return true;
        }
        return false;
    }
}
