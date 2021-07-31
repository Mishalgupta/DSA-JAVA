package LinkedList;

//import java.util.*;

public class RemoveDuplicatesInSortedList {

    static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
        }
    }

//     Function to remove duplicates from a unsorted linked list

    // Method-1 Hashset
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(N)
//    static void removeDuplicate(node head) {
//        // Hash to store seen values
//        HashSet<Integer> hs = new HashSet<>();
//
//        // Pick elements one by one
//        node current = head;
//        node prev = null;
//        while (current != null) {
//            int curval = current.data;
//
//            // If current value is seen before
//            if (hs.contains(curval)) {
//                prev.next = current.next;
//            } else {
//                hs.add(curval);
//                prev = current;
//            }
//            current = current.next;
//        }
//
//    }

//Method-2 iterative
//Expected Time Complexity: O(N)
//Expected Auxiliary Space: O(1)
    static void removeDuplicate(node head) {
//        if (head == null && head.next == null) {
//            
//        }
        node cur = head;
        while (cur.next != null) {
            if (cur.data == cur.next.data) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
    }

    /* Function to print nodes in a given linked list */
    static void printList(node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
//      The constructed linked list is: 10->10->11->11->12->13->14
        node start = new node(10);
        start.next = new node(10);
        start.next.next = new node(11);
        start.next.next.next = new node(11);
        start.next.next.next.next = new node(12);
        start.next.next.next.next.next = new node(13);
        start.next.next.next.next.next.next = new node(14);

        System.out.println("Linked list before removing duplicates :");
        printList(start);

        removeDuplicate(start);

        System.out.println("\nLinked list after removing duplicates :");
        printList(start);
    }

}
