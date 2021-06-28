package Stack;

import java.util.Stack;

public class StackPermutation_ValidSequence {
    // Time: O(n) , n for pushed & popped array length
    // Space: O(n)
    static Stack<Integer> st = new Stack<>();

    static boolean permutation(int pushed[], int popped[]) {
        int j = 0;
        int n = pushed.length;
        int m = popped.length;
        for (int i = 0; i < n; i++) {
            // initially stack is empty
            st.push(pushed[i]);
            while (st.size() > 0 && st.peek() == popped[j]) {
                st.pop();
                j++;
            }
        }
        if (j == m) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int pushed[] = { 1, 2, 3, 4, 5 };
//        int popped[] = { 4, 3, 5, 1, 2 };
        int popped[] = { 4, 3, 5, 2, 1 };
        boolean res = permutation(pushed, popped);
        System.out.println("Valid permutation stack: " + res);
    }

}
