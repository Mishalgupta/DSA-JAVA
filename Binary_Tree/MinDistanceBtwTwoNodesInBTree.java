package Binary_Tree;

public class MinDistanceBtwTwoNodesInBTree {
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

//    Expected Time Complexity: O(N).
//    Expected Auxiliary Space: O(Height of the Tree).
    static Node LCA(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }

        // Look for n1 and n2 in left and right subtrees
        Node left = LCA(root.left, n1, n2);
        Node right = LCA(root.right, n1, n2);
        if (left != null && right != null) {
            return root;
        }
        if (left == null && right == null) {
            return null;
        }
        if (left != null) {
            return left;
        }
        return right;
    }

    // function to calculate the distance
    static int path(Node root, int k, int dist) {
        if (root == null) {
            return -1;
        }
        // we return this dist finally after traversing left & right
        if (root.data == k) {
            return dist;
        }
        // check on left side
        int left = path(root.left, k, dist + 1);
        // if k is present in left then return left else check in right side
        if (left != -1) {
            return left;
        }
        // check on right side
        return path(root.right, k, dist + 1);
    }

    static int findDist(Node root, int a, int b) {
        if (root == null) {
            return -1;
        }
        // here using lca we find the last common point of both nodes,
        // & the take it as root for calculating min distance.
        Node lca = LCA(root, a, b);
        int left = path(lca, a, 0);
        int right = path(lca, b, 0);
        return left + right;
    }

    public static void main(String[] args) {
        // construct binary tree as shown in
        // above diagram
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);
//        root.right.left = new Node(12);
//        root.left.right = new Node(5);
//        root.right.right.left = new Node(14);
        System.out.println("min distance is: " + findDist(root, 4, 5));
    }

}
