package BinarySearchTree;

public class InsertBst {
    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    // Expected Time Complexity: O(logn)
//    Expected Auxiliary Space: O(n).
    static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 5);
        insert(root, 1);
        insert(root, 3);
        insert(root, 4);
        insert(root, 2);
        insert(root, 7);
        System.out.println("Bst Inserted elements are: ");
        inorder(root);
    }

}
