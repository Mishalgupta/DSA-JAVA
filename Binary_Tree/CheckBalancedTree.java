package Binary_Tree;

public class CheckBalancedTree {

//  Method - Using recursive
//Expected time complexity: O(N)
//Expected auxiliary space: O(h) , where h = height of tree
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

    static boolean res = true;

    // finding height of left & right subtree
    static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int hl = height(root.left);
        int hr = height(root.right);
        // if difference is greater than 1 then it's unbalanced
        if (Math.abs(hl - hr) > 1) {
            res = false;
        }
        return Math.max(hl, hr) + 1;
    }

    static boolean balanced(Node root) {
        res = true;
        height(root);
        return res;
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
        System.out.println("Tree is Balanced or not: " + balanced(root));
    }

}