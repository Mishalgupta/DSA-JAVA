package Stack;

public class LengthOfLongestValidSubstring {
//    Method: Traverse the string on and keep track of the count of open parentheses and close parentheses
//    with the help of two counters left and right respectively.
//    Expected Time Complexity:O(n)
//    Expected Auxiliary Space: O(1)   
    static int findMaxLen(String s) {
        int n = s.length();
        int left = 0, right = 0;
        int maxlen = 0;

        // Iterating the string from left to right
        for (int i = 0; i < n; i++) {
            // If "(" is encountered,
            // then left counter is incremented
            // else right counter is incremented
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }

            // Whenever left is equal to right, it signifies
            // that the subsequence is valid
            if (left == right) {
                maxlen = Math.max(maxlen, 2 * right);
            }
            // Reseting the counters when the subsequence
            // becomes invalid
            else if (right > left) {
                left = 0;
                right = 0;
            }
        }
        left = right = 0;
        // Iterating the string from right to left
        for (int i = n - 1; i >= 0; i--) {
            // If "(" is encountered, then
            // left counter is incremented
            // else right counter is incremented
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            // Whenever left is equal to right,
            // it signifies that the subsequence
            // is valid
            if (left == right) {
                // since we need to take length of both let & right.
                // so, we take 2*left or 2*right as both are equal.
                maxlen = Math.max(maxlen, 2 * left);
            }
            // Reseting the counters when the
            // subsequence becomes invalid
            else if (left > right) {
                left = 0;
                right = 0;
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String str = "((()()";

        // Function call
        System.out.println("longest valid substring is: " + findMaxLen(str));

        str = "()(()))))";

        // Function call
        System.out.println("longest valid substring is: " + findMaxLen(str));

    }

}
