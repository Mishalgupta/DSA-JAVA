package LinkedList;

public class ReverseLinkedListInGroupsOfGivenSize {
    static class node {
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }
    }

    // Method-1 iterative method(if issue of k multiple)
    // Expected Time Complexity: O((N/k)*k) = O(N).
//    since we have done k iteration for each step
    // Expected Auxiliary Space: O(1).
//    public static node reverse(node head, int k) {
//        node dummy = new node(0);
//        dummy.next = head;
//        node cur = dummy, prev = dummy, nex = dummy;
//        int c = 0;
//        while (cur.next != null) {
//            cur = cur.next;
//            c++;
//        }
//        while (c >= k) {
//            cur = prev.next;
//            nex = cur.next;
//            for (int i = 1; i < k; i++) {
//                cur.next = nex.next;
//                nex.next = prev.next;
//                prev.next = nex;
//                nex = cur.next;
//            }
//            prev = cur;
//            c = c - k;
//        }
//        return dummy.next;
//    }

    // Method-2 iterative method(if no issue of k multiple)
    // Expected Time Complexity: O(N).
    // Expected Auxiliary Space: O(1).
    public static node reverse(node head, int k) {
        int c = 0;
        node cur = head, prev = null, next = null;
        while (cur != null && c < k) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            c++;
        }
        if (next != null) {
            // attaching head of prev reversed array to next one
            head.next = reverse(next, k);
        }
        return prev;
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
        start.next.next.next.next.next.next.next = new node(8);
        int k = 3;
        System.out.println("Linked list before reverse :");
        printList(start);

        node rev = reverse(start, k);

        System.out.println("\nLinked list after reverse :");
        printList(rev);

    }

}
