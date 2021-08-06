package Queue;

import java.util.*;

public class QueueReversalRecursion {
//  Method 1- iterative
//  Expected Time Complexity : O(n)
//  Expected Auxilliary Space : O(n)
//    static Queue<Integer> rev(Queue<Integer> s) {
//        Stack<Integer> st = new Stack<>();
//        while (!s.isEmpty()) {
//            st.push(s.poll());
//        }
//        while (!st.isEmpty()) {
//            s.offer(st.pop());
//        }
//        return s;
//    }

    // Method 2:-Recursive
//    Expected Time Complexity : O(n)
//    Expected Auxilliary Space : O(n)
    static Queue<Integer> rev(Queue<Integer> s) {
        if (s.size() > 0) {
            // here will pop the top element until we reach end of queue
            int temp = s.peek();
            s.poll();
            rev(s);
            // add all elements one by one back to queue
            s.add(temp);
        }
        return s;
    }

    public static void main(String[] args) {
        Queue<Integer> s = new ArrayDeque<>(5);
        s.offer(10);
        s.offer(20);
        s.offer(30);
        s.offer(40);
        s.offer(50);
        System.out.println("Queue before reversal");
        System.out.print(s);
        rev(s);
        System.out.println("\nQueue after reversal");
        System.out.print(s);
    }

}
