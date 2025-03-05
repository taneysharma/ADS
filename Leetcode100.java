import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    // Constructors
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
}

public class Leetcode100 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        TreeNode tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        TreeNode tree2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        TreeNode tree3 = new TreeNode(1, new TreeNode(2), null);

        System.out.println(sol.isSameTree(tree1, tree2)); 
        System.out.println(sol.isSameTree(tree1, tree3)); 
    }
}
