package LinkedList;

import java.util.*;

public class RemoveDuplicatesFromUnsorted {

    static class node {
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }
    }

    /*
     * Function to remove duplicates from a unsorted linked list
     */

    // Method-1 iterative method(Brute force) (Using two loops)
//Expected Time Complexity: O(N^2)
//Expected Auxiliary Space: O(1)
//    static void removeDuplicate(node head) {
//        node cur = head, cur2 = null;
//        while (cur != null && cur.next != null) {
//            cur2 = cur;
//            while (cur2.next != null) {
//                if (cur.val == cur2.next.val) {
//                    cur2.next = cur2.next.next;
//                } else {
//                    cur2 = cur2.next;
//                }
//            }
//            cur = cur.next;
//        }
//    }

    // Method-2 Hashset
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(N)
    static void removeDuplicate(node head) {
        // Hash to store seen values
        HashSet<Integer> hs = new HashSet<>();

        /* Pick elements one by one */
        node current = head;
        node prev = null;
        while (current != null) {
            int curval = current.val;

            // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }

    }

    /* Function to print nodes in a given linked list */
    static void printList(node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        /*
         * The constructed linked list is: 10->12->11->11->12->11->10
         */
        node start = new node(10);
        start.next = new node(12);
        start.next.next = new node(11);
        start.next.next.next = new node(11);
        start.next.next.next.next = new node(12);
        start.next.next.next.next.next = new node(11);
        start.next.next.next.next.next.next = new node(10);

        System.out.println("Linked list before removing duplicates :");
        printList(start);

        removeDuplicate(start);

        System.out.println("\nLinked list after removing duplicates :");
        printList(start);
    }
}
