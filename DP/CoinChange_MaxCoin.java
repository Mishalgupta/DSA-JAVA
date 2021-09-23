package DP;

public class CoinChange_MaxCoin {
    static int maxcoin(int arr[], int n, int sum) {
//        Time Complexity: O(m*n).
//        Auxiliary Space: O(n).
        int dp[][] = new int[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0) {
                    dp[i][j] = 1;
                } else if (i == 0) {
                    dp[i][j] = 0;
                } else if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i][j - arr[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int N = arr.length;
        int sum = 4;
        int res = maxcoin(arr, N, sum);
        System.out.println("count is: " + res);
    }

}