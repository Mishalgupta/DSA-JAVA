package LinkedList;

public class Add1ToNumberRepresentedAsLinkedList {
    static class node {
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }

    }

//Method- iterative approach using pointers
//    Time:O(n) = n+n+n=> 3n ==O(n)
//    Space:O(1)
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

    public static node add(node head) {
        head = reverse(head); // n times
        boolean f = true;
        node temp = head;
        while (temp != null && f == true) // n times
        {
            if (temp.val == 9 && temp.next == null) {
                temp.val = 1;
                node cur = new node(0);
                cur.next = head;
                head = cur;
                temp = temp.next;
            } else if (temp.val == 9) {
                temp.val = 0;
                temp = temp.next;
            } else {
                temp.val = temp.val + 1;
                temp = temp.next;
                f = false;
            }
        }
        head = reverse(head); // n times
        return head;
    }

    /* Function to print nodes in a given linked list */
    static void printList(node head) {
        while (head != null) {
            System.out.print(head.val + "");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        node start = new node(1);
        start.next = new node(1);
        start.next.next = new node(9);
        System.out.println("Linked list before adding :");
        printList(start);

        node rev = add(start);

        System.out.println("\nLinked list after adding :");
        printList(rev);

    }

}
