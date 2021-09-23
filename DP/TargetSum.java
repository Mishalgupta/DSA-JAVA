package DP;

//Same ques:
//Count the number of subset with a given difference
public class TargetSum {
//    Time: O(N*sum), where sum refers to the range of sum possible.
//    Space: O(N).
    static int findTarget(int[] A, int N, int target) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        if ((sum + target) % 2 != 0) {
            return 0;
        }
        sum = (sum + target) / 2;
        // now we have sum, so we can now follow the same approach of top-down
        int dp[][] = new int[N + 1][sum + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == 0)
                    dp[i][j] = 1;
                else if (i == 0)
                    dp[i][j] = 0;
                else if (A[i - 1] <= j)
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - A[i - 1]];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[N][sum];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 1, 1 };
        int N = arr.length;
        int target = 3;
        int res = findTarget(arr, N, target);
        System.out.println("count is: " + res);
    }
}