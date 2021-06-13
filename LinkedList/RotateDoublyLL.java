package LinkedList;

public class RotateDoublyLL {
    static class node {
        int val;
        node next, prev;

        public node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

//Method-1 iterative method(using pointers at pos & at last node and then change there pointers)
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(1).
    public static node rotate(node head, int pos) {
        node temp = head;
        int count = 1;
        while (temp != null && count < pos) {
            temp = temp.next;
            count++;
        }
        node cur = temp;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.prev = temp;
        head = cur.next;
        head.prev = null;
        cur.next = null;
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
        node start = new node(10);
        start.next = new node(12);
        start.next.next = new node(13);
        start.next.next.next = new node(14);
        start.next.next.next.next = new node(15);
        start.next.next.next.next.next = new node(16);
        start.next.next.next.next.next.next = new node(17);
        System.out.println("LinkedList Elements before reverse");
        printList(start);
        int pos = 2;
        node rev = rotate(start, pos);
        System.out.println("\nLinkedList Elements after reverse :");
        printList(rev);

    }
}
