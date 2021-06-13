package LinkedList;

public class SortLinkedListOf0s1s2s {
    static class node {
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }
    }

    // Method-1 iterative method taking three pointer
    // Create three dummy nodes to point to
    // beginning of three linked lists. These
    // dummy nodes are created to avoid many
    // null checks.
    // Expected Time Complexity: O(N).
    // Expected Auxiliary Space: O(1).
    static node segregate(node head) {
        node zeroD = new node(0);
        node oneD = new node(0);
        node twoD = new node(0);

        // Initialize current pointers for three
        // lists and whole list.
        node zero = zeroD, one = oneD, two = twoD;
        // Traverse list
        node curr = head;
        while (curr != null) {
            if (curr.val == 0) {
                zero.next = curr;
                zero = zero.next;
                curr = curr.next;
            } else if (curr.val == 1) {
                one.next = curr;
                one = one.next;
                curr = curr.next;
            } else {
                two.next = curr;
                two = two.next;
                curr = curr.next;
            }
        }
        // Attach three lists
        zero.next = (oneD.next != null) ? (oneD.next) : (twoD.next);
        one.next = twoD.next;
        two.next = null;
        // Updated head
        head = zeroD.next;
        return head;
    }

    // Method-2 iterative method taking four pointer
    // Expected Time Complexity: O(N).
    // Expected Auxiliary Space: O(1).
//    static node segregate(node head) {
//        node zero = null, first = null, second = null, curzero = null, curfirst = null, cursecond = null;
//        node temp = head;
//        while (temp != null) {
//            if (temp.val == 0) {
//                if (zero == null) {
//                    zero = temp;
//                    curzero = temp;
//                } else {
//                    curzero.next = temp;
//                    curzero = curzero.next;
//                }
//            } else if (temp.val == 1) {
//                if (first == null) {
//                    first = temp;
//                    curfirst = temp;
//                } else {
//                    curfirst.next = temp;
//                    curfirst = curfirst.next;
//                }
//            } else if (temp.val == 2) {
//                if (second == null) {
//                    second = temp;
//                    cursecond = temp;
//                } else {
//                    cursecond.next = temp;
//                    cursecond = cursecond.next;
//                }
//            }
//            temp = temp.next;
//        }
//        if (first == null) {
//            curzero.next = second;
//            cursecond.next = null;
//        } else {
//            curzero.next = first;
//            if (second == null) {
//                curfirst.next = null;
//            } else {
//                curfirst.next = second;
//            }
//        }
//        head = zero;
//        return head;
//    }

//Method-3 iterative method
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(1).
//    static node segregate(node head) {
//        // initiallise count of 0 1 and 2 as 0
//        int count[] = { 0, 0, 0 };
//        node temp = head;
//        /*
//         * count total number of '0', '1' and '2' count[0] will store total number of
//         * '0's count[1] will store total number of '1's count[2] will store total
//         * number of '2's
//         */
//        while (temp != null) {
//            count[temp.val]++;
//            temp = temp.next;
//        }
//        int i = 0;
//        temp = head;
//
//        /*
//         * Let say count[0] = n1, count[1] = n2 and count[2] = n3 now start traversing
//         * list from head node, 1) fill the list with 0, till n1 > 0 2) fill the list
//         * with 1, till n2 > 0 3) fill the list with 2, till n3 > 0
//         */
//        while (temp != null) {
//            if (count[i] == 0)
//                i++;
//            else {
//                temp.val = i;
//                --count[i];
//                temp = temp.next;
//            }
//        }
//        return head;
//    }

    /* Function to print nodes in a given linked list */
    static void printList(node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        node start = new node(0);
        start.next = new node(1);
        start.next.next = new node(1);
        start.next.next.next = new node(2);
        start.next.next.next.next = new node(1);
        start.next.next.next.next.next = new node(2);
        start.next.next.next.next.next.next = new node(2);
        System.out.println("Linked list elements before sort :");
        printList(start);
        node rev = segregate(start);
        System.out.println("\nLinked list elements after sort :");
        printList(rev);

    }
}