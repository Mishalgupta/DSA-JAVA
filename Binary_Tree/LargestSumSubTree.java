package Binary_Tree;

public class LargestSumSubTree {
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

//  Method 1 -Using recursion
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(N)
    static int maxSum = 0;

    static int solve(Node root) {
        if (root == null) {
            return 0;
        }
        int l = solve(root.left);
        int r = solve(root.right);
        // updating maxSum for every subtree
        maxSum = Math.max(maxSum, l + r + root.data);
        return l + r + root.data;
    }

    static int largestSum(Node root) {
        solve(root);
        return maxSum;
    }

    public static void main(String[] args) {
        // construct binary tree as shown in
        // above diagram
        
        Node root = new Node(1);
        root.left = new Node(-2);
        /*
                 1
               /   \
             -2     3
             / \   /  \
            4   5 -6   2
        */
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(-6);
        root.right.right = new Node(2);
        System.out.println("Largest Sum Substree is: " + largestSum(root));
    }
}
