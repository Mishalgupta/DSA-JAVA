package DP;

public class UnboundedKnapsack {
    // Method: Top-down
//    Time: O(N*W)
//    Space: O(W)
    static int UnboundedknapSack(int N, int W, int val[], int wt[]) {
        int dp[][] = new int[N + 1][W + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= W; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                    continue;
                } else if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], val[i - 1] + dp[i][j - wt[i - 1]]);
                } else if (wt[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][W];
    }

    public static void main(String[] args) {
        int val[] = { 1, 4, 5, 7 };
        int wt[] = { 1, 3, 4, 5 };
        int N = 4, W = 8;
        int res = UnboundedknapSack(N, W, val, wt);
        System.out.println("Max. value is: " + res);
    }

}