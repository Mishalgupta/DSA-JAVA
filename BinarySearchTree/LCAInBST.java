package BinarySearchTree;

public class LCAInBST {
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

//    Expected Time Complexity: O(Height of the BST).
//    Expected Auxiliary Space: O(Height of the BST).
    static Node LCA(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
//        If both n1 and n2 are smaller than data at current node,
//        call the function recursively for finding LCA in the left subtree.
        if (root.data > n1 && root.data > n2) {
            return LCA(root.left, n1, n2);
        }
//        If both n1 and n2 are greater than data at current node, 
//        call the function recursively for finding LCA in the right subtree.
        else if (root.data < n1 && root.data < n2) {
            return LCA(root.right, n1, n2);
        }

//       Otherwise, current node is LCA (assuming that both n1 and n2 are present in BST)
        // if(root.data==n1 || root.data==n2){
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(4);
        root.left.left = new Node(3);
        root.right = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);
        System.out.println("Lowest common ancestor is: ");
        Node res = LCA(root, 7, 8);
        System.out.println(res.data);
    }

}
