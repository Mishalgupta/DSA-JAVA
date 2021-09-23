package DP;

import java.util.*;

public class LCSubsequence {

    // Method1-Recursive Brute force
//  Expected Time Complexity: O(2^N).
//  Expected Auxiliary Space: O(1)

//Case 1: The item is included in the optimal subset.
//Case 2: The item is not included in the optimal set.
//    static int lcs(int x, int y, String s1, String s2) {
//        // Base condition
//        if (x == 0 || y == 0) {
//            return 0;
//        }
//        // if matches then reduce both x,y and add +1 in lcs
//        if (s1.charAt(x - 1) == s2.charAt(y - 1)) {
//            return 1 + lcs(x - 1, y - 1, s1, s2);
//        }
//        // if not matches then take max. subsequence after reducing each
//        else {
//            return Math.max(lcs(x - 1, y, s1, s2), lcs(x, y - 1, s1, s2));
//        }
//    }

    // Method2-Memoisation
//    Expected Time Complexity: O(N*W).
//    Expected Auxiliary Space: O(N*W)
    // Function to find the length of longest common subsequence in two strings.
//    static int lcs(int x, int y, String s1, String s2) {
//        // creating array
//        int dp[][] = new int[x][y];
//        // assign -1 to all positions
//        for (int row[] : dp) {
//            Arrays.fill(row, -1);
//        }
//        return solve(x, y, s1, s2, dp);
//    }
//
//    static int solve(int x, int y, String s1, String s2, int dp[][]) {
//        // Base condition
//        if (x == 0 || y == 0) {
//            return 0;
//        }
//        // check if value is alredy exist or not
//        // here we are using dp[x-1][y-1] because array index starts with 0
//        if (dp[x - 1][y - 1] != -1) {
//            return dp[x - 1][y - 1];
//        }
//        // if matches then reduce both x,y and add +1 in lcs
//        if (s1.charAt(x - 1) == s2.charAt(y - 1)) {
//            return dp[x - 1][y - 1] = 1 + solve(x - 1, y - 1, s1, s2, dp);
//        }
//        // if not matches then take max. subsequence after reducing each
//        else {
//            return dp[x - 1][y - 1] = Math.max(solve(x - 1, y, s1, s2, dp), solve(x, y - 1, s1, s2, dp));
//        }
//    }

    // Method3- Top-down approach
//  Expected Time Complexity: O(N*W).
//  Expected Auxiliary Space: O(N*W)
    static int lcs(int x, int y, String s1, String s2) {
        // Declare the table dynamically
        int dp[][] = new int[x + 1][y + 1];

        // Loop to initially filled the table with -1
        for (int i = 0; i < x + 1; i++) {
            for (int j = 0; j < y + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
                // if matches then reduce both x,y and add +1 in lcs
                if (s1.charAt(x - 1) == s2.charAt(y - 1)) {
                    dp[i][j] = 1 + dp[x - 1][y - 1];
                }
                // if not matches then take max. subsequence after reducing each
                else {
                    dp[i][j] = Math.max(dp[x - 1][y], dp[x][y - 1]);
                }
            }
        }
        return dp[x][y];
    }

    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "AC";
        int x = s1.length(), y = s2.length();
        int res = lcs(x, y, s1, s2);
        System.out.println("Lcs is: " + res);
    }
}