package LinkedList;

public class ReverseLinkedList {
    static class node {
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }
    }

//Method-2 iterative method
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(1).
    public static node reverse(node head) {
        node newHead = null;
        node cur = head;
        while (cur != null) {
            node next = cur.next;
            cur.next = newHead;
            newHead = cur;
            cur = next;
        }
        return newHead;
    }

    /* Function to print nodes in a given linked list */
    static void printList(node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        node start = new node(10);
        start.next = new node(12);
        start.next.next = new node(13);
        start.next.next.next = new node(14);
        start.next.next.next.next = new node(15);
        start.next.next.next.next.next = new node(16);
        start.next.next.next.next.next.next = new node(17);

        System.out.println("Linked list before reverse :");
        printList(start);

        node rev = reverse(start);

        System.out.println("\nLinked list after reverse :");
        printList(rev);

    }

}