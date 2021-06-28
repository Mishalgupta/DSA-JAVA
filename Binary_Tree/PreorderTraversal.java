package Binary_Tree;

import java.util.Stack;

public class PreorderTraversal {
    // Root of Binary Tree
    Node root;

    PreorderTraversal() {
        root = null;
    }

    // Method 1- Recursive
//    Expected Time Complexity: O(N).
//    Expected Auxiliary Space: O(N).
//    void printPreorder(Node node) {
//        if (node == null)
//            return;
//        // first recur on right subtree
//        printPreorder(node.right);
//
//        // then deal with the node
//        System.out.print(node.key + " ");
//
//        // now recur on left subtree
//        printPreorder(node.left);
//
//    }

    // Method 2- iterative
//  Expected Time Complexity: O(N).
//  Expected Auxiliary Space: O(N). 
    void printPreorder(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            Node curr = stack.pop();
            System.out.print(curr.key + " ");
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
    }

    void printPreorder() {
        printPreorder(root);
    }

    // Driver method
    public static void main(String[] args) {
        PreorderTraversal tree = new PreorderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();
    }

}
