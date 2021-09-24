package DP;

public class LCSubstring {
//    Method:Top-down
//    Time: O(n*m).
//    Space: O(n*m).
    static int Lcsubstring(int x, int y, String s1, String s2) {
        int dp[][] = new int[x + 1][y + 1];
        int max = 0;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    // getting max. of prev max & current lcs
                    max = Math.max(max, dp[i][j]);
                }
                // if not match then set it to 0 & do compare for next iteration
                else {
                    dp[i][j] = 0;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s1 = "ABCDE";
        String s2 = "ACDE";
        int x = s1.length(), y = s2.length();
        int res = Lcsubstring(x, y, s1, s2);
        System.out.println("Lcsubstring is: " + res);
    }

}