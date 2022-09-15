public class MaximumDepthOfBinaryTree {
    
    public int maxDepth(TreeNode root) {
    if (root == null) 
    return 0; 
    int leftDepth = maxDepth(root.left); 
    int rightDepth = maxDepth(root.right); 
    if (leftDepth > rightDepth) 
        return (leftDepth + 1); 
    else 
        return (rightDepth + 1); 
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