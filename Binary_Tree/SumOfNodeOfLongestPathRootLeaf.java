package Binary_Tree;

public class SumOfNodeOfLongestPathRootLeaf {
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

    static int maxHeight, maxSum;

    static void findMaxSum(Node root, int cursum, int curHeight) {
        if (root == null) {
            if (maxHeight < curHeight) {
                maxHeight = curHeight;
                maxSum = cursum;
            } else if (maxHeight == curHeight && maxSum < cursum) {
                maxSum = cursum;
            }
            return;
        }
        findMaxSum(root.left, root.data + cursum, curHeight + 1);
        findMaxSum(root.right, root.data + cursum, curHeight + 1);
    }

    public static int sumOfLongRootToLeafPath(Node root) {
        maxHeight = 0; // or level
        maxSum = 0;
        findMaxSum(root, 0, 0);
        return maxSum;
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
        System.out.println("Sum is: " + sumOfLongRootToLeafPath(root));
    }

}
