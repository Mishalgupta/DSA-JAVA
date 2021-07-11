package BinarySearchTree;

import java.util.*;

public class MergeTwoBalancedBST {
    // Bst node
    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

// Time: O(N+M) n for bst-1 & m for bst2
// Space: O(N+M) as we took two arraylist to store their inorder  

    // A Utility Method that stores inorder traversal of a tree
    public static ArrayList<Integer> storeInorder(Node node, ArrayList<Integer> list) {
        if (node == null)
            return list;

        // recur on the left child
        storeInorder(node.left, list);

        // Adds data to the list
        list.add(node.data);

        // recur on the right child
        storeInorder(node.right, list);

        return list;
    }

    // Method that merges two ArrayLists into one.
    static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2, int m, int n) {
        // list3 will contain the merge of list1 and list2
        ArrayList<Integer> list3 = new ArrayList<>();
        int i = 0;
        int j = 0;

        // Traversing through both ArrayLists
        while (i < m && j < n) {
            // Smaller one goes into list3
            if (list1.get(i) < list2.get(j)) {
                list3.add(list1.get(i));
                i++;
            } else {
                list3.add(list2.get(j));
                j++;
            }
        }

        // Adds the remaining elements of list1 into list3
        while (i < m) {
            list3.add(list1.get(i));
            i++;
        }

        // Adds the remaining elements of list2 into list3
        while (j < n) {
            list3.add(list2.get(j));
            j++;
        }
        return list3;
    }

    // Method that converts an ArrayList to a BST
    static Node ALtoBST(ArrayList<Integer> list, int start, int end) {
        // Base case
        if (start > end)
            return null;

        // Get the middle element and make it root
        int mid = (start + end) / 2;
        Node node = new Node(list.get(mid));

//      Recursively construct the left subtree and make it left child of root
        node.left = ALtoBST(list, start, mid - 1);

//      Recursively construct the right subtree and make it right child of root
        node.right = ALtoBST(list, mid + 1, end);

        return node;
    }

    // Method that merges two trees into a single one.
    static Node mergeTrees(Node node1, Node node2) {
        // temp1 stores inorder traversal of a tree
        ArrayList<Integer> temp1 = new ArrayList<>();
        // Stores Inorder of tree1 to list1
        ArrayList<Integer> list1 = storeInorder(node1, temp1);

        ArrayList<Integer> temp2 = new ArrayList<>();
        // Stores Inorder of tree2 to list2
        ArrayList<Integer> list2 = storeInorder(node2, temp2);

        // Merges both list1 and list2 into list3
        ArrayList<Integer> list3 = merge(list1, list2, list1.size(), list2.size());

        // Eventually converts the merged list into resultant BST
        Node node = ALtoBST(list3, 0, list3.size() - 1);
        return node;
    }

    // print final inorder traversal of the tree
    static void inorder(Node node) {
        if (node == null)
            return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
// Creating following tree as First balanced BST
//        100
//        / \
//       50  300
//       / \
//      20  70
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);

// Creating following tree as second balanced BST
//        80
//       /  \
//      40 120

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(3);
        root1.right.right = new Node(7);
        root1.right.right.left = new Node(6);
        Node res = mergeTrees(root, root1);
        System.out.println("The Inorder traversal of the merged BST is: ");
        inorder(res);
    }

}
