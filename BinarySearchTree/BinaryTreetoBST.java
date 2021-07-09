package BinarySearchTree;

import java.util.*;

public class BinaryTreetoBST {
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

//    Expected Time Complexity: O(nLogn) for sorting the inorder traversal array.
//    Expected Auxiliary Space: O(N) for storing inorder traversal.
    static int i = 0;

    // finding the inorder treversal of BTree & storing it in arraylist
    static void inorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }

    // construction of BST using data stored in arraylist
    static void toBST(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        toBST(root.left, arr);
        root.data = arr.get(i++);
        toBST(root.right, arr);
    }

    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    static Node binaryTreeToBST(Node root) {
        if (root == null) {
            return root;
        }
        i = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        // sort arraylist for BST construction
        Collections.sort(arr);
        toBST(root, arr);
        return root;
    }

    /* Utility function to print inorder traversal of Binary Tree */
    static void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    public static void main(String[] args) {
        Node root = null;

//        Constructing tree given in the above figure
//           10
//          / \
//         30  15
//        /      \
//       20       5 
        root = new Node(10);
        root.left = new Node(30);
        root.right = new Node(15);
        root.left.left = new Node(20);
        root.right.right = new Node(5);

        // convert Binary Tree to BST
        binaryTreeToBST(root);

        System.out.println("Following is Inorder Traversal of the converted BST: ");
        printInorder(root);
    }

}
