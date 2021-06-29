package Binary_Tree;

public class HeightOfBinaryTree {
    // Time: O(N)
    // Space: O(N)
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int item) {
            this.data = item;
            this.left = null;
            this.right = null;
        }
    }

    static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int hl = height(root.left);
        int hr = height(root.right);
        int res = Math.max(hl, hr);
        return res + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);

        // Function Call
        System.out.println("The height of given binary tree is : " + height(root));
    }

}
