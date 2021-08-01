package LinkedList;

public class NthNodeFromEndLinkedList {

    static class node {
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }
    }

//Method-1 iterative method by count elements & subtract with position to find
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(1).

//    static int getNthFromLast(node head, int n) {
//        int c = 0;
//        node temp = head;
//        while (temp != null) {
//            c++;
//            temp = temp.next;
//        }
//        int pos = c - n + 1;
//        node end = head;
//        if (pos > 0 && pos <= c) {
//            for (int i = 1; i < pos; i++) {
//                end = end.next;
//            }
//            return end.val;
//        }
//        return -1;
//
//    }

    // Method-2 iterative method by taking two pointers
//    (if we have to find without calculating size & to be done in single iteration)
    // Expected Time Complexity: O(N).
    // Expected Auxiliary Space: O(1).

    static int getNthFromLast(node head, int n) {
        node s = head;
        node f = head;
        for (int i = 0; i < n; i++) {
            f = f.next;
        }
        while (f.next != null) {
            f = f.next;
            s = s.next;
        }
        // here next is used because without this it will show prev val
        return s.next.val;
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
        System.out.println("Linked list before finding Nth last element is :");
        printList(start);
        int d = 2;
        int res = getNthFromLast(start, d);
        System.out.println("\nLinked list Nth last element is :");
//        getNthFromLast(start, d);
        System.out.println(res);

    }

}
