package Queue;

import java.util.*;

public class ReverseFirstKElementsOfQueue {
    // Method1-iterative using stack & queue
//    Expected Time Complexity : O(n)
//    Expected Auxilliary Space : O(n)
    // Function to reverse first k elements of a queue.
//    public static Queue<Integer> modifyQueue(Queue<Integer> s, int k) {
//        Stack<Integer> st = new Stack<>();
//        Queue<Integer> s1 = new ArrayDeque<>();
//        // here we store the elements till k in stack for reversal
//        for (int i = 0; i < k; i++) {
//            st.push(s.poll());
//        }
//        // here we store the remaining elements of the queue to the new queue
//        while (!s.isEmpty()) {
//            s1.offer(s.poll());
//        }
//        // here we move all elements of stack to queue (due to this elements got
//        // reversed)
//        while (!st.isEmpty()) {
//            s.offer(st.pop());
//        }
//        // this addAll will add the elements of the s1 with the current elements in s
//        s.addAll(s1);
//        return s;
//    }

    // Method2- recursive
//  Expected Time Complexity : O(n)
//  Expected Auxilliary Space : O(n)
    // Function to reverse first k elements of a queue.
    public static Queue<Integer> modifyQueue(Queue<Integer> s, int k) {
        s = rev(s);
        return revK(s, k);
    }

    static Queue<Integer> rev(Queue<Integer> s) {
        if (s.size() == 1) {
            return s;
        }
        int temp = s.peek();
        s.poll();
        rev(s);
        s.add(temp);
        return s;
    }

    static Queue<Integer> revK(Queue<Integer> q, int k) {

        if (q.size() == k) {
            return q;
        }
        int pop = q.poll();
        revK(q, k);
        q.add(pop);
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> s = new ArrayDeque<>(5);
        s.offer(10);
        s.offer(20);
        s.offer(30);
        s.offer(40);
        s.offer(50);
        System.out.println("Queue size: " + s.size());
        System.out.println("Queue before reversal");
        System.out.print(s);
        int k = 3;
        modifyQueue(s, k);
        System.out.println("\nQueue after reversal");
        System.out.print(s);
    }

}
