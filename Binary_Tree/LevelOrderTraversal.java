package Binary_Tree;

import java.util.*;

public class LevelOrderTraversal {
//    Method-Using queue
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(N)
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

    // function to print level order traversal of binary tree
    private static void printLeftView(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.data + " ");
            // Add left node to queue
            if (temp.left != null) {
                queue.add(temp.left);
            }
            // Add right node to queue
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        // construct binary tree as shown in
        // above diagram
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);
        System.out.println("Level order traversal is:");
        printLeftView(root);
    }
}
