package Stack;

import java.util.Stack;

public class ReverseStackRecursion {
//    Time Complexity: O(n²)
//    Space Complexity: O(n)
    static Stack<Integer> s = new Stack<>();

    // Below is a recursive function
    // that inserts an element
    // at the bottom of a stack.
    static void insert(int x) {
        if (s.isEmpty()) {
            s.push(x);
        } else {
            int temp = s.peek();
            s.pop();
            // again pop till last stack is empty & store last element in temp.
            insert(x);
            // after reaching last add temp to stack
            // push allthe items held
            // in Function Call Stack
            // once the item is inserted
            // at the bottom
            s.push(temp);
        }
    }

    static void reverse() {
        if (s.size() > 0) {
            // here will pop the top element until we reach end of stack
            int temp = s.peek();
            s.pop();
            reverse();
            // after reaching stack end we insert the element stored in temp to stack
            insert(temp);
        }
    }

    public static void main(String[] args) {
        // push elements into
        // the stack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Original Stack");

        System.out.println(s);

        // function to reverse
        // the stack
        reverse();

        System.out.println("Reversed Stack");

        System.out.println(s);
    }

}
