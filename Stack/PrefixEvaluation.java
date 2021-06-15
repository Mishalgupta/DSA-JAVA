package Stack;

import java.util.Stack;

//string S denoting the expression as input parameter and returns the evaluated value.
//Time Complexity: O(s)
//Space Complexity: O(s)
public class PrefixEvaluation {
    static int prefix(String s) {
        Stack<Integer> st = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                // subtracting with the ascii value, [0-9]=[48-57]
                st.push(s.charAt(i) - '0');
            } else {
                // since we are traversing from right to left, so top will be first one
                int op1 = st.peek();
                st.pop();
                int op2 = st.peek();
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
//      prefix  -+7*45+20
        String s = "-+7*45+20";
        System.out.println("Prefix resultant value is: " + prefix(s));
    }

}
