package Stack;

import java.util.Stack;

public class ExpressionHaveRedundantBracketOrNot {
//    Time complexity: O(n) 
//    Auxiliary space: O(n)
    static boolean checkRedundant(String s) {
        // create a stack of characters
        Stack<Character> st = new Stack<>();
        // Iterate through the given expression
        for (int i = 0; i < s.length(); i++) {

            // if current character is close parenthesis ')'
            if (s.charAt(i) == ')') {
                char top = st.peek();
                st.pop();

                // If immediate pop have open parenthesis '('
                // duplicate brackets found
                boolean flag = true;

                while (top != '(') {

                    // Check for operators in expression
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        flag = false;
                    }

                    // Fetch top element of stack
                    top = st.peek();
                    st.pop();
                }

                // If operators not found
                if (flag == true) {
                    return true;
                }
            } else {
                st.push(s.charAt(i)); // push open parenthesis '(',
            } // operators and operands to stack
        }
        return false;
    }

    // Function to check redundant brackets
    static void findRedundant(String str) {
        boolean ans = checkRedundant(str);
        if (ans == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        String str = "((a+b))";
        findRedundant(str);

        str = "(a+(b)/c)";
        findRedundant(str);

        str = "(a+b*(c-d))";
        findRedundant(str);
    }

}
