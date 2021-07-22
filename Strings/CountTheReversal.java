package Strings;

import java.util.*;

public class CountTheReversal {
//    Time Complexity: O(n) 
//    Auxiliary Space: O(n)
//    static int countRev(String s) {
//        Stack<Character> st = new Stack<>();
//        int c1 = 0, c2 = 0;
//        int n = s.length();
//        int ans;
//        if (n % 2 != 0) {
//            return -1;
//        }
//        for (int i = 0; i < n; i++) {
//            char ch = s.charAt(i);
//            if (ch == '{') {
//                st.push(ch);
//                c2++;
//            } else if (ch == '}' && !st.isEmpty() && st.peek() == '{') {
//                st.pop();
//                c2--;
//            } else {
//                c1++;
//            }
//        }
//        if (c1 % 2 != 0) {
//            c1 = (c1 / 2) + 1;
//        } else {
//            c1 = c1 / 2;
//        }
//        if (c2 % 2 != 0) {
//            c2 = (c2 / 2) + 1;
//        } else {
//            c2 = c2 / 2;
//        }
//        return c1 + c2;
//        ans = (int) (Math.ceil((left_brace) / 2) + Math.ceil((right_brace) / 2));
//        return ans;
//    }

    // Method-2
//    Time Complexity: O(n) 
//    Auxiliary Space: O(1)
    static int countRev(String s) {
        int n = s.length();
        int ans;

        // Expressions of odd lengths cannot be balanced
        if (n % 2 != 0) {
            return -1;
        }
        int left_brace = 0, right_brace = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

// If we find a left bracket then we simply increment the left bracket
            if (ch == '{') {
                left_brace++;
            }

// Else if left bracket is 0 then we find unbalanced right bracket and increment
// right bracket or if the expression is balanced then we decrement left.
            else {
                if (left_brace == 0) {
                    right_brace++;
                } else {
                    left_brace--;
                }
            }
        }
        // returning ceil value
        ans = (int) (Math.ceil((left_brace) / 2) + Math.ceil((right_brace) / 2));
        return ans;
    }

    public static void main(String[] args) {
        String expr = "}}{{";
        System.out.println("Total no. of reversal: " + countRev(expr));
    }

}
