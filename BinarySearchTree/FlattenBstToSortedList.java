package BinarySearchTree;

public class FlattenBstToSortedList {
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

//Time: O(N)
//Space:O(H)    
    static void inorder(Node curr, Node prev) {
        if (curr == null) {
            return;
        }
        inorder(curr.left, prev);
        prev.left = null;
        prev.right = curr;
        prev = curr;
        inorder(curr.right, prev);
    }

    static Node flatten(Node root) {
        Node temp = new Node(-1);
        Node prev = temp;
        inorder(root, prev);
// for last node since both left & right will null
        prev.left = null;
        prev.right = null;

        Node res = temp.right;
        return res;
    }

    // Function to print flattened
    // binary Tree
    static void print(Node root) {
        Node curr = root;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);
        System.out.println("Flatten BST To sorted list: ");
        flatten(root);
        print(root);
    }

}
