package LinkedList;

public class OddEvenIndexLinkedList {

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
    public static node oddEvenList(node head) {
        if (head == null)
            return null;
        node odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
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
        System.out.println("Linked list elements before odd index segragation :");
        printList(start);
        node rev = oddEvenList(start);
        System.out.println("\nLinked list elements after odd index segregation :");
        printList(rev);

    }

}
