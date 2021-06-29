package Binary_Tree;

import java.util.*;

public class ReverseLevelOrderTraversal {
//    Expected Time Complexity: O(N)
//    Expected Auxiliary Space: O(N)
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            this.data = item;
            this.left = null;
            this.right = null;
        }
    }

    static void ReverseLevelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> qu = new ArrayDeque<>();
        qu.add(root);
        Stack<Integer> st = new Stack<>();
        while (!qu.isEmpty()) {
            Node curr = qu.poll();
            st.push(curr.data);
            if (curr.right != null) {
                qu.add(curr.right);
            }
            if (curr.left != null) {
                qu.add(curr.left);
            }
        }
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }

    public static void main(String[] args) {
        // construct binary tree as shown in
        // above diagram
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
        System.out.println("Reverse Level order traversal is:");
        ReverseLevelOrder(root);
    }

}
