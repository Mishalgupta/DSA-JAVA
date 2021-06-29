package Binary_Tree;

public class TopViewOfBinaryTree {

//  Method-Using queue
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(N)
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

    static void topView(Node root) {

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
        System.out.println("Top view is:");
        topView(root);

    }

}
