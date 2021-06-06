package LinkedList;

public class MiddleOfLinkedList {

    static class node {
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }
    }

    // Method-1 using array.
    // Expected Time Complexity: O(N).
    // Expected Auxiliary Space: O(N).
//    public static void display(node head) {
//        node arr[] = new node[100];
//        int t = 0;
//        while (head != null) {
//            arr[t++] = head;
//            head = head.next;
//        }
//        node mid = arr[t / 2];
//        System.out.println(mid.val);
//    }

//Method-Iterative by traversing list & take count of list size
    // time: O(n))
    // space:O(1)
//    public static void display(node head) {
//        node mid = head;
//        int c = 0;
//        // first calculate length
//        while (head != null) {
//            // Update mid, when 'count'
//            // is odd number
//            if (c % 2 == 1) {
//                mid = mid.next;
//            }
//            c++;
//            head = head.next;
//        }
//        if (mid != null) {
//            System.out.println(mid.val);
//        }
//    }
//Method-3 turtle-rabbit approach.
//Expected Time Complexity: O(N/2)==O(n) since fast pointer runs 2x times.
//Expected Auxiliary Space: O(1).
    public static void display(node head) {
        node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);
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
//        start.next.next.next.next.next.next = new node(17);
        System.out.println("Linked list elements are is :");
        printList(start);

        System.out.println("\nLinked list Middle Element is :");
        display(start);

    }

}
