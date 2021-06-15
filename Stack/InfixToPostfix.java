package Stack;

import java.util.Stack;

public class InfixToPostfix {

//Expected Time Complexity: O(|str|).
//Expected Auxiliary Space: O(|str|).

    // function for precedence
    static int prec(char ch) {
        if (ch == '^') {
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return -1;
        }
    }

    static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        String res = "";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            // check if operand or not and then add to postfix expression
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                res = res + s.charAt(i);
            }
            // if left parentheis then push to stack
            else if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            }
            // if right parentheis then pop to stack until left one found
            else if (s.charAt(i) == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    // continously pop from stack and add to postfix expression till we get '('
                    res = res + st.peek();
                    st.pop();
                }
                // remove left paranthesis from staxk
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
            // if operator received
            else {
                while (!st.isEmpty() && prec(st.peek()) >= prec(s.charAt(i))) {
                    // continously pop from stack and add to postfix expression each operator,
                    // having precedence greater or equal than coming element.
                    res = res + st.peek();
                    st.pop();
                }
                // add coming operator to stack
                st.push(s.charAt(i));
            }
        }
        // pop all the remaining operators from the stack
        while (!st.isEmpty()) {
            if (st.peek() == '(') {
                return "Invalid Expression";
            }
            res = res + st.peek();
            st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "a+b*(c^d-e)^(f+g*h)-i";
//        String str = "(A+(B*C)-(D/E^F)*G)*H";
//        String str = "(a-b/c)*(a/k-l)";
        String res = infixToPostfix(str);
        System.out.println("Infix to postfix conversion: " + res);
    }

}
