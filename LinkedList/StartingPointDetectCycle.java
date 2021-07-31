package LinkedList;

import java.util.*;

public class StartingPointDetectCycle {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // Method-1 Hashset or map
//    Time: O(n)
//    Space: O(n)
//    public static Node startingPoint(Node head) {
//        HashSet<Integer> h1 = new HashSet<Integer>();
//        Node temp = head;
//        while (temp != null) {
//            int curval = temp.key;
//            if (h1.contains(curval)) {
//                return temp;
//            } else {
//                h1.add(curval);
//                temp = temp.next;
//            }
//        }
//        return null;
//    }

    // Method-2 floyd cycle finding algo.(turtle rabit algo.)
//    Time: O(n)
//    Space: O(1)
    public static Node startingPoint(Node head) {
//         If list is empty or has only one node without loop
        if (head == null || head.next == null) {
            return null;
        }
        Node start = head;
        Node end = head;
        Node entry = head;
        while (end != null && end.next != null) {
            start = start.next;
            end = end.next.next;
            if (start == end) {
                while (start != entry) {
                    start = start.next;
                    entry = entry.next;
                }
                return start;
            }
        }

        // If loop does not exist
        if (start != end) {
            return null;
        }
        return null;
    }

    /* Function to print nodes in a given linked list */
//    static void printList(Node head) {
//        while (head != null) {
//            System.out.print(head.data + " ");
//            head = head.next;
//        }
//        System.out.println();
//    }

    public static void main(String[] args) {
        Node start = new Node(10);
        start.next = new Node(10);
        start.next.next = new Node(11);
        start.next.next.next = new Node(11);
        start.next.next.next.next = new Node(12);
        start.next.next.next.next.next = new Node(13);
        start.next.next.next.next.next.next = new Node(14);
        // Create a loop for testing
        start.next.next.next.next = start.next.next;

        Node res = startingPoint(start);
        if (res == null)
            System.out.print("Loop does not exist");
        else
            System.out.print("Loop starting node is " + res.data);
    }
}
