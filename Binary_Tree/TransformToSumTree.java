package Binary_Tree;

public class TransformToSumTree {

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
        System.out.print(root.data + " ");
        return a + b + x;
    }

    static void sum(Node root) {
        if (root == null) {
            return;
        }
        solve(root);
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
        System.out.println("sum of Tree : ");
        sum(root);
    }

}
