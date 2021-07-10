package BinarySearchTree;

public class CheckBSTContainsDeadEnd {
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

//  Expected Time Complexity: O(N).
//  Expected Auxiliary Space: O(Height of the BST).
    static boolean solve(Node root, int min, int max) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            if (min == max) {
                return true;
            }
            return false;
        }
        boolean leftEnd = solve(root.left, min, root.data - 1);
        boolean rightEnd = solve(root.right, root.data + 1, max);
        // if any of left or right return true or false we return that result
        return (leftEnd || rightEnd);

    }

    static boolean isBST(Node root) {
        if (root == null) {
            return true;
        }
        boolean res = solve(root, 1, Integer.MAX_VALUE);
        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.left.left.left = new Node(1);
        root.right = new Node(9);
        System.out.println("Bst contains Dead end: ");
        System.out.println(isBST(root));
    }

}
