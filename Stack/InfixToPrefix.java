package Stack;

import java.util.Stack;

public class InfixToPrefix {

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

    static StringBuilder infixToPreFix(String s) {
//        reverse the string

        // prefix expression string
        StringBuilder result = new StringBuilder();

        // reversed string for stack
        StringBuilder input = new StringBuilder(s);
//        System.out.println(input.reverse());
        input.reverse();

        Stack<Character> st = new Stack<>();
        char[] charsExp = new String(input).toCharArray();
        // since brackets also get reversed,
        // so we need to again make them in proper position
        for (int i = 0; i < charsExp.length; i++) {
            if (charsExp[i] == '(') {
                charsExp[i] = ')';
                i++;
            } else if (charsExp[i] == ')') {
                charsExp[i] = '(';
                i++;
            }
        }

        for (int i = 0; i < charsExp.length; i++) {
            char ch = charsExp[i];
            // check if operand or not and then add to prefix expression
            if (ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                result.append(ch);
            }
            // if left parentheis then push to stack
            else if (ch == '(') {
                st.push(ch);
            }
            // if right parentheis then pop to stack until left one found
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    // continously pop from stack and add to prefix expression till we get '('
                    result.append(st.peek());
                    st.pop();
                }
                // remove left paranthesis from stack
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
            // if operator received
            else {
                while (!st.isEmpty() && prec(st.peek()) >= prec(ch)) {
                    // continously pop from stack and add to prefix expression each operator,
                    // having precedence greater or equal than coming element.
                    result.append(st.peek());
                    st.pop();
                }
                // add coming operator to stack
                st.push(ch);
            }
        }
        // pop all the remaining operators from the stack
        while (!st.isEmpty()) {
            result.append(st.peek());
            st.pop();
        }
        // again reverse the string
//        res = reverse(res);
//        System.out.println(res);
        return result.reverse();
    }

    public static void main(String[] args) {
//        String str = "a+b*(c^d-e)^(f+g*h)-i";
//        String str = "(A+(B*C)-(D/E^F)*G)*H";
//        String str = "(a-b/c)*(a/k-l)";
        String str = "A+B*(C^D-E)";
        StringBuilder res = infixToPreFix(str);
        System.out.println("Infix to prefix conversion: " + res);

    }

}