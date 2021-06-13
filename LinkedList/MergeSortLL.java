package LinkedList;

public class MergeSortLL {
    static class node {
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }
    }

//Method-1 iterative method
//Expected Time Complexity: O(NLogn).
//Expected Auxiliary Space: O(N).
    static node mergeSort(node head) {
        if (head.next == null)
            return head;

        node mid = findMid(head);
        node head2 = mid.next;
        mid.next = null;
        node newHead1 = mergeSort(head);
        node newHead2 = mergeSort(head2);
        node finalHead = merge(newHead1, newHead2);

        return finalHead;
    }

    // Function to merge two linked lists
    static node merge(node head1, node head2) {
        node merged = new node(-1);
        node temp = merged;

        // While head1 is not null and head2
        // is not null
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // While head1 is not null
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        // While head2 is not null
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return merged.next;
    }

    // Find mid using The Tortoise and The Hare approach
    static node findMid(node head) {
        node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
        start.next.next.next = new node(9);
        start.next.next.next.next = new node(5);
        start.next.next.next.next.next = new node(16);
        start.next.next.next.next.next.next = new node(1);
        System.out.println("Linked list elements before merge sort :");
        printList(start);
        node rev = mergeSort(start);
        System.out.println("\nLinked list elements after merge sort :");
        printList(rev);

    }

}
