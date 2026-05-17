package Q3;

public class BinarySearchTreeDepth {
    public int depth(TreeNode root, int value) {
        if (root == null)
            return -1; 

        if (root.val == value)
            return 0;

        int leftDepth = depth(root.left, value);
        if (leftDepth != -1)
            return leftDepth + 1;

        int rightDepth = depth(root.right, value);
        if (rightDepth != -1)
            return rightDepth + 1;

        return -1; 
    }
}
