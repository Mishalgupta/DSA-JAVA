package Binary_Tree;

public class BuildTreeFromInorderPreorder {
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
//Preorder and Inorder traversals for worst-case are {A, B, C, D} and {D, C, B, A}. 
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

    static int index = 0;

    static Node tree(int inorder[], int preorder[], int start, int end) {
        if (start > end) {
            return null;
        }
        // stroing current value at the particular index
        int curr = preorder[index];
        index++;
        Node root = new Node(curr);
        // only one element is left in inorder. so to prevent left & right traversal we
        // return root here
        if (start == end) {
            return root;
        }
        int pos = search(inorder, start, end, curr);
        root.left = tree(inorder, preorder, start, pos - 1);
        root.right = tree(inorder, preorder, pos + 1, end);
        return root;
    }

    public static Node buildTree(int inorder[], int preorder[], int n) {
        index = 0;
        return tree(inorder, preorder, 0, n - 1);
    }

    static void postorderprint(Node root) {
        if (root == null) {
            return;
        }
        postorderprint(root.left);
        postorderprint(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        int preorder[] = { 1, 6, 7, 8 };
        int inorder[] = { 1, 6, 8, 7 };
        int n = inorder.length;
        Node res = buildTree(inorder, preorder, n);
        System.out.println("Tree from inorder & preorder is: ");
        postorderprint(res);
    }

}
