package LinkedList;

public class MultiplyTwoLinkedList {
    static class node {
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }
    }

//Method-1 Arithmetic modulo method
//    For Modular Arithmetic multiplication
//    we can use (A*B)%mod = (A%mod * B%mod)%mod

//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(1).
    public static long multiply(node head1, node head2) {
        long val1 = 0, val2 = 0;
        long N = (long) Math.pow(10, 8);
        while (head1 != null) {
            val1 = (head1.val + (val1 * 10)) % N;
            head1 = head1.next;
        }
        while (head2 != null) {
            val2 = (head2.val + (val2 * 10)) % N;
            head2 = head2.next;
        }
        return (val1 * val2) % N;
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
        start.next = new node(0);
        start.next.next = new node(0);

        node start2 = new node(9);
        start2.next = new node(9);
        start2.next.next = new node(9);
        System.out.println("Linked list elements Before multiplication :");
        printList(start);
        printList(start2);
        long res = multiply(start, start2);
        System.out.println("\nLinked list elements after multiplication :");
        System.out.println(res);
    }

}
