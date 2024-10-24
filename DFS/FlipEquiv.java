public class FlipEquiv {
    public static class TreeNode {
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

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode root2 = new TreeNode(1, new TreeNode(3), new TreeNode(2));

        boolean result = flipEquiv(root1, root2);
        System.out.println("Are the trees flip equivalent? " + result);
    }

    public static boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false; 
        }
        if (root1.val != root2.val) {
            return false;
        }
        boolean directMatch = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
        boolean flipMatch = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
        return directMatch || flipMatch;
    }
}
