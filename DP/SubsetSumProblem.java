package DP;

public class SubsetSumProblem {
    // Method-Top-down
    // Time Complexity: O(N*sum of elements)
    // Auxiliary Space: O(N*sum of elements)
    public static boolean isSubsetSum(int N, int arr[], int sum) {
        boolean dp[][] = new boolean[N + 1][sum + 1];
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                // Initialization! matrix with true/false instead of 0
                if (i == 0) {
                    dp[i][j] = false;
                } else if (j == 0) {
                    dp[i][j] = true;
                } else if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else if (arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][sum];
    }

    public static void main(String[] args) {
        int arr[] = { 3, 34, 4, 12, 5, 2 };
        int N = arr.length;
        int sum = 9;
        boolean res = isSubsetSum(N, arr, sum);
        if (res == true) {
            System.out.println("Yes");
        } else {
            System.out.println("NoF");
        }
    }

}