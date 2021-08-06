package Binary_Tree;

public class DiameterOfBinaryTree {
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

    static int height(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    // Function to return the diameter of a Binary Tree.
    static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        // when diameter is through the root
        int lheight = height(root.left);
        int rheight = height(root.right);
        int currdiameter = lheight + rheight + 1;
        // when diameter is not through the root.
        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);
        return Math.max(currdiameter, Math.max(ldiameter, rdiameter));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Function Call
        System.out.println("The diameter of given binary tree is : " + diameter(root));
    }

}
