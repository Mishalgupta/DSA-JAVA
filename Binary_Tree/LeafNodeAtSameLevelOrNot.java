package Binary_Tree;

import java.util.*;

public class LeafNodeAtSameLevelOrNot {
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

//  Method 1 -Using iterative using queue
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(N)
//     static boolean leafNode(Node root) {
//        boolean res = true;
//        if (root == null) {
//            return res;
//        }
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        int curr = -1;
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                Node temp = queue.poll();
//                // Add left node to queue
//                if (temp.left != null) {
//                    queue.add(temp.left);
//                }
//                // Add right node to queue
//                if (temp.right != null) {
//                    queue.add(temp.right);
//                }
//                if (temp.left == null && temp.right == null) {
//                    if (i == 0) {
//                        curr = 1;
//                    } else if (i != 0 && curr != 1) {
//                        res = false;
//                        break;
//                    }
//                }
//            }
//        }
//        return res;
//    }

//  Method 2 - Using recursion
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(N)
    static boolean res = true;

    static void check(Node root, int h, int temp[]) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (temp[0] == -1) {
                temp[0] = h;
            } else if (temp[0] != h) {
                res = false;
            }
            return;
        }
        check(root.left, h + 1, temp);
        check(root.right, h + 1, temp);
    }

    static boolean leafNode(Node root) {
        int h = 0;
        int temp[] = new int[1];
        // used for updating the height
        temp[0] = -1;
        res = true;
        check(root, h, temp);
        return res;
    }

    // Driver code
    public static void main(String[] args) {
        // construct binary tree as shown in
        // above diagram
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(10);
        root.left.right = new Node(15);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);
        System.out.println("Leaf nodes are balanced: " + leafNode(root));
    }

}
