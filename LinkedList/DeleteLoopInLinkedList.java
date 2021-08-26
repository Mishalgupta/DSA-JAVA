package LinkedList;

import java.util.*;

public class DeleteLoopInLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

//Method-1 turtle-rabit
//Expected time complexity : O(n)
//Expected auxiliary space : O(1)
    public static Node deleteLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        // exceptional case:
        // starting point of loop are both slow & fast
        // then any of fast or slow will iterate &
        // when any of slow or fast next is same as slow or fast
        // then set it as null
        if (slow == head) {
            // we can move either slow or fast
            while (slow.next != fast) {
                slow = slow.next;
            }
            slow.next = null;
        }
        // when there is no case of head point
        else if (slow == fast)// if both matches then set slow at starting point
        {
            slow = head;
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
        return head;
    }
    // Method-2 Hashing or map
    // Time : O(n)
    // Space :O(n)
//    public static boolean deleteLoop(Node head) {
//        HashSet<Node> s = new HashSet<Node>();
//        Node prev = null;
//        while (head != null) {
//            // If we have already has this node
//            // in hashmap it means their is a cycle and we
//            // need to remove this cycle so set the next of
//            // the previous pointer with null.
//
//            if (s.contains(head)) {
//                prev.next = null;
//                return true;
//            }
//            // If we are seeing the node for
//            // the first time, insert it in hash
//            else {
//                s.add(head);
//                prev = head;
//                head = head.next;
//            }
//        }
//        return false;
//    }

    /* Function to print nodes in a given linked list */
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node start = new Node(50);
        start.next = new Node(20);
        start.next.next = new Node(15);
        start.next.next.next = new Node(4);
        start.next.next.next.next = new Node(10);
        start.next.next.next.next.next = new Node(6);
//        start.next.next.next.next.next.next = new Node(7);

        System.out.println("Linked List before removing loop");
        printList(start);
        // Create a loop for testing
        start.next.next.next.next.next = start.next.next;
//        int rev = (deleteLoop(start) ? 1 : 0);
        System.out.println("\nLinked List after removing loop");
//        if (rev == 1) {
//            printList(start);
//        }
        Node rev = deleteLoop(start);
        printList(rev);
    }
}