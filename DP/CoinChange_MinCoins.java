package DP;

public class CoinChange_MinCoins {
    public static int minCoins(int coins[], int M, int sum) {
//      Time Complexity: O(m*n).
//      Auxiliary Space: O(n).
        int dp[][] = new int[M + 1][sum + 1];
        // initialise for 1st row/col
        for (int i = 0; i < M + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    // here we are using Integer.MAX_VALUE-1 because
                    // we are adding one for each included coin so, this will becomes
                    // Integer.MAX_VALUE+1
                    // which will not gona support by int, so we need to use -1
                    // there with Integer.MAX_VALUE-1.
                    dp[i][j] = Integer.MAX_VALUE - 1;
                } else if (j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
        // initialise for 2nd row/col
        for (int j = 1; j <= sum; j++) {
            if (j % coins[0] == 0) {
                dp[1][j] = j / coins[0];
            } else {
                dp[1][j] = Integer.MAX_VALUE - 1;
            }
        }
        for (int i = 2; i < M + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = Math.min(dp[i][j - coins[i - 1]] + 1, dp[i - 1][j]);
                } else if (coins[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        if (dp[M][sum] < Integer.MAX_VALUE - 1) {
            return dp[M][sum];
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 25, 10, 5 };
        int N = arr.length;
        int sum = 30;
        int res = minCoins(arr, N, sum);
        System.out.println("count is: " + res);
    }

}