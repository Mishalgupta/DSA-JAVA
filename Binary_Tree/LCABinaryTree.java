package Binary_Tree;

import java.util.*;

public class LCABinaryTree {
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

    // Method 1 - (By Storing root to n1 and root to n2 paths)
    // Expected Time Complexity: O(N)
    // Expected Auxiliary Space: O(N)
//    static boolean getPath(Node root, int key, List<Integer> path) {
//        if (root == null) {
//            return false;
//        }
//        // Store this node . The node will be removed if
//        // not in path from root to n.
//        path.add(root.data);
//        if (root.data == key) {
//            return true;
//        }
//        if (getPath(root.left, key, path) || getPath(root.right, key, path)) {
//            return true;
//        }
//        // If not present in subtree rooted with root, remove root from
//        // path[] and return false
//        path.remove(path.size() - 1);
//        return false;
//    }

    // Function to return the lowest common ancestor in a Binary Tree.
//    static int lca(Node root, int n1, int n2) {
//        List<Integer> path1 = new ArrayList<>();
//        List<Integer> path2 = new ArrayList<>();
//        if (!getPath(root, n1, path1) || !getPath(root, n2, path2)) {
//            return -1;
//        }
//
//        int i;
//        for (i = 0; i < path1.size() && i < path2.size(); i++)
//            if (path1.get(i) != path2.get(i)) {
//                break;
//
//            }
//        return path1.get(i - 1);
//    }
    // Method 2 - Using recursion (Using Single Traversal)
    // Expected Time Complexity: O(N)
    // Expected Auxiliary Space: O(N)
    static Node lca(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);
        if (leftLca != null && rightLca != null) {
            return root;
        }
        if (leftLca != null) {
            return leftLca;
        }
        return rightLca;
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
        root.right.left = new Node(12);
        root.right.right = new Node(15);
        root.right.right.left = new Node(14);
         System.out.println("LCA is: " + lca(root, 12, 14).data);
//        System.out.println("LCA is: " + lca(root, 12, 14));
    }

}