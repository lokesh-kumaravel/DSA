import java.util.*;

// Definition for a binary tree node.
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

public class ReverseOddLevels {
    
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;

        while (!q.isEmpty()) {
            int n = q.size();
            List<TreeNode> list = new ArrayList<>();
            Queue<TreeNode> q1 = new LinkedList<>();

            // Collect nodes of the current level
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                list.add(node); // Add the current node to the list for value swapping
                if (node.left != null) {
                    q.add(node.left);
                    q1.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                    q1.add(node.right);
                }
            }

            // Reverse values at odd levels
            if (level % 2 == 1) {
                // Collect the values of the nodes at this level
                List<Integer> values = new ArrayList<>();
                for (TreeNode node : list) {
                    values.add(node.val);
                }
                Collections.reverse(values); // Reverse the values list

                // Assign the reversed values back to the original nodes
                for (int i = 0; i < list.size(); i++) {
                    list.get(i).val = values.get(i); // Assign reversed value
                }
            }
            level++;
        }
        return root;
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        ReverseOddLevels solution = new ReverseOddLevels();
        solution.reverseOddLevels(root);
        
        // Add code to print or verify the structure of the tree after modification
    }
}
