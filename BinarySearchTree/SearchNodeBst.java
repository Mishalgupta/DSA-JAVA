package BinarySearchTree;

public class SearchNodeBst {
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

//Expected Time Complexity: O(logn)
//Expected Auxiliary Space: O(1).
    static boolean search(Node root, int val) {
        if (root == null) {
            return false;
        }
        if (root.data == val) {
            return true;
        }
        if (root.data > val) {
            return search(root.left, val);
        } else if (root.data < val) {
            return search(root.right, val);
        }
        return false;
    }

    public static void main(String[] args) {
        // BST
//         10
//        /  \
//       2    13
//        \   / \
//         8 12 15
//              /
//             14
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(13);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);
        System.out.println("Bst Node exist: ");
        System.out.println(search(root, 2));
    }

}
