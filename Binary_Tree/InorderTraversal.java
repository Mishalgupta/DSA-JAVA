package Binary_Tree;

import java.util.Stack;

public class InorderTraversal {

    // Root of Binary Tree
    Node root;

    InorderTraversal() {
        root = null;
    }

    // Method 1- Recursive
//    Expected Time Complexity: O(N).
//    Expected Auxiliary Space: O(N).
//    void printInorder(Node node) {
//        if (node == null)
//            return;
//
//        // first deal with the node
//        System.out.print(node.key + " ");
//
//        // now recur on left subtree
//        printInorder(node.left);
//
//        // then recur on right subtree
//        printInorder(node.right);
//    }

    // Method 2- iterative
//  Expected Time Complexity: O(N).
//  Expected Auxiliary Space: O(N). 
    void printInorder(Node root) {
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
                System.out.print(curr.key + " ");
                curr = curr.right;
            }
        }
    }

    void printInorder() {
        printInorder(root);
    }

    // Driver method
    public static void main(String[] args) {
        InorderTraversal tree = new InorderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal of binary tree is: ");
        tree.printInorder();
    }

}
