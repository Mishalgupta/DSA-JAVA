package Binary_Tree;

import java.util.Stack;

public class PostOrderTraversal {
    // node of Binary Tree
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Method 1- Recursive
//    Expected Time Complexity: O(N).
//    Expected Auxiliary Space: O(N).
//    static void printPostorder(Node node) {
//        if (node == null)
//            return;
//
//        // first recur on left subtree
//        printPostorder(node.left);
//
//        // then recur on right subtree
//        printPostorder(node.right);
//
//        // now deal with the node
//        System.out.print(node.data + " ");
//    }

    // Method 2- iterative
//  Expected Time Complexity: O(N).
//  Expected Auxiliary Space: O(N).   
    static void printPostorder(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        // create another stack to store postorder traversal
        Stack<Integer> out = new Stack<>();
        while (!stack.empty()) {
            Node curr = stack.pop();
            out.push(curr.data);
            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
        while (!out.isEmpty()) {
            System.out.print(out.pop() + " ");
        }
    }

    // Driver method
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Postorder traversal of binary tree is ");
        printPostorder(root);
    }
}