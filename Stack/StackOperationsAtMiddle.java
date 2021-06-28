package Stack;

import java.util.Stack;

public class StackOperationsAtMiddle {
    static Stack<Integer> st = new Stack<>();

    static int curr = 0;

    static void deleteMid(int n, int curr) {
        if (st.isEmpty() || curr == n) {
            return;
        }
        int temp = st.peek();
        st.pop();
        deleteMid(n, curr + 1);
        if (curr != n / 2) {
            st.push(temp);
        }
    }

    static void findMid(int n, int curr) {
        if (st.isEmpty()) {
            return;
        }
        int temp = st.peek();
        st.pop();
        findMid(n, curr + 1);
        if (curr == n / 2) {
            st.push(temp);
        }
    }

    public static void main(String[] args) {
        // push elements into the stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        int n = st.size();

        System.out.println("Printing stack after deletion of middle: ");
        deleteMid(n, curr);
        System.out.println(st);
        System.out.println("Printing stack after finding of middle: ");
        findMid(n, curr);
        System.out.println(st);

    }

}
