package BinarySearchTree;

public class PredecessorSuccessorBST {
    // Bst node
    static class Node {
        int data;
        Node left, right;

        public Node() {
        }

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

//Time: O(h)
//Space: O(h)
// these are nodes to store pre , succ values for the result
    static Node pre = new Node(), suc = new Node();

    static void preSuc(Node root, int val) {
        if (root == null) {
            return;
        }
        // If key is present at root
        if (root.data == val) {

            // The maximum value in left
            // subtree is predecessor
            // for predecessor we have to move one step left then extreme right.
            if (root.left != null) {
                Node tmp = root.left;
                while (tmp.right != null) {
                    tmp = tmp.right;
                }
                pre = tmp;
            }

            // The minimum value in
            // right subtree is successor
            // for successor we have to move one step right then extreme left.
            if (root.right != null) {
                Node tmp = root.right;
                while (tmp.left != null) {
                    tmp = tmp.left;
                }
                suc = tmp;
            }
            return;
        }
        // If key is smaller than
        // root's key, go to left subtree
        if (root.data > val) {
            suc = root;
            preSuc(root.left, val);
        }
        // Go to right subtree
        else if (root.data < val) {
            pre = root;
            preSuc(root.right, val);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(13);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);
        System.out.println("Bst predecessor & Successor: ");
        preSuc(root, 10);
        if (pre != null) {
            System.out.println("Predecessor is " + pre.data);
        } else {
            System.out.println("No Predecessor");
        }
        if (suc != null) {
            System.out.println("Successor is " + suc.data);
        } else {
            System.out.println("No Successor");
        }
    }

}
