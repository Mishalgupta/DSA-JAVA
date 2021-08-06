package Binary_Tree;

import java.util.Stack;

public class PreorderTraversal {
    // Binary tree node
    private static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Method 1- Recursive
//    Expected Time Complexity: O(N).
//    Expected Auxiliary Space: O(N).
//    static void printPreorder(Node node) {
//        if (node == null)
//            return;
//        // first deal with the node
//        System.out.print(node.data + " ");
//
//        // now recur on left subtree
//        printPreorder(node.left);
//
//        // then recur on right subtree
//        printPreorder(node.right);
//
//    }

    // Method 2- iterative
//  Expected Time Complexity: O(N).
//  Expected Auxiliary Space: O(N). 
    static void printPreorder(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        // look while stack is not empty
        while (!stack.empty()) {
            Node curr = stack.pop();
            System.out.print(curr.data + " ");
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
    }

    // Driver method
    public static void main(String[] args) {
        // construct binary tree as shown in
        // above diagram
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        printPreorder(root);
    }

}