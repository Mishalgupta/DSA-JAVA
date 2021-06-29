package Binary_Tree;

import java.util.*;

public class DiagonalTraversalOfBTree {

//  Method - Using recursive
//Expected time complexity: O(N)
//Expected auxiliary space: O(N)
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

    static void Diagonal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> qu = new ArrayDeque<>();
        qu.add(root);
        while (!qu.isEmpty()) {
            Node curr = qu.poll();
            while (curr != null) {
                if (curr.left != null) {
                    qu.add(curr.left);
                }
                System.out.print((curr.data + " "));
                curr = curr.right;
            }
        }
    }

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
        System.out.println("Diagonal Traversal of Tree : ");
        Diagonal(root);
    }

}
