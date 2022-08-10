import util.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode createBalancedTree(int[] arr) {
        return createBalancedTree(arr, 0, arr.length - 1);
    }

    public TreeNode createBalancedTree(int[] arr, int start, int end) {
        if (end < start) {
          return null;
        }
        int mid = (int) Math.floor((start + end) / 2);
        TreeNode node = new TreeNode(arr[mid]);
        
        node.setLeft(createBalancedTree(arr, start, mid - 1));
        node.setRight(createBalancedTree(arr, mid + 1, end));
        
        return node;
    }
}
