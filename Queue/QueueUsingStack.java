package Queue;

import java.util.Stack;

public class QueueUsingStack {
//Method 1 (By making enQueue operation costly)
    // Time Complexity:
    // Push operation: O(N).
    // Same as pop operation in stack.
    // Pop operation: O(1).
    // In the worst case we have empty whole of stack 1 into stack 2
    // Auxiliary Space: O(N).
    static Stack<Integer> s1 = new Stack<Integer>();
    static Stack<Integer> s2 = new Stack<Integer>();

    void push(int x) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.peek());
            s1.pop();
        }

        // Push item into s1(since initially stack1 is empty so we need to push value)
        s1.push(x);

        // Push everything back s2 to s1
        while (!s2.isEmpty()) {
            s1.push(s2.peek());
            s2.pop();
        }
    }

    // Dequeue an item from the queue
    int pop() {
        // if first stack is empty
        if (s1.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        // Return top of s1
        int x = s1.peek();
        s1.pop();
        return x;
    }

    boolean isEmpty() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        }
        return false;
    }
//Method 2: (By making deQueue operation costly)
//Time Complexity: 
//Push operation: O(1). 
//Same as pop operation in stack.
//Pop operation: O(N). 
//In the worst case we have empty whole of stack 1 into stack 2
//Auxiliary Space: O(N). 
//Use of stack for storing values. 
//    Stack<Integer> s1 = new Stack<>();
//    Stack<Integer> s2 = new Stack<>();
//
//    void push(int x) {
//        s1.push(x);
//    }
//
//    int pop() {
//        if (s1.isEmpty() && s2.isEmpty()) {
//            System.out.println("Queue is empty");
//            return -1;
//        } else if (s2.isEmpty()) {
//            while (!s1.isEmpty()) {
//                s2.push(s1.peek());
//                s1.pop();
//            }
//        }
//        int topval = s2.peek();
//        s2.pop();
//        return topval;
//    }
//
//    boolean isEmpty() {
//        if (s1.isEmpty() && s2.isEmpty()) {
//            return true;
//        }
//        return false;
//    }

    // method 3: using Function Call Stack
    // Time & space same as above method
//    Stack<Integer> s1 = new Stack<>();
//
//    void push(int x) {
//        s1.push(x);
//    }
//
//    int pop() {
//        if (s1.isEmpty()) {
//            System.out.println("Queue is empty");
//            return -1;
//        }
//        int x = s1.peek();
//        s1.pop();
//        // if only one element then return that element
//        if (s1.isEmpty()) {
//            return x;
//        }
//
//        /* recursively pop an item from the stack1 */
//        int item = pop();
//        /* push everything back to stack1 */
//        s1.push(x);
//        return item;
//    }
//
//    boolean isEmpty() {
//        if (s1.isEmpty()) {
//            return true;
//        }
//        return false;
//    }

    public static void main(String[] args) {
        QueueUsingStack st = new QueueUsingStack();
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