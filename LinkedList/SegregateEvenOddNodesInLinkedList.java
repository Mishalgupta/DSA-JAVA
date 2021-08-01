package LinkedList;

public class SegregateEvenOddNodesInLinkedList {
//    modify the list such that all the even numbers appear before all the odd numbers in the modified list. 
//    The order of appearance of numbers within each segregation should be same as that in the original list.
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

//Method-1 iterative method
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(1).

    public static Node divide(Node head) {
        Node even = null, cureven = null;
        Node odd = null, curodd = null;
        Node dumhead = head;
        while (dumhead != null) {
            if (dumhead.val % 2 == 0) {
                if (even == null) {
                    even = dumhead;
                    cureven = dumhead;
                } else {
                    cureven.next = dumhead;
                    cureven = cureven.next;
                }
            } else {
                if (odd == null) {
                    odd = dumhead;
                    curodd = dumhead;
                } else {
                    curodd.next = dumhead;
                    curodd = curodd.next;
                }

            }
            dumhead = dumhead.next;
        }
//        if (even != null) {
//            cureven.next = odd;
//        }
//        if (odd != null) {
//            curodd.next = null;
//        }
        if (even != null) {
            cureven.next = odd;
        }
        if (odd != null) {
            curodd.next = null;
        }
        if (even == null) {
            return odd;
        }
        return even;
    }

    /* Function to print nodes in a given linked list */
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node start = new Node(17);
        start.next = new Node(15);
        start.next.next = new Node(8);
        start.next.next.next = new Node(9);
        start.next.next.next.next = new Node(2);
        start.next.next.next.next.next = new Node(4);
        start.next.next.next.next.next.next = new Node(6);
        System.out.println("Linkedlist elements before segregation");
        printList(start);
        Node rev = divide(start);
        System.out.println("\nLinked list elements after segregation :");
        printList(rev);

    }

}
