package BinarySearchTree;

public class CountBSTNodesThatLieInGivenRange {
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

//    range l-h(inclusive), count the number of
//    nodes in the BST that lie in the given range.

//    Expected Time Complexity: O(N)
//    Expected Auxiliary Space: O(Height of the BST).
    static int count = 0;

    static int solve(Node root, int l, int h) {
        if (root == null) {
            return 0;
        }
        if (root.data >= l && root.data <= h) {
            count++;
            solve(root.left, l, h);
            solve(root.right, l, h);
        } else if (root.data < l) {
            solve(root.right, l, h);
        } else {
            solve(root.left, l, h);
        }
        return count;
    }

    static int count(Node root, int l, int h) {
        return solve(root, l, h);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(1);
        root.right = new Node(50);
        root.right.left = new Node(40);
        root.right.right = new Node(100);

        int l = 5, h = 45;
        System.out.println("Count os Bst nodes is: ");
        int res = count(root, l, h);
        System.out.println(res);
    }

}
