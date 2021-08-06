package BinarySearchTree;

public class KthLargestElementInBST {
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

// Method: The idea is to do reverse inorder traversal of BST.
//  The reverse inorder traversal traverses all nodes in decreasing order.
//  While doing the traversal, we keep track of count of nodes visited so far.
//  When the count becomes equal to k, we stop the traversal and print the key.

//    Expected Time Complexity: O(h+k).
//    The code first traverses down to the rightmost node which takes O(h) time, 
//    then traverses k elements in O(k) time. 
//    Therefore overall time complexity is O(h + k).
//    Expected Auxiliary Space: O(Height of the BST).
    static int count = 0, ans = -1;

    static int inorder(Node root, int k) {
        if (root == null) {
            return -1;
        }
        // reverse inorder treversal
        inorder(root.right, k);
        count++;
        if (count == k) {
            ans = root.data;
        }
        inorder(root.left, k);
        return ans;
    }

    // return the Kth largest element in the given BST rooted at 'root'
    public static int kthLargest(Node root, int K) {
        int res = inorder(root, K);
        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(13);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);
        System.out.println("Kth Largest Element is: ");
        int k = 6;
        System.out.println(kthLargest(root, k));
    }

}
