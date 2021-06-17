package Stack;

import java.util.*;

public class StackUsingQueue {

    // Method 1 (By making push operation costly)
    // Time Complexity:
    // Push operation: O(N).
    // Same as pop operation in queue.
    // Pop operation: O(1).
    // In the worst case we have empty whole of queue 1 into queue 2
    // Auxiliary Space: O(N).
//
//    Queue<Integer> q1 = new ArrayDeque<Integer>();
//    Queue<Integer> q2 = new ArrayDeque<Integer>();
//
//    void push(int x) {
//        // Move all elements from q1 to q2
//        while (!q1.isEmpty()) {
//            q2.add(q1.peek());
//            q1.poll();
//        }
//
//        // Push item into q1(since initially queue1 is empty so we need to push value)
//        q1.add(x);
//
//        // Push everything back q2 to q1
//        while (!q2.isEmpty()) {
//            q1.add(q2.peek());
//            q2.poll();
//        }
//    }
//
//    int pop() {
//        // if first stack is empty
//        if (q1.isEmpty()) {
//            System.out.println("Queue is Empty");
//            return -1;
//        }
//        int x = q1.peek();
//        q1.poll();
//        return x;
//    }
//
//    boolean isEmpty() {
//        if (q1.isEmpty() && q2.isEmpty()) {
//            return true;
//        }
//        return false;
//    }

    // Method 2 (By making pop operation costly)
    // Time Complexity:
    // Push operation: O(1).
    // Same as pop operation in queue.
    // Pop operation: O(N).
    // In the worst case we have empty whole of queue 1 into queue 2
    // Auxiliary Space: O(N).

    Queue<Integer> q1 = new ArrayDeque<Integer>();
    Queue<Integer> q2 = new ArrayDeque<Integer>();

    void push(int x) {
        q1.add(x);
    }

    int pop() {
        int x = 0;
        // if first stack is empty
        if (q1.isEmpty() && q2.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        // Move all elements except last from the first queue to the second queue
        while (!q1.isEmpty()) {
            if (q1.size() == 1) {
                x = q1.peek();
            } else {
                q2.add(q1.peek());
            }
            q1.poll();
        }

        // Return the last element after moving all elements back to the first queue
        while (!q2.isEmpty()) {
            q1.add(q2.peek());
            q2.poll();
        }
        return x;
    }

    boolean isEmpty() {
        if (q1.isEmpty() && q2.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        StackUsingQueue st = new StackUsingQueue();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        while (!st.isEmpty()) {
            int res = st.pop();
            System.out.print(res + " ");
        }
        System.out.println(st.pop());
    }

}
