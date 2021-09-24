package DP;

public class ShortestSuperSequence {
    // Method: Top-down
    // Time: O(m*n)
    // Space: O(m*n)
    // Function to find length of shortest common supersequence of two strings.
    public static int sCS(String X, String Y, int m, int n) {
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        // s1.length()+s2.length() - lcs
        return m + n - dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "XYCD";
        int m = s1.length();
        int n = s2.length();
        int res = sCS(s1, s2, m, n);
        System.out.println("SCS is: " + res);
    }

}