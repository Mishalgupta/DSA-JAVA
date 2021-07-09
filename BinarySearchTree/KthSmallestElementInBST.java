package BinarySearchTree;

public class KthSmallestElementInBST {
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

// Method: The idea is to do inorder traversal of BST.
//  The inorder traversal traverses all nodes in increasing order.
//  While doing the traversal, we keep track of count of nodes visited so far.
//  When the count becomes equal to k, we stop the traversal and print the key.

//    Expected Time Complexity: O(k).
//    Expected Auxiliary Space: O(Height of the BST).
    static int count = 0, ans = -1;

    static int inorder(Node root, int k) {
        if (root == null) {
            return -1;
        }
        inorder(root.left, k);
        count++;
        if (count == k) {
            ans = root.data;
        }
        inorder(root.right, k);
        return ans;
    }

    // return the Kth smallest element in the given BST rooted at 'root'
    public static int kthSmallest(Node root, int K) {
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
        System.out.println("Kth Smallest Element is: ");
        int k = 6;
        System.out.println(kthSmallest(root, k));
    }
}
