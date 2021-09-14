package Queue;

import java.util.*;

public class InterleaveFirstHalfQueueSecondHalf {
//    Time complexity: O(n).
//    Auxiliary Space: O(n).
    static Queue<Integer> q = new ArrayDeque<>();

    static void interLeave() {
        // To check the even number of elements
        if (q.size() % 2 != 0) {
            return;
        }
        Stack<Integer> st = new Stack<>();
        int mid = q.size() / 2;
        // push first half of queue to stack
        // queue:16 17 18 19 20, stack: 15(T) 14 13 12 11
        for (int i = 0; i < mid; i++) {
            st.push(q.peek());
            q.poll();
        }
        // again enqueue elements from stack to queue
        // queue: 16 17 18 19 20 15 14 13 12 11
        while (!st.isEmpty()) {
            // this st will peek using the lifo operation
            q.add(st.peek());
            st.pop();
        }
        // dequeue first of the queue and enqueue back to queue
        // queue: 15 14 13 12 11 16 17 18 19 20
        for (int i = 0; i < mid; i++) {
            q.add(q.peek());
            q.poll();
        }
        // again push first half of the queue to stack
        // queue: 16 17 18 19 20, stack: 11(T) 12 13 14 15
        for (int i = 0; i < mid; i++) {
            // this q will peek using the fifo operation
            st.push(q.peek());
            q.poll();
        }
        // interleave the stack & queue
        // queue: 11 16 12 17 13 18 14 19 15 20
        while (!st.isEmpty()) {
            q.add(st.peek());
            st.pop();
            q.add(q.peek());
            q.poll();
        }
    }

    public static void main(String[] args) {
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(17);
        q.add(18);
        q.add(19);
        q.add(20);
        System.out.println("Queue elements before interleave operation: ");
        System.out.print(q);
        interLeave();
        System.out.println("\nQueue elements after interleave operation: ");
        System.out.print(q);
    }

}