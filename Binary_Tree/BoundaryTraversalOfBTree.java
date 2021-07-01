package Binary_Tree;

public class BoundaryTraversalOfBTree {

//  Method - Using recursive
//Expected time complexity: O(N)
//Expected auxiliary space: O(Height of the Tree).
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

    static void left(Node node) {
        if (node == null) {
            return;
        }
        // to ensure top down order, print the node
        // before calling itself for left subtree
        if (node.left != null) {
            System.out.print(node.data + " ");
            left(node.left);
        } else if (node.right != null) {
            System.out.print(node.data + " ");
            left(node.right);
        }
        // do nothing if it is a leaf node, this way we avoid
        // duplicates in output
    }

    static void leaf(Node node) {
        if (node == null) {
            return;
        }
        leaf(node.left);
        // Print it if it is a leaf node
        if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }
        leaf(node.right);
    }

    static void right(Node node) {
        if (node == null) {
            return;
        }
        // to ensure bottom up order, first call for right
        // subtree, then print this node
        if (node.right != null) {
            right(node.right);
            System.out.print(node.data + " ");
        } else if (node.left != null) {
            right(node.left);
            System.out.print(node.data + " ");
        }
        // do nothing if it is a leaf node, this way we avoid
        // duplicates in output
    }

    static void Boundary(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        // Print the left boundary in top-down manner.
        left(root.left);
        // Print all leaf nodes
        leaf(root);
        // Print the right boundary in bottom-up manner
        right(root.right);
    }

    public static void main(String[] args) {
        // construct binary tree as shown in
        // above diagram
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);
        System.out.println("Boundary Traversal of Tree : ");
        Boundary(root);
    }

}
