package Q1;

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    
    public void insert(int value) {
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.val)
            root.left = insertRec(root.left, value);
        else if (value > root.val)
            root.right = insertRec(root.right, value);

        
        return root;
    }
}
