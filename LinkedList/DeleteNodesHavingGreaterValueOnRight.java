package LinkedList;

public class DeleteNodesHavingGreaterValueOnRight {
    static class node {
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }
    }

//Method-1 By reversing linked list then comparing node with max. 
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(1).
//    Constraints:
//    1 <= size of linked list <= 1000
//    1 <= element of linked list <= 1000
    public static node reverse(node head) {
        node temp = head;
        node newHead = null, next;
        while (temp != null) {
            next = temp.next;
            temp.next = newHead;
            newHead = temp;
            temp = next;
        }
        return newHead;
    }

    public static node delete(node head) {
        head = reverse(head);// updating head on reverse
        node temp = head; // temporary store head here so that we can use it after reversing
        int max = head.val; // taking head node as max. until another max found
        node prev = head;
        head = head.next;
        while (head != null) {
            if (head.val >= max) {
                max = head.val; // updating max.
                prev = head;
                head = head.next;
            } else {
                prev.next = head.next;// removing head as it is lesser than max
                head = prev.next;
            }
        }
        head = reverse(temp);
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
        node start = new node(12);
        start.next = new node(15);
        start.next.next = new node(10);
        start.next.next.next = new node(11);
        start.next.next.next.next = new node(5);
        start.next.next.next.next.next = new node(6);
        start.next.next.next.next.next.next = new node(2);
        start.next.next.next.next.next.next.next = new node(3);
        System.out.println("Linked List elements before deleting node :");
        printList(start);
        node rev = delete(start);
        System.out.println("\nLinked list elements after deleting nodes :");
        printList(rev);

    }

}
