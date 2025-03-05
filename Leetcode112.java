class TreeNode {
    int val;
    TreeNode left, right;


    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null && targetSum - root.val == 0) {
            return true;
        }

        targetSum -= root.val;

        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}

public class Leetcode112 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null);
        root.right = new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1)));

        int targetSum1 = 22;  
        int targetSum2 = 26;  
        int targetSum3 = 27;  

        System.out.println("Has Path Sum 22? " + sol.hasPathSum(root, targetSum1));  
        System.out.println("Has Path Sum 26? " + sol.hasPathSum(root, targetSum2));  
        System.out.println("Has Path Sum 27? " + sol.hasPathSum(root, targetSum3));  
    }
}
