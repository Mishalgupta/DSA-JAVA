package Binary_Tree;

import java.util.*;

public class ZigZagTraversalBTree {

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

    static void zigZag(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> qu = new ArrayDeque<>();
        qu.add(root);
        int s = 0;
        while (!qu.isEmpty()) {
            ArrayList<Integer> arr = new ArrayList<>();
            int n = qu.size();
            for (int i = 0; i < n; i++) // O(N)
            {
                Node curr = qu.poll();
                arr.add(curr.data);
                if (curr.left != null) {
                    qu.add(curr.left);
                }
                if (curr.right != null) {
                    qu.add(curr.right);
                }
            }
            for (int i = 0; i < n; i++) // O(N)
            {
                if (s % 2 == 0) {
                    System.out.print(arr.get(i) + " ");
                } else {
                    System.out.print(arr.get(n - i - 1) + " ");
                }
            }
            s = s + 1;
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
        System.out.println("zig-zag Traversal of Tree : ");
        zigZag(root);
    }

}
