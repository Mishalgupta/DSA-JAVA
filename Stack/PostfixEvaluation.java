package Stack;

import java.util.Stack;

public class PostfixEvaluation {
//string S denoting the expression as input parameter and returns the evaluated value.
    // Time Complexity: O(|s|)
    // Space Complexity: O(|s|)
    static int postfix(String s) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                // since s.char(i) is character value,
//                so we need to convert this into integer using ascii
                // subtracting with the ascii value, [0-9]=[48-57]
                st.push(s.charAt(i) - '0');
            } else {
                // since we are traversing from left to right, so top will be second one
                int op2 = st.peek();
                st.pop();
                int op1 = st.peek();
                st.pop();

                switch (s.charAt(i)) {
                case '+':
                    st.push(op1 + op2);
                    break;
                case '-':
                    st.push(op1 - op2);
                    break;
                case '*':
                    st.push(op1 * op2);
                    break;
                case '/':
                    st.push(op1 / op2);
                    break;
                case '^':
                    st.push((int) Math.pow(op1, op2));
                    break;
                }
            }
        }
        return st.peek();

    }

    public static void main(String[] args) {
//        postfix: 562+*24/-
        String s = "562+*24/-";
        System.out.println("Postfix resultant value is: " + postfix(s));
    }

}
