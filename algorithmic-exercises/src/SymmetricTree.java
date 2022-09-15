public class SymmetricTree {
    
    public boolean isSymmetric(TreeNode root) {
        return checkSymmetry(root.left, root.right);
    }

    private boolean checkSymmetry(TreeNode left, TreeNode right) {
        if(left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;
        if(left.val == right.val) {
            return checkSymmetry(left.left, right.right) && checkSymmetry(left.right, right.left);
        }
        return false;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}