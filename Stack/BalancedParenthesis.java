package Stack;

import java.util.Stack;

//s=length of string
//Expected Time Complexity: O(|s|)
//Expected Auixilliary Space: O(|s|)
public class BalancedParenthesis {
    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        boolean ans = true;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                if (!st.isEmpty() && st.peek() == '(') {

                    st.pop();
                } else {
                    ans = false;
                    break;
                }
            } else if (ch == '}') {
                if (!st.isEmpty() && st.peek() == '{') {
                    st.pop();
                } else {
                    ans = false;
                    break;
                }
            } else if (ch == ']') {
                if (!st.isEmpty() && st.peek() == '[') {
                    st.pop();
                } else {
                    ans = false;
                    break;
                }
            }
        }
        if (!st.isEmpty()) {
            return false;
        }
        return ans;
    }

    public static void main(String[] args) {

        String s = "{([])}";

        if (isValid(s)) {
            System.out.println("Valid string");
        } else {
            System.out.println("inValid string");
        }
    }

}
