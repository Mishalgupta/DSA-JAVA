package Binary_Tree;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class DiameterOfBinaryTree {
    Node root;


    int height(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int lheight = height(root.left);
        int rheight = height(root.right);
        int currdiameter = lheight + rheight + 1;
        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);
        return Math.max(currdiameter, Math.max(ldiameter, rdiameter));
    }

    public static void main(String[] args) {
        DiameterOfBinaryTree tree = new DiameterOfBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Function Call
        System.out.println("The diameter of given binary tree is : " + diameter(root));
    }

}
