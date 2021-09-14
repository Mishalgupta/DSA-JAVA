package DP;

public class PartitionEqualSubsetSum {
//Time Complexity: O(N*sum)
//Auxiliary Space: O(N*sum)
    public static boolean isSubsetSum(int N, int arr[], int sum) {
        boolean dp[][] = new boolean[N + 1][sum + 1];
        // Initialization! matrix with true/false instead of 0
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    dp[i][j] = false;
                }
                if (j == 0) {
                    dp[i][j] = true;
                }
            }
        }
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else if (arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[N][sum];
    }

    static int equalPartition(int N, int arr[]) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        if (sum % 2 == 0) {
            // if sum is 22 them half is 11 then
            // we check if rest sum is 11 or not
            boolean res = isSubsetSum(N, arr, sum / 2);
            if (res == true) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 34, 31 };
        int N = arr.length;
        int res = equalPartition(N, arr);
        if (res == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}