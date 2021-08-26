package LinkedList;

public class SplitCircularLinkedListIntoTwoHalves {
    static Node head, head1, head2;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

//Method- iterative (rabbit-turtle method for mid finding)
//Expected Time Complexity: O(N)
//Expected Auxilliary Space: O(1)
    static void splitList(Node head) {
        Node slow = head, fast = head;
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }
        head1 = head;
        head2 = slow.next;
        slow.next = head;
        Node curr = head2;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = head2;
    }

    /* Function to print nodes in a given singly linked list */
    static void printList(Node node) {
        Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
        }
    }

    public static void main(String[] args) {
        Node start = new Node(10);
        start.next = new Node(12);
        start.next.next = new Node(13);
        start.next.next.next = new Node(14);
        start.next.next.next.next = new Node(15);
        start.next.next.next.next.next = new Node(16);
        start.next.next.next.next.next.next = start;
        System.out.println("Original Circular Linked list ");
        printList(start);

//       Split the list
        splitList(start);
        System.out.println();
        System.out.println("First Circular List ");
        printList(head1);
        System.out.println("");
        System.out.println("Second Circular List ");
        printList(head2);
    }
}