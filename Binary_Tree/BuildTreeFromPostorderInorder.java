package Binary_Tree;

public class BuildTreeFromPostorderInorder {

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

//  Method - recursion
//Expected Time Complexity: O(N)
//Time Complexity: O(n^2) for worst case when the tree is left-skewed.
//Postorder and Inorder traversals for worst-case are {A, B, C, D} and {D, C, B, A}. 
//Expected Auxiliary Space: O(N)
    static int search(int inorder[], int start, int end, int curr) {
        int i;
        for (i = start; i <= end; i++) {
            if (inorder[i] == curr) {
                return i;
            }
        }
        return -1;
    }

    static int index;

    static Node tree(int inorder[], int postorder[], int start, int end) {
        if (start > end) {
            return null;
        }
        // stroing current value at the particular index
        int curr = postorder[index];
        index--;
        Node root = new Node(curr);
        // only one element is left in inorder. so to prevent left & right traversal we
        // return root here
        if (start == end) {
            return root;
        }
        int pos = search(inorder, start, end, curr);
        // In postorder right subtree will build first that's why we write it first
        root.right = tree(inorder, postorder, pos + 1, end);
        root.left = tree(inorder, postorder, start, pos - 1);
        return root;
    }

    public static Node buildTree(int inorder[], int postorder[], int n) {
        index = n - 1;
        return tree(inorder, postorder, 0, n - 1);
    }

    static void preorderprint(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorderprint(root.left);
        preorderprint(root.right);
    }

    public static void main(String[] args) {
        int postorder[] = { 8, 4, 5, 2, 6, 7, 3, 1 };
        int inorder[] = { 4, 8, 2, 5, 1, 6, 3, 7 };
        int n = inorder.length;
        Node res = buildTree(inorder, postorder, n);
        System.out.println("Tree from inorder & postorder is: ");
        preorderprint(res);
    }
}
