package Binary_Tree;

import java.util.*;

public class KSumPathsIBinaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int x) {
            data = x;
            left = right = null;
        }
    }

//   Method: The basic idea to solve the problem is to do a preorder traversal of the given tree. 
// Time: O(n*h*h) 
//  Space: O(n)
    static Vector<Integer> path = new Vector<Integer>();

    // This function prints all paths that have sum k
    static void printKPath(Node root, int k) {
        // empty node
        if (root == null) {
            return;
        }
        // add current node to the path
        path.add(root.data);

        // check if there's any k sum path
        // in the left sub-tree.
        printKPath(root.left, k);

        // check if there's any k sum path
        // in the right sub-tree.
        printKPath(root.right, k);

        // check if there's any k sum path that
        // terminates at this node
        // Traverse the entire path
        int f = 0;
        for (int j = path.size() - 1; j >= 0; j--) // O(h)
        {
            f += path.get(j);

            // If path sum is k, print the path
            if (f == k)
                for (int m = j; m < path.size(); m++) // O(h^2)
                {
                    System.out.print(path.get(m) + " ");
                }
            System.out.println();
        }

        // Remove the current element from the path
        path.remove(path.size() - 1);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(1);
        root.left.right.left = new Node(1);
        root.right = new Node(-1);
        root.right.left = new Node(4);
        root.right.left.left = new Node(1);
        root.right.left.right = new Node(2);
        root.right.right = new Node(5);
        root.right.right.right = new Node(2);

        int k = 5;
        printKPath(root, k);

    }

}
