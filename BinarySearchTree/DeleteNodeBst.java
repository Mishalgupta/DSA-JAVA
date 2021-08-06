package BinarySearchTree;

public class DeleteNodeBst {
    // Bst node
    static class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

//    Time Complexity: O(logn)(Average case)
//    Time complexity: O(n) for worst case(skewed bst)
//    Space Complexity: O(h) h: height of BST
    // finding the max element in left of the root node which we have to delete
    static int max(Node root) {
        Node curr = root;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr.data;
    }

    static Node delete(Node root, int val) {
        // for traversing weather left/right till the given value
//        Node to be deleted has two children: Find inorder successor of the node.
//        Copy contents of the inorder successor to the node and delete the inorder successor. 
//        Note that inorder predecessor can also be used.
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        }
        // if value matches
        else {
            // CASE-1
            // deletion for 2-deg nodes find max. node in left,
            // since we need to delete the root .
            // so we have to go to left as right ones are greater.
//            if (root.left != null && root.left != null) {
//                int lmax = max(root.left);
//                root.data = lmax;
//                root.left = delete(root.left, lmax);
//            }
            if (root.left != null && root.right != null) {
                int rmax = max(root.right);
                root.data = rmax;
                root.right = delete(root.right, rmax);
            }
            // CASE-2
            // deletion work for node having either left/right
            else if (root.left == null) {
                Node temp = root.right;
                return temp;
            } else if (root.right == null) {
                Node temp = root.left;
                return temp;
            }
            // CASE-3
            // for leaf node
            else {
                return null;
            }
        }
        return root;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(13);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);
        System.out.println("Bst Node before deletion: ");
        inorder(root);
        delete(root, 13);
        System.out.println("\nBst Node deleted: ");
        inorder(root);
    }

}
