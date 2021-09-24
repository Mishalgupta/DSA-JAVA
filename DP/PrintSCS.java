package DP;

public class PrintSCS {
//    Time: O(n^2). 
//    Space: O(n^2).
    public static String shortestCommonSupersequence(String str1, String str2, int x, int y) {
        int dp[][] = new int[x + 1][y + 1];
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                // base case initialisation
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // store our result in string & return it
        String res = "";
        int p1 = x, p2 = y;
        while (p1 > 0 && p2 > 0) {
            // if element matches then reduce both x & y
            // digonal move from i->i-1 & j->j-1
            if (str1.charAt(p1 - 1) == str2.charAt(p2 - 1)) {
                res += str1.charAt(p1 - 1);
                p1--;
                p2--;
            }
            // move in the direction of greater
            // horizontal move from j to j-1
            else if (dp[p1][p2 - 1] > dp[p1 - 1][p2]) {
                res += str2.charAt(p2 - 1);
                p2--;
            }
            // vertical move from i to i-1
            else {
                res += str1.charAt(p1 - 1);
                p1--;
            }
        }
        while (p1 > 0) {
            res += (str1.charAt(p1 - 1));
            p1--;
        }

        // If X reaches its end, put remaining characters
        // of Y in the result string
        while (p2 > 0) {
            res += (str2.charAt(p2 - 1));
            p2--;
        }

        // since string is immutable so we need to use StringBuilder()
        StringBuilder input1 = new StringBuilder();
        // append a string into StringBuilder input1
        input1.append(res);
        // reverse StringBuilder input1
        input1.reverse();
        String res2 = input1.toString();

        return res2;
    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "XYCD";
        int m = s1.length();
        int n = s2.length();
        String res = shortestCommonSupersequence(s1, s2, m, n);
        System.out.println("SCS is: " + res);
    }

}