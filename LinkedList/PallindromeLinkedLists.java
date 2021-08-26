package LinkedList;

public class PallindromeLinkedLists {

    static class node {
        int val;
        node next;

        public node(int val) {
            this.val = val;
        }
    }
//    Algorithm:
//        Get the middle of the linked list. 
//        Reverse the second half of the linked list. 
//        Check if the first half and second half are identical. 
//        Construct the original linked list by reversing the second half again and attaching it back to the first half
//        Return 1 if list is palindrome else 0.

//Method-1 By finding the mid of the linked list & reverse of right half & 
//Expected Time Complexity: O(N/2)+O(N/2)+O(N/2)=O(3N/2)=>O(N).
//Expected Auxiliary Space: O(1).
//    Constraints:
//        1 <= N <= 105

    static node reverse(node head) {
        node newHead = null;
        node next = null;
        while (head != null) {
            next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    // Function to check whether the list is palindrome.
    static boolean isPalindrome(node head) {
        node slow = head, fast = head;
        // find the middle of linkedlist
        while (fast != null && fast.next != null && fast.next.next != null) // O(n/2)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        node mid = slow;

        // reverse the right half
        mid.next = reverse(mid.next); // O(n/2)

        // move mid to right half
        mid = mid.next;

        // check for left & right are equal or not
        while (mid != null) // O(n/2)
        {
            if (head.val != mid.val) {
                return false;
            } else {
                head = head.next;
                mid = mid.next;
            }
        }
        return true;
    }

    /* Function to print nodes in a given linked list */
    static void printList(node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        node start = new node(5);
        start.next = new node(1);
        start.next.next = new node(5);
//        start.next.next.next = new node(4);
//        start.next.next.next.next = new node(5);
//        start.next.next.next.next.next = new node(6);
//        start.next.next.next.next.next.next = new node(7);

        System.out.println("Linked list before palindrome check :");
        printList(start);

        System.out.println("\nLinked list after palindrome check :");
        if (isPalindrome(start)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

}
