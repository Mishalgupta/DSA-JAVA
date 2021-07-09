package BinarySearchTree;

public class PopulateInorderSuccOfAllNodesBST {
    // Bst node
    static class Node {
        int data;
        Node left, right, next;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    static Node prev = null;

//    Expected Time Complexity: O(N)
//    Expected Auxiliary Space: O(h)
    static void solve(Node root) {
        if (root == null) {
            return;
        }
        // iterate till left subtree end
        solve(root.left);
        if (prev != null) {
            prev.next = root;
        }
        prev = root;
        // iterating for right subtree
        solve(root.right);
    }

    public static void populateNext(Node root) {
        prev = null;
        solve(root);
    }

    public static void main(String[] args) {
//         10
//        /   \
//       8     12
//      /       \
//     3         14
//    /
//   1     
        Node root = new Node(10);
        root.left = new Node(8);
        root.left.left = new Node(3);
        root.left.left.left = new Node(1);
        root.right = new Node(12);
        root.right.right = new Node(14);
        populateNext(root);
        // Let us see the populated values
        // first point the pointer ptr to extreme left of left subtree
        Node ptr = root.left.left.left;
        while (ptr != null) {
            // -1 is printed if there is no successor
            int print = ptr.next != null ? ptr.next.data : -1;
            System.out.println("Next of " + ptr.data + " is: " + print);
            ptr = ptr.next;
        }
    }

}
