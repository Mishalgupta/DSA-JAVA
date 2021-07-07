package BinarySearchTree;

public class PredecessorSuccessorBST {
    // Bst node
    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    static Node pre = new Node(), suc = new Node();

    static Node pre(Node root) {

    }

    static void preSuc(Node root, int val) {
        if (root == null) {
            return;
        }
        if (root.data > val) {
            suc = root;
            preSuc(root.left, val);
        } else if (root.data < val) {
            Node pre = root;
            preSuc(root.right, val);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(13);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);
        System.out.println("\nBst predecessor & Successor: ");
        preSuc(root, 13);

    }

}
