

import java.util.LinkedList;
import java.util.Queue;

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

public class IsCousins {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) {
            return false;
        }
        int depthx = 0;
        int depthy = -1;
        q.add(root);
        int order = 0;

        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                if (node.left != null && node.right != null) {
                    if (node.left.val == x && node.right.val == y) return false;
                    if (node.left.val == y && node.right.val == x) return false;
                }
                if (node.val == x) {
                    depthx = order;
                }
                if (node.val == y) {
                    depthy = order;
                }
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            order++;
        }
        return depthx == depthy;
    }
}
