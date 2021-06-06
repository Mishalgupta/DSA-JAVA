package LinkedList;

public class MoveLastElementToFront {
    static class node {
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }
    }

//method- two pointer
    // time: O(n)
    // space: O(1)
    static node move(node head) {
        if (head == null || head.next == null) {
            return null;
        }
        // set second last node initially to null and last to head
        node sl = null;
        node l = head;
        while (l.next != null) {
            sl = l;
            l = l.next;
        }
        // after getting null at l.next set second last to null & last pointing to head
        sl.next = null;
        l.next = head;
        /* Change head to point to last node. */
        head = l;
        return head;
    }

    /* Function to print nodes in a given linked list */
    static void printList(node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        node start = new node(1);
        start.next = new node(2);
        start.next.next = new node(3);
        start.next.next.next = new node(4);
        start.next.next.next.next = new node(5);
        start.next.next.next.next.next = new node(6);
        start.next.next.next.next.next.next = new node(7);

        System.out.println("Linked list before shift :");
        printList(start);

        node rev = move(start);

        System.out.println("\nLinked list after shift :");
        printList(rev);
    }

}
