package LinkedList;

import java.util.*;

public class CountTripletsInSortedDDLWhoseSumEqualToX {

    static class node {
        int val;
        node next, prev;

        public node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    // Method-1 iterative method using 3 loops (Brute force)
    // Expected Time Complexity: O(N^3).
    // Expected Auxiliary Space: O(1).
//    public static int triplate(node head, int x) {
//        node ptr1, ptr2, ptr3;
//        int count = 0;
//
//        // generate all possible triplets
//        for (ptr1 = head; ptr1 != null; ptr1 = ptr1.next) {
//            for (ptr2 = ptr1.next; ptr2 != null; ptr2 = ptr2.next) {
//                for (ptr3 = ptr2.next; ptr3 != null; ptr3 = ptr3.next) {
//                    // if elements in the current triplet sum up to 'x'
//                    if ((ptr1.val + ptr2.val + ptr3.val) == x) {
//                        // increment count
//                        count++;
//                    }
//                }
//            }
//        } // required count of triplets
//        return count;
//    }

//Method-2 iterative method using HashSet or Map
//Expected Time Complexity: O(N^2).
//Expected Auxiliary Space: O(N).
//    public static int triplate(node head, int x) {
//        node ptr, ptr1, ptr2;
//        int count = 0;
//
//        // implement hash table
//        HashSet<Integer> um = new HashSet<Integer>();
//
//        // insert the <node data> tuple in 'um'
//        for (ptr = head; ptr != null; ptr = ptr.next) {
//            um.add(ptr.val);
//        }
//        // generate all possible pairs
//        for (ptr1 = head; ptr1 != null; ptr1 = ptr1.next) {
//            for (ptr2 = ptr1.next; ptr2 != null; ptr2 = ptr2.next) {
//
//                // p_sum - sum of elements in the current pair
//                int p_sum = ptr1.val + ptr2.val;
//
//                // if 'x-p_sum' is present in 'um' and either of the two nodes
//                // are not equal to the 'um[x-p_sum]' node
//                if (um.contains(x - p_sum) && (x - p_sum) != ptr1.val && (x - p_sum) != ptr2.val) {
//                    // increment count
//                    count++;
//                }
//            }
//        }
//        return count / 3;
//
//    }

    // Method-3 iterative method using two pointers
    // Expected Time Complexity: O(N^2).
    // Expected Auxiliary Space: O(1).
    // function to count pairs whose sum equal to given 'value'
    static int countPairs(node first, node second, int value) {
        int count = 0;

        // The loop terminates when either of two pointers
        // become null, or they cross each other (second.next
        // == first), or they become same (first == second)
        while (first != null && second != null && first != second && second.next != first) {

            // pair found
            if ((first.val + second.val) == value) {

                // increment count
                count++;

                // move first in forward direction
                first = first.next;

                // move second in backward direction
                second = second.prev;
            }

            // if sum is greater than 'value'
            // move second in backward direction
            else if ((first.val + second.val) > value) {
                second = second.prev;
            }
            // else move first in forward direction
            else {
                first = first.next;
            }
        }

        // required count of pairs
        return count;
    }

    // function to count triplets in a sorted doubly linked list
    // whose sum is equal to a given value 'x'
    static int triplate(node head, int x) {
        // if list is empty
        if (head == null) {
            return 0;
        }

        node current, first, last;
        int count = 0;

        // get pointer to the last node of
        // the doubly linked list
        last = head;
        while (last.next != null) {
            last = last.next;
        }
        // traversing the doubly linked list
        for (current = head; current != null; current = current.next) {

            // for each current node
            first = current.next;

            // count pairs with sum(x - current.data) in the range
            // first to last and add it to the 'count' of triplets
            count += countPairs(first, last, x - current.val);
        }

        // required count of triplets
        return count;
    }

    /* Function to print nodes in a given linked list */
    static void printList(node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    // A utility function to insert
    // a new node at the beginning
    // of doubly linked list
    static node insert(node head, int data) {
        node temp = new node(data);
        temp.next = null;
        temp.prev = null;
        if (head == null) {
            head = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        return head;
    }

    // Driver Code
    public static void main(String args[]) {
        node head = null;
        head = insert(head, 9);
        head = insert(head, 8);
        head = insert(head, 6);
        head = insert(head, 5);
        head = insert(head, 4);
        head = insert(head, 2);
        head = insert(head, 1);
        System.out.println("LinkedList Elements before Findind triplate");
        printList(head);
        int x = 17;
        int res = triplate(head, x);
        System.out.println("\nLinkedList Elements after finding triplates :");
        System.out.println(res);
    }

}
