package BinarySearchTree;

public class MaxMinInBst {
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

//    Expected Time Complexity: O(log(n))
//    Expected Auxiliary Space: O(h).
    // Function to find the minimum element in the given BST.
    static int min(Node node) {
        if (node == null) {
            return 0;
        }
        while (node.left != null) {
            node = node.left;
        }
        return node.data;
    }

    // Function to find the maximum element in the given BST.
    static int max(Node node) {
        if (node == null) {
            return 0;
        }
        while (node.right != null) {
            node = node.right;
        }
        return node.data;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(13);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);
        System.out.println("Bst min. node is: ");
        System.out.println(min(root));
        System.out.println("Bst max. node is: ");
        System.out.println(max(root));

    }

}
