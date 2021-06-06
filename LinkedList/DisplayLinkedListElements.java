package LinkedList;

public class DisplayLinkedListElements {

    static class node {
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }
    }

//Method-1 iterative method
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(1).
    public static node display(node head) {
        node temp = head;
        while (temp != null) {
            temp = temp.next;
        }
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
        node rev = display(start);
        System.out.println("Linked list elements display :");
        printList(rev);

    }

}
