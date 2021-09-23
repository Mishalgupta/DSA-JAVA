package DP;

public class RodCutting {
// Method- Unbounded knapsack
//    Time Complexity: O(N2)
//    Auxiliary Space: O(N)
    public static int cutRod(int price[], int n) {
        // creating length array of size n
        int len[] = new int[n];
        for (int i = 0; i < n; i++) {
            len[i] = i + 1;
        }
        // since we n length for both price & len array
        // here we take val[] as price & wt[] as len[]
        int dp[][] = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (len[i - 1] <= j) {
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - len[i - 1]], dp[i - 1][j]);
                } else if (len[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][n];
    }

    public static void main(String[] args) {
        int N = 8;
        int Price[] = { 3, 5, 8, 9, 10, 17, 17, 20 };
        int res = cutRod(Price, N);
        System.out.println(res);
    }

}