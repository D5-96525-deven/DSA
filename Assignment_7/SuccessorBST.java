public class SuccessorBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node findSuccessor(Node root, Node target) {

        if (target.right != null) {
            return findMin(target.right);
        }

        Node successor = null;

        while (root != null) {

            if (target.data < root.data) {
                successor = root;
                root = root.left;
            }

            else if (target.data > root.data) {
                root = root.right;
            }

            else {
                break;
            }
        }

        return successor;
    }

    Node findMin(Node root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void main(String[] args) {

        SuccessorBST tree = new SuccessorBST();

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        Node successor = tree.findSuccessor(root, root);

        if (successor != null) {
            System.out.println("Successor: " + successor.data);
        }
    }
}