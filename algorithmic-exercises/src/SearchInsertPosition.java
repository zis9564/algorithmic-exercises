public class SearchInsertPosition {

    int result;

    public int searchInsert(int[] nums, int target) {
        if(target < nums[0]) return -1;
        if(target > nums[nums.length-1]) return nums.length;

        Node node = arrayToBinaryTree(nums, 0, nums.length-1);
        iterate(node, target);
        return nums[result] < target? ++result : result;
    }

    void iterate(Node node, int target) {
        if (node == null) {
            return;
        } 
        else if(node.data > target) {
            //System.out.println("(>) data:" + node.data + "index:" + node.index + ";");
            result = node.index;
            iterate(node.left, target);
        }
        else if(node.data < target) {
            //System.out.println("(<) data:" + node.data + "index:" + node.index + ";");
            result = node.index;
            iterate(node.right, target);
        }
        else if(node.data == target) {
            //System.out.println("(==) data:" + node.data + "index:" + node.index + ";");
            result = node.index;
        }
        return;
    }

    public Node arrayToBinaryTree(int[] nums, int start, int end) {
        if(start > end) return null;
        
        int mid = (start + end) / 2;
        Node node = new Node(mid, nums[mid]);
 
        node.left = arrayToBinaryTree(nums, start, mid -1);
        node.right = arrayToBinaryTree(nums, mid + 1, end);
        return node;
    }
}

class Node {
    int index;
    int data;
    Node left;
    Node right;
     
    Node(int i, int d) {
        index = i;
        data = d;
        left = null;
        right = null;
    }
}

