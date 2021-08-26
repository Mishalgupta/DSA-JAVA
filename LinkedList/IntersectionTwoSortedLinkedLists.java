package LinkedList;

public class IntersectionTwoSortedLinkedLists {
    public static class node {
        node next;
        int val;

        public node(int data) {
            this.val = data;
        }
    }

    // Method-two pointer
//    hint:Maintain pointer at each linked list head and traverse in both linked lists.
//    When you find a common node insert it into the new linked list.
//    Expected Time Complexity : O(n+m)
//    Expected Auxilliary Space : O(n+m)
    public static node intersaction(node head1, node head2) {
        node t1 = head1;
        node t2 = head2;
        node temp = null;
        // cur will used for iteration in resultant list.
        node cur = null;
        while (t1 != null && t2 != null) {
            if (t1.val == t2.val) {
                if (temp == null) {
                    node t = new node(t1.val);
                    temp = t;
                    cur = t;
                } else {
                    node t = new node(t1.val);
                    cur.next = t;
                    cur = cur.next;
                }
                t1 = t1.next;
                t2 = t2.next;
            } else {
                if (t1.val < t2.val) {
                    t1 = t1.next;
                } else if (t1.val > t2.val) {
                    t2 = t2.next;
                }
            }
        }
        return temp;
    }

    static void printList(node head1, node head2) {
        while (head1 != null) {
            System.out.print(head1.val + " ");
            head1 = head1.next;
        }
        System.out.println();
        while (head2 != null) {
            System.out.print(head2.val + " ");
            head2 = head2.next;
        }
    }

    static void printList1(node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        node start1 = new node(1);
        start1.next = new node(2);
        start1.next.next = new node(3);
        start1.next.next.next = new node(4);
        start1.next.next.next.next = new node(5);

        node start2 = new node(0);
        start2.next = new node(2);
        start2.next.next = new node(3);
        start2.next.next.next = new node(7);
        start2.next.next.next.next = new node(8);
        System.out.println("Linked list before intersaction :");
        printList(start1, start2);

        node rev = intersaction(start1, start2);
        System.out.println("\nLinked list after intersaction :");
        printList1(rev);

    }

}