package Q2;


public class BinarySearchTreeSearch {
    public boolean search(TreeNode root, int key) {
        if (root == null) {
            return false;
        } else if (key == root.val) {
            return true;
        } else if (key < root.val) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
}