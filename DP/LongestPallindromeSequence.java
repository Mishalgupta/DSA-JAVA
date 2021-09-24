package DP;

public class LongestPallindromeSequence {
    // Method: Top-down
    // Time: O(m*n)
    // Space: O(m*n)
    public static int longestPalinSubseq(String s1) {
        // since string is immutable so we need to use StringBuilder()
        StringBuilder input1 = new StringBuilder();
        // append a string into StringBuilder input1
        input1.append(s1);
        // reverse StringBuilder input1
        input1.reverse();
        String s2 = input1.toString();

        int x = s1.length();
        int y = s2.length();

        int dp[][] = new int[x + 1][y + 1];
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[x][y];
    }

    public static void main(String[] args) {
        String s1 = "BBABCBCAB";
        int res = longestPalinSubseq(s1);
        System.out.println("Lcs is: " + res);
    }

}