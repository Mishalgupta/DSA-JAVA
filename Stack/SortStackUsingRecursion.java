package Stack;

import java.util.Stack;

public class SortStackUsingRecursion {
//Method-1: normal stack sort using loops
//    Expected Time Complexity : O(N*N)
//    Expected Auixilliary Space : O(1).
    public static Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> st = new Stack<Integer>();
        while (!s.isEmpty()) {
            int temp = s.pop();
            while (!st.isEmpty() && st.peek() > temp) {
                s.push(st.pop());
            }
            st.push(temp);
        }
        return st;
    }

    // Method-2: Using recursion
//    Expected Auixilliary Space : O(N) recursive.
//    static void sort(Stack<Integer> st) {
//        if (st.isEmpty()) {
//            return;
//        }
//        int temp = st.peek();
//        st.pop();
//        sort(st);
//        insert(st, temp);
//    }
//
//    static void insert(Stack<Integer> st, int temp) {
//        if (st.isEmpty() || st.peek() <= temp) {
//            st.push(temp);
//            return;
//        }
//        int val = st.peek();
//        st.pop();
//        insert(st, temp);
//        st.push(val);
//    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);
//        sort(s);
        s = sort(s);
        System.out.println("Stack elements after sorting:");
        while (!s.empty()) {
            System.out.print(s.pop() + " ");
        }
    }

}
