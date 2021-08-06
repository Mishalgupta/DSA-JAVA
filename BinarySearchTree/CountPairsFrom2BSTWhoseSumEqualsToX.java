package BinarySearchTree;

public class CountPairsFrom2BSTWhoseSumEqualsToX {
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

//    Time:O(N*h), where N is inorder traverse of BST1 &
//    h is height if tree while search in BST2 earch of BST1-k in the BST2
//    Space :O(1)    

    static int count = 0;

// same concept is used which we used in search node in bst
    static boolean search(Node root2, int k) {
        if (root2 == null) {
            return false;
        }
        if (root2.data == k) {
            return true;
        }
        boolean x = false, y = false;
        if (root2.data > k) {
            x = search(root2.left, k);
        } else if (root2.data < k) {
            y = search(root2.right, k);
        }
        return x || y;
    }

    static void solve(Node root1, Node root2, int k) {
        if (root1 == null) {
            return;
        }
        // taking in-order traversal of BST-1 & subtract it's node with k
        // after that search that k-node.data in root2, if exist then increase count.
        solve(root1.left, root2, k);
        if (search(root2, k - root1.data) == true) {
            count++;
        }
        solve(root1.right, root2, k);
    }

    static int countPair(Node root1, Node root2, int x) {
        count = 0;
        solve(root1, root2, x);
        return count;
    }

    public static void main(String[] args) {
//     BST-1
//           5
//        /    \
//       3      7
//      / \    / \
//     2   4  6   8
        Node root = new Node(5);
        root.left = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right = new Node(7);
        root.right.left = new Node(6);
        root.right.right = new Node(8);
//      BST-2
//     10
//   /    \
//  6     15
// / \    / \
//3   8  11  18
        Node root2 = new Node(10);
        root2.left = new Node(6);
        root2.left.left = new Node(3);
        root2.left.right = new Node(8);
        root2.right = new Node(15);
        root2.right.left = new Node(11);
        root2.right.right = new Node(18);
        System.out.println("Count of pairs is: ");
        int x = 16;
        int res = countPair(root, root2, x);
        System.out.println(res);
    }

}
