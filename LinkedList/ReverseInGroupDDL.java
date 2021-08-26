package LinkedList;

public class ReverseInGroupDDL {
    static class node {
        int val;
        node next, prev;

        public node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

//Method-1 iterative method (similar to reverse LL in given group) // if no issue of K multiple
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(1).
    public static node reverse(node head, int k) {
        // Your code here
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        node curr = head;
        node next1 = null;
        node prev1 = null;
        int c = 0;

//      swap next and prev for all nodes of doubly linked list
        while (curr != null && c < k) {
            next1 = curr.next;
            curr.next = prev1;
            curr.prev = next1;
            prev1 = curr;
            curr = next1;
            c++;
        }
        if (next1 != null) {
            head.next = reverse(next1, k);
        }
        head = prev1;
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
        start.next.next.next.next.next.next.next = new node(18);
        System.out.println("LinkedList Elements before reverse");
        printList(start);
        int k = 3;
        node rev = reverse(start, k);
        System.out.println("\nLinkedList Elements after reverse :");
        printList(rev);

    }

}