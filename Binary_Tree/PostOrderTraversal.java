package Binary_Tree;

import java.util.Stack;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class PostOrderTraversal {
    // Root of Binary Tree
    Node root;

    PostOrderTraversal() {
        root = null;
    }
    // Method 1- Recursive
//    Expected Time Complexity: O(N).
//    Expected Auxiliary Space: O(N).
//    void printPostorder(Node node) {
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
//        System.out.print(node.key + " ");
//    }

    // Method 2- iterative
//  Expected Time Complexity: O(N).
//  Expected Auxiliary Space: O(N).   
    void printPostorder(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        // create another stack to store postorder traversal
        Stack<Integer> out = new Stack<>();
        while (!stack.empty()) {
            Node curr = stack.pop();
            out.push(curr.key);
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

    void printPostorder() {
        printPostorder(root);
    }

    // Driver method
    public static void main(String[] args) {
        PostOrderTraversal tree = new PostOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Postorder traversal of binary tree is ");
        tree.printPostorder();
    }
}