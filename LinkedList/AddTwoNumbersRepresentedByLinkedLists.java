package LinkedList;

public class AddTwoNumbersRepresentedByLinkedLists {
    public static class node {
        node next;
        int val;

        public node(int data) {
            this.val = data;
        }
    }

    public static node reverse(node head) {
        node newHead = null;
        node cur = head;
        while (cur != null) {
            node next = cur.next;
            cur.next = newHead;
            newHead = cur;
            cur = next;
        }
        return newHead;
    }

//    Approach: reverse both list then Traverse both lists and One by one pick nodes of both lists and add the values. 
//    If the sum is more than 10 then make carry as 1 and reduce sum. If one list has more elements than the other
//    than consider the remaining values of this list as 0, now again reverse the list.

    // method: iterative method using pointers
//    (this can solve only on optimal approach)
//    Expected Time Complexity: O(N+M) it depends on length of each list, greater one will run more time than lower one.
//    Expected Auxiliary Space: O(Max(N,M))
    public static node addTwo(node head1, node head2) {
        node t1 = reverse(head1);
        node t2 = reverse(head2);
        // this takes space as we store result here
        node temp = null;
        // res is head node of the resultant list
        node res = null;
        node prev = null;
        int sum = 0;
        int carry = 0;
        while (t1 != null || t2 != null) {
            // Calculate value of next
            // digit in resultant list.
            // The next digit is sum
            // of following things
            // (i) Carry
            // (ii) digit of t1
            // list (if there is a digit)
            // (ii) digit of t2
            // list (if there is a digit)
            sum = carry + (t1 != null ? t1.val : 0) + (t2 != null ? t2.val : 0);
            // update carry for next calculation
            carry = (sum >= 10 ? 1 : 0);
            // update sum if it is greater than 10
            sum = sum % 10;
            temp = new node(sum);
            if (res == null) {
                res = temp;
            } else {
                prev.next = temp;
            }

            // Set prev for next insertion
            prev = temp;

            // Move first and second pointers
            // to next nodes
            if (t1 != null) {
                t1 = t1.next;
            }
            if (t2 != null) {
                t2 = t2.next;
            }
        }

        if (carry > 0) {
            temp = new node(carry);
            prev.next = temp;
            prev = temp;
        }
        res = reverse(res);
        return res;
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
        node start1 = new node(4);
        start1.next = new node(5);
        node start2 = new node(3);
        start2.next = new node(4);
        start2.next.next = new node(5);
        System.out.println("Linked list before add :");
        printList(start1, start2);

        node rev = addTwo(start1, start2);
        System.out.println("\nLinked list after add :");
        printList1(rev);
    }

}
