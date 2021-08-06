package BinarySearchTree;

import java.util.*;

public class ConvertNormalBSTIntoBalancedBST {
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
// Time: O(N) as we are traversing whole tree
// Space: O(N) used for storing nodes inorder traversal of bst  

//     This function traverse the skewed binary tree and stores its nodes pointers
//     in ArrayList nodes[]
    static ArrayList<Node> arr = new ArrayList<Node>();

    static void storeBSTNodes(Node root) {
        // Base case
        if (root == null) {
            return;
        }
        // Store nodes in Inorder (which is sorted
        // order for BST)
        storeBSTNodes(root.left);
        arr.add(root);
        storeBSTNodes(root.right);
    }

//       Recursive function to construct binary tree
    static Node buildTreeUtil(int start, int end) {
        // base case
        if (start > end) {
            return null;
        }
//      Get the middle element and make it root
        int mid = (start + end) / 2;
        Node node = arr.get(mid);
//       Using index in Inorder traversal, construct left and right subtress
        node.left = buildTreeUtil(start, mid - 1);
        node.right = buildTreeUtil(mid + 1, end);

        return node;
    }

    // This functions converts an unbalanced BST to
    // a balanced BST
    static Node buildTree(Node root) {
        // Store nodes of given BST in sorted order
        storeBSTNodes(root);
        // Constructs BST from nodes[] in sorted order
        int n = arr.size();
        return buildTreeUtil(0, n - 1);
    }

    // print the Balanced tree
    static void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.left.left = new Node(7);
        root.left.left.left = new Node(6);
        root.left.left.left.left = new Node(5);
        root = buildTree(root);
        System.out.println("Bst to balanced Bst: ");
        preOrder(root);
    }

}
