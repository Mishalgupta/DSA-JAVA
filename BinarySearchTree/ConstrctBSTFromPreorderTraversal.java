package BinarySearchTree;

public class ConstrctBSTFromPreorderTraversal {
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

    static class Index {

        int index = 0;
    }

    static Index index = new Index();

//    Expected Time Complexity: O(N).
//    Expected Auxiliary Space: O(Height of the BST).
    static Node constructBST(int preorder[], Index preorderIdx, int key, int min, int max, int n) {
        if (preorderIdx.index >= n) {
            return null;
        }
        Node root = null;
        // If current element of preorder[] is in range, then
        // only it is part of current subtree
        if (key > min && key < max) {
            // Allocate memory for root of this
            // subtree and increment preorderIndex
            root = new Node(key);
            preorderIdx.index = preorderIdx.index + 1;
            if (preorderIdx.index < n) {
                // Construct the subtree under root
                // All nodes which are in range {min .. key}
                // will go in left subtree, and first such
                // node will be root of left subtree.
                root.left = constructBST(preorder, preorderIdx, preorder[preorderIdx.index], min, key, n);
            }
            if (preorderIdx.index < n) {
                // All nodes which are in range {key..max}
                // will go in right subtree, and first such
                // node will be root of right subtree.
                root.right = constructBST(preorder, preorderIdx, preorder[preorderIdx.index], key, max, n);
            }
        }
        return root;
    }

    static Node bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        return constructBST(preorder, index, preorder[0], Integer.MIN_VALUE, Integer.MAX_VALUE, n);
    }

    // A utility function to print preorder traversal of a
    // Binary Tree
    static void printpreorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        printpreorder(node.left);
        printpreorder(node.right);
    }

    public static void main(String[] args) {
        int pre[] = { 10, 5, 1, 7, 40, 50 };

        // Function call
        Node root = bstFromPreorder(pre);
        System.out.println("preorder traversal of the constructed tree is ");
        printpreorder(root);
    }

}
