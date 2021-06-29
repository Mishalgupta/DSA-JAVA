package Binary_Tree;

import java.util.Stack;

public class InorderTraversal {

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
//    static void printInorder(Node node) {
//        if (node == null) {
//            return;
//        }
//
//        // first recur on left subtree
//        printInorder(node.left);
//
//        // now deal with the node
//        System.out.print(node.data + " ");
//
//        // then recur on right subtree
//        printInorder(node.right);
//    }

    // Method 2- iterative
//  Expected Time Complexity: O(N).
//  Expected Auxiliary Space: O(N). 
    static void printInorder(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node curr = root;
        // if the current node is null and the stack is also empty, we are done
        while (!stack.empty() || curr != null) {
            // if the current node exists, push it into the stack (defer it)
            // and move to its left child
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                // if the current node is null, pop an element from the stack,
                // print it, and finally set the current node to its right child.
                curr = stack.pop();
                System.out.print(curr.data + " ");
                curr = curr.right;
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
        System.out.println("Inorder traversal of binary tree is: ");
        printInorder(root);
    }

}
