package LinkedList;

public class PairWithGivenSumDLL {
    static class node {
        int val;
        node next, prev;

        public node(int val) {
            this.val = val;
        }
    }

// Method-1 iterative method (brute force)
// Expected Time Complexity: O(N^2).
// Expected Auxiliary Space: O(1).
//    static void pairs(node head, int k) {
//        boolean found = false;
//        node ptr1 = head, ptr2 = null;
//        while (ptr1 != null) {
//            ptr2 = ptr1.next;
//            while (ptr2 != null && ptr2.next != null) {
//                int val = ptr1.val + ptr2.val;
//                if (val == k) {
//                    found = true;
//                    System.out.println(ptr1.val + "," + ptr2.val + "\n");
//                }
//                ptr2 = ptr2.next;
//            }
//            ptr1 = ptr1.next;
//        }
//        if (found == false) {
//            System.out.println("No pair sum found");
//        }
//    }

//Method-2 iterative method (using two pointers)
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(1).
    static void pairs(node head, int k) {
        node start = head;
        node end = head;
        // move end pointer to the last node
        while (end.next != null) {
            end = end.next;
        }

        // To track if we find a pair or not
        boolean found = false;
//        Loop termination conditions are also different from arrays. 
//        The loop terminates when two pointers cross each other (second->next = first),
//        or they become the same (first == second).
        while (start != end && end.next != start) {
            int val = start.val + end.val;
            if (val == k) {
                found = true;
                System.out.println(start.val + "," + end.val + "\n");
                start = start.next;
                end = end.prev;
            } else {
                if (val > k) {
                    end = end.prev;
                } else {
                    start = start.next;
                }
            }
        }
        if (found == false) {
            System.out.println("No pair sum found");
        }
    }

    // A utility function to insert
    // a new node at the beginning
    // of doubly linked list
    static node insert(node head, int data) {
        node temp = new node(data);
        temp.next = null;
        temp.prev = null;
        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        return temp;
    }

    // Driver Code
    public static void main(String args[]) {
        node head = null;
        head = insert(head, 9);
        head = insert(head, 8);
        head = insert(head, 6);
        head = insert(head, 5);
        head = insert(head, 4);
        head = insert(head, 2);
        head = insert(head, 1);
        int x = 7;

        pairs(head, x);
    }
}