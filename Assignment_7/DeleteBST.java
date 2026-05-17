public class DeleteBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node delete(Node root, int key) {

        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = delete(root.left, key);
        }

        else if (key > root.data) {
            root.right = delete(root.right, key);
        }

        else {

            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            Node successor = findMin(root.right);

            root.data = successor.data;

            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    Node findMin(Node root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void main(String[] args) {

        DeleteBST tree = new DeleteBST();

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        root = tree.delete(root, 70);

        System.out.println("Deleted Successfully");
    }
}