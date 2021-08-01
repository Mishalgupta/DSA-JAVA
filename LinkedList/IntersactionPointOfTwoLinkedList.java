package LinkedList;

//import java.util.*;

public class IntersactionPointOfTwoLinkedList {

    static class node {
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }
    }

//    Method 1:Simply use two loops
    // time: O(n*m)
    // space(1)
//    public static int intersectPoint(node head1, node head2) {
//        node temp1 = head1;
//        while (temp1 != null) {
//            node temp2 = head2;
//            while (temp2 != null) {
//                if (temp1.val == temp2.val) {
//                    return temp1.val;
//                } else {
//                    temp2 = temp2.next;
//                }
//            }
//            temp1 = temp1.next;
//        }
//        return -1;
//    }

//       Method2- Hashing
//  Time complexity: O(m+n) 
//  Auxiliary Space: O(n)
//    public static int intersectPoint(node head1, node head2) {
//        HashSet<node> hs = new HashSet<node>();
//        while (head1 != null) {
//            hs.add(head1);
//            head1 = head1.next;
//        }
//        while (head2 != null) {
//            if (hs.contains(head2)) {
//                return head2.val;
//            }
//            head2 = head2.next;
//        }
//        return -1;
//    }

//   Method-3 difference of node counts
//    Time complexity: O(m+n) 
//    Auxiliary Space: O(1)

    // function to find the length of both the list
    static int length(node head) {
        node t = head;
        int c = 0;
        while (t != null) {
            c++;
            t = t.next;
        }
        return c;
    }

    // Function to find intersection point in Y shaped Linked Lists.
    static int intersectPoint(node head1, node head2) {
        node t1 = head1, t2 = head2;
        int c1 = length(t1);
        int c2 = length(t2);
        int gap = Math.abs(c1 - c2);
        if (c1 > c2) {
            for (int i = 0; i < gap; i++) {
                t1 = t1.next;
            }
        } else {
            for (int i = 0; i < gap; i++) {
                t2 = t2.next;
            }
        }
        while (t1 != null && t2 != null) {
            if (t1 == t2) {
                return t1.val;
            } else {
                t1 = t1.next;
                t2 = t2.next;
            }
        }
        return -1;
    }

    /* Function to print nodes in a given linked list */
    static void printList(node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    // function to get the second list by attaching it with the first
    static node intersact(node head1, node head2, int pos) {
        node temp1 = head1;
        while (pos != 0) {
            temp1 = temp1.next;
            pos--;
        }
        node temp2 = head2;
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        temp2.next = temp1;
        return head2;
    }

    public static void main(String[] args) {
        // creating first linked list
        node head1 = new node(3);
        head1.next = new node(6);
        head1.next.next = new node(9);
        head1.next.next.next = new node(15);
        head1.next.next.next.next = new node(30);
        System.out.println("LinkedList before finding point:");
        printList(head1);

        // creating second linked list
        System.out.println();
        node head2 = new node(10);
        printList(head2);

        // intersact point creating
        System.out.println("\nAfter merging");
        intersact(head1, head2, 3);
        printList(head2);

        System.out.println("\nThe node of intersection is:");
        int res = intersectPoint(head1, head2);
        System.out.println(res);
    }
}
