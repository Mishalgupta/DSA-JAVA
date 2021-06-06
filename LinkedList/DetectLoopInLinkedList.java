package LinkedList;

import java.util.*;

public class DetectLoopInLinkedList {
    Node head; // head of list

    /* Linked list Node */

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // Method-1 Hashset or map
//  Time:O(n)
//  Space:O(n)
//    public static boolean detectLoop(Node head) {
//        HashSet<Node> s = new HashSet<Node>();
//        while (head != null) {
//            // If we have already has this node
//            // in hashmap it means their is a cycle
//            // (Because you we encountering the
//            // node second time).
//            if (s.contains(head))
//                return true;
//
//            // If we are seeing the node for
//            // the first time, insert it in hash
//            s.add(head);
//
//            head = head.next;
//        }
//
//        return false;
//    }
//Method-2 Turtle-rabit algo.(floyd cycle detection)
//    Time:O(n)
//    Space:O(1)
    public static boolean detectLoop(Node head) {
        if (head.next == null) {
            return false;
        }
        Node low = head;
        Node high = head;
        while (high != null && high.next != null) {
            low = low.next;
            high = high.next.next;
            if (low == high) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node start = new Node(10);
        start.next = new Node(10);
        start.next.next = new Node(11);
        start.next.next.next = new Node(11);
        start.next.next.next.next = new Node(12);
        start.next.next.next.next.next = new Node(13);
        start.next.next.next.next.next.next = new Node(14);
        // Create a loop for testing
        start.next.next.next.next = start.next;
        System.out.println(detectLoop(start));

    }

}
