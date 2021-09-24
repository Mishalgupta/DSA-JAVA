package DP;

public class MinimumNumberOfDeletions_Insertions {
    // Method: Top-down
    // Time: O(m*n)
    // Space: O(m*n)
    public static int minOperations(String str1, String str2, int m, int n) {
        int dp[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        // s1.length - lcs + s2.length() -lcs
        return (m - dp[m][n]) + (n - dp[m][n]);
    }

    public static void main(String[] args) {
        String s1 = "HEAP";
        String s2 = "PEA";
        int m = s1.length();
        int n = s2.length();
        int res = minOperations(s1, s2, m, n);
        System.out.println("SCS is: " + res);
    }

}