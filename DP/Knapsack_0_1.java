package DP;

import java.util.*;

public class Knapsack_0_1 {
    // Method1-Recursive Brute force
//  Expected Time Complexity: O(2^N).
//  Expected Auxiliary Space: O(1)

//Case 1: The item is included in the optimal subset.
//Case 2: The item is not included in the optimal set.
//    static int knapSack(int W, int wt[], int val[], int n) {
//        // Base condition
//        if (W == 0 || n == 0) {
//            return 0;
//        }
//
//        // checking included & not included condition
//        if (wt[n - 1] <= W) {
//            // this returned value will store in the matrix
//            return Math.max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1), knapSack(W, wt, val, n - 1));
//        }
//        // checking not including condition
//        else if (wt[n - 1] > W) {
//            // this returned value will store in the matrix
//            return knapSack(W, wt, val, n - 1);
//        }
//        return 0;
//    }

    // Method2-Memoisation
//    Expected Time Complexity: O(N*W).
//    Expected Auxiliary Space: O(N*W)
//    static int knapSack(int W, int wt[], int val[], int N) {
//        // Declare the table dynamically
//        int dp[][] = new int[N + 1][W + 1];
//
//        // // Loop to initially filled the table with -1
////        for (int i = 0; i < N + 1; i++) {
////            for (int j = 0; j < W + 1; j++) {
////                dp[i][j] = -1;
////            }
////        }
//
//        // Using fill method
//        // Fill each row with -1.
//        for (int[] row : dp) {
//            Arrays.fill(row, -1);
//        }
//        return solve(W, wt, val, N, dp);
//    }
//
//    // Function to return max value that can be put in knapsack of capacity W.
//    static int solve(int W, int wt[], int val[], int n, int t[][]) {
//        // Base condition
//        if (W == 0 || n == 0) {
//            return 0;
//        }
//        // return if the value is not -1
//        if (t[n][W] != -1) {
//            return t[n][W];
//        }
//        // checking included & not included condition
//        if (wt[n - 1] <= W) {
//            // this returned value will store in the matrix
//            return t[n][W] = Math.max(val[n - 1] + solve(W - wt[n - 1], wt, val, n - 1, t),
//                    solve(W, wt, val, n - 1, t));
//        }
//        // checking not including condition
//        else if (wt[n - 1] > W) {
//            // this returned value will store in the matrix
//            return t[n][W] = solve(W, wt, val, n - 1, t);
//        }
//        return 0;
//    }

    // Method3- Top-down approach
//  Expected Time Complexity: O(N*W).
//  Expected Auxiliary Space: O(N*W)
    static int knapSack(int W, int wt[], int val[], int N) {
        // Declare the table dynamically
        int dp[][] = new int[N + 1][W + 1];

        // // Loop to initially filled the table with -1
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                } else if (wt[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][W];
    }

    public static void main(String[] args) {
        int val[] = { 1, 2, 3 };
        int wt[] = { 4, 5, 6 };
        int N = 3, W = 3;
        int res = knapSack(W, wt, val, N);
        System.out.println("Max. index value of val is: " + res);
    }
}