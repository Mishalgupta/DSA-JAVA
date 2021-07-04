package Binary_Tree;

public class IsomorphismTree {

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
//    Expected Time Complexity: O(min(M, N)) where M and N are the sizes of the two trees.
//    Expected Auxiliary Space: O(min(H1, H2)) where H1 and H2 are the heights of the two trees.
    static int maxSum = 0;

    static boolean isomorphic(Node root1, Node root2) {
        // if both of them are null (as we traverse till last recursively so at last
        // node becomes null at last)
        if (root1 == null && root2 == null) {
            return true;
        }
        // if one of them is null
        if (root1 == null || root2 == null) {
            return false;
        }
        // if root of both are equal
        if (root1.data != root2.data) {
            return false;
        }
        // moving the roots on either left or right depend on the below condition,
        // & after that recursively call the same function
        // & above 1 ,2 ,3 steps will check for each node
        boolean a = isomorphic(root1.left, root2.left) && isomorphic(root1.right, root2.right);
        boolean b = isomorphic(root1.left, root2.right) && isomorphic(root1.right, root2.left);
        // if any of the above condition satisfy then return a or b
        return (a || b);
    }

    public static void main(String[] args) {
        // construct binary tree as shown in
        // above diagram
        // tree 1
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.left.right.left = new Node(7);
        root1.left.right.right = new Node(8);

        // tree 2
        Node root2 = new Node(1);
        root2.left = new Node(3);
        root2.right = new Node(2);
        root2.right.left = new Node(4);
        root2.right.right = new Node(5);
        root2.left.right = new Node(6);
        root2.right.right.left = new Node(8);
        root2.right.right.right = new Node(7);

        System.out.println("IsIsomorphic is: " + isomorphic(root1, root2));
    }

}
