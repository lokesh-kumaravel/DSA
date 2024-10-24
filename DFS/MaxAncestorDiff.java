class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {}
    
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
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }

    private int dfs(TreeNode node, int currentMax, int currentMin) {
        if (node == null) {
            return currentMax - currentMin;
        }
        
        // Update the current maximum and minimum
        currentMax = Math.max(currentMax, node.val);
        currentMin = Math.min(currentMin, node.val);
        
        // Recur for left and right children
        int leftDiff = dfs(node.left, currentMax, currentMin);
        int rightDiff = dfs(node.right, currentMax, currentMin);
        
        // Return the maximum difference found in either subtree
        return Math.max(leftDiff, rightDiff);
    }
}

public class MaxAncestorDiff {
    public static void main(String[] args) {
        // Create a sample binary tree:
        //        8
        //      /   \
        //     3     10
        //    / \      \
        //   1   6      14
        //      / \    /
        //     4   7  13
        
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);
        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);

        Solution solution = new Solution();
        int result = solution.maxAncestorDiff(root);
        System.out.println("Maximum Ancestor Difference: " + result); // Output should be 7 (for example, 8 - 1)
    }
}
