package Binary_Tree;

public class SumTreeOrNot {

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

    static int solve(Node root) {
        if (root == null) {
            return 0;
        }
        // Recursively call for left and right subtrees till last
        int a = solve(root.left);
        int b = solve(root.right);
        // storing root data in temp variable x
        int x = root.data;
        // updating node value with sum of left & right node
        root.data = a + b;
        return a + b + x;
    }

    static boolean sum(Node root) {
        if (root == null) {
            return true;
        }
        int sum = solve(root);
        // since this sum is the sum of all nodes including root,
        // but we need to compare only sum upto root, if it's valid or not
        // so, to do this we subtract the sum from root.data
        if (root.data == sum - root.data) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // construct binary tree as shown in
        // above diagram
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(2);
//        root.left.left = new Node(8);
//        root.left.right = new Node(-4);
//        root.right.left = new Node(7);
//        root.right.right = new Node(5);
        System.out.println("sum of Tree is valid : " + sum(root));
    }

}
