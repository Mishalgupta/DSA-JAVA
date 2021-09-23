package DP;

public class CountOfSubsetsWithGivenSum {
    // Method-Top-down
    // Time Complexity: O(N*sum)
    // Auxiliary Space: O(N*sum)
    public static int isSubsetSum(int N, int arr[], int sum) {
        int dp[][] = new int[N + 1][sum + 1];
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (j == 0) {
                    dp[i][j] = 1;
                } else if (i == 0) {
                    dp[i][j] = 0;
                } else if (arr[i - 1] <= j) {
                    // here we need to check count for all the cases that's why we use + here.
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] + dp[i - 1][j];
                } else if (arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][sum];
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6, 8, 10 };
        int N = arr.length;
        int sum = 10;
        int res = isSubsetSum(N, arr, sum);
        System.out.println("count is: " + res);
    }

}