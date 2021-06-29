package Binary_Tree;

public class MirorOfBinaryTree {
    // Time: O(n)
    // Space: O(n)
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            this.left = null;
            this.right = null;
            this.data = item;
        }
    }

    // Function to perform preorder traversal on a given binary tree
    // this traversal is used to print the mirror image of tree on console
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void mirrorView(Node root) {
        // base case: if the tree is empty
        if (root == null) {
            return;
        }
        mirrorView(root.left); // processing for left subtree
        mirrorView(root.right); // processing for right subtree
        // swapping above calls.
        // swap left subtree with right subtree
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static void main(String[] args) {
        // construct binary tree as shown in
        // above diagram
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        System.out.println("Mirror image of binary tree is:");
        mirrorView(root);
        preorder(root);
    }
}
