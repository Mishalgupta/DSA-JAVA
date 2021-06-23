package Stack;

import java.util.Stack;

public class SpecialStack {
//Method-1
//Expected Time Complexity: O(N) for getMin, O(1) for remaining all 4 functions.
//Expected Auxiliary Space: O(N) for all the 5 functions.
//    Stack<Integer> s = new Stack<>();
//    Stack<Integer> ss = new Stack<>(); // supporting stack
//
//    public void push(int a) {
//        s.push(a);
//        if (ss.isEmpty() || ss.peek() >= a) {
//            ss.push(a);
//            return;
//        }
//    }
//
//    public int pop() {
//        if (s.isEmpty()) {
//            return -1;
//        }
//        int res = s.peek();
//        s.pop();
//        if (ss.peek() == res) {
//            ss.pop();
//        }
//        return res;
//    }
//
//    public int min() {
//        if (ss.isEmpty()) {
//            System.out.println("Stack is empty");
//        }
//        return ss.peek();
//    }
//
//    public boolean isFull(int n) {
//        if (s.size() == n) {
//            return true;
//        }
//        return false;
//    }
//
//    public boolean isEmpty() {
//        if (s.isEmpty()) {
//            return true;
//        }
//        return false;
//    }

//Method-2:
    // Expected Time Complexity: O(1).
    // Expected Auxiliary Space: O(1) for all the 5 functions.

    Stack<Integer> s = new Stack<>();
    int min = Integer.MIN_VALUE;

    public void push(int a) {
        if (s.isEmpty()) {
            s.push(a);
            min = a;
        } else {
            if (a >= min) {
                s.push(a);
            } else if (a < min) {
                s.push(2 * a - min);
                min = a;
            }
        }
    }

    public int pop() {
        if (s.isEmpty()) {
            return -1;
        } else {
            if (s.peek() >= min) {
                s.pop();
            } else if (s.peek() < min) {
                min = 2 * min - s.pop();
            }
        }
        return min;
    }

    int peek() {
        if (s.isEmpty()) {
            return -1;
        } else {
            if (s.peek() >= min) {
                return s.peek();
            }
            return min;
        }
    }

    public int min() {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
        }
        return min;
    }

    public boolean isFull(int n) {
        if (s.size() == n) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (s.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        SpecialStack s = new SpecialStack();
        s.push(3);
        s.push(5);
        System.out.println("Min. element is: " + s.min());
        s.push(2);
        s.push(1);
        System.out.println("Min. element is: " + s.min());
        s.pop();
        System.out.println("Min. element is: " + s.min());
        s.pop();
        s.peek();

    }

}
