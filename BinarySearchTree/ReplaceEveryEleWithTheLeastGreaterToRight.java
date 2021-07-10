package BinarySearchTree;

public class ReplaceEveryEleWithTheLeastGreaterToRight {
    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    // Time: O(nlogn)=> O(n) for traversal & O(logn) for insertion in BST
//    & worst case O(n^2)
    // Root of BST
    static Node root = null;
    static Node succ = null;

    static Node insert(Node root, int data) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(data);
            return root;
        }
        // If key is smaller than root's key,
        // go to left subtree and set successor
        // as current node
        if (root.data > data) {
            // set successor as the current node
            succ = root;
            root.left = insert(root.left, data);
        }
        // Go to right subtree
        else if (root.data < data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    static void replace(int arr[], int n) {
        Node root = null;
        for (int i = n - 1; i >= 0; i--) {
            succ = null;
            // Insert current element into BST and
            // find its inorder successor
            root = insert(root, arr[i]);
            if (succ != null) {
                arr[i] = succ.data;
            }
            // No inorder successor
            else {
                arr[i] = -1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28 };
        int n = arr.length;
        replace(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}
