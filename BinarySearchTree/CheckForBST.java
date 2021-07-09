package BinarySearchTree;

public class CheckForBST {
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

//    Expected Time Complexity: O(N).
//    Expected Auxiliary Space: O(Height of the BST).
    static boolean solve(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }

        if (min != null && root.data <= min.data) {
            return false;
        }
        if (max != null && root.data >= max.data) {
            return false;
        }

        boolean leftValid = solve(root.left, min, root);
        boolean rightValid = solve(root.right, root, max);
        // since both left & right subtree should be valid
        return (leftValid && rightValid);

    }

    // Function to check whether a Binary Tree is BST or not.
    static boolean isBST(Node root) {
        if (root == null) {
            return true;
        }
        boolean res = solve(root, null, null);
        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(13);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);
        System.out.println("Bst is valid: ");
        System.out.println(isBST(root));
    }

}
