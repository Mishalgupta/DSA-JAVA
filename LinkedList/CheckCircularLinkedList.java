package LinkedList;

public class CheckCircularLinkedList {
    static class node {
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }
    }

//   approach: We need to check whether linked list traversal reaches a NULL or head pointer.
//    Expected Time Complexity: O(N).
//    Expected Auxiliary Space: O(1).
//    Constraints:
//    1 <=Number of nodes<= 100
    public static boolean exist(node head) {
        node temp = head;
        while (temp != null) {
            temp = temp.next;
            if (temp == head) {
                return true;
            }
        }
        return false;
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
        System.out.println("Linked list before checking :");
        printList(start);

        // Making linked list circular
        start.next.next.next.next.next = start;

        System.out.println("\nLinked list after checking :");
        if (exist(start)) {
            System.out.println("Yes: List is circular Linked List");
        } else {
            System.out.println("No: List is not circular Linked List");
        }
    }

}
