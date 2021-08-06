package Stack;

import java.util.Stack;

//Method-Recursion
//Time: O(n)
//Space: O(n)
public class InsertAtBottomOfStack {
    static Stack<Integer> st = new Stack<>();

    public static void pushAtBottom(int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int res = st.peek();
        // pop all items till stack is empty & then insert the x
        st.pop();
        pushAtBottom(x);
        // push all the items held in Function Call Stack
        // once the item is inserted at the bottom
        st.push(res);
    }

    public static void main(String[] args) {
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Stack before inserting element at the end: ");
        System.out.println(st);
        int x = 0;
        System.out.println("Stack after inserting element at the end: ");
        pushAtBottom(x);
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }

}
