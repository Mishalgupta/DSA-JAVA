package Binary_Tree;

import java.util.*;

public class DuplicateSubtree {

    // Method-Using hashmap & recursion
    // Time: O(N)
    // Space: O(N)
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static HashMap<String, Integer> hs = new HashMap<>();

    static String solve(Node root) {
        if (root == null) {
            return "$";
        }
        // string for storing the node value for comparision
        String s = "";
        s = s + root.data;
        s = s + solve(root.left);
        s = s + solve(root.right);
        // check if duplicate exist or not if exist then increment the count
        // & put node value in the string s
        if (hs.containsKey(s)) {
            hs.put(s, hs.get(s) + 1);
        }
        // if no duplication then set value of string to 1
        else {
            hs.put(s, 1);
        }
        return s;

    }

    // Function to return the diameter of a Binary Tree.
    static boolean duplicate(Node root) {
        if (root == null) {
            return false;
        }
        solve(root);
        for (Map.Entry<String, Integer> map : hs.entrySet()) {
            String s = (String) map.getKey();
            int value = (int) map.getValue();
            // if length of duplicate string > 3
            if (value >= 2 && s.length() > 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(4);
        root.right.right = new Node(5);

        // Function Call
        System.out.println("The duplicate exist in given binary tree : " + duplicate(root));
    }

}
