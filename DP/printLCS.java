package DP;

import java.util.*;

public class printLCS {
    // Similarly we can do this for strings
    // Time: O(n*m)
    public static List<Integer> lcs(List<Integer> a, List<Integer> b, int x, int y) {
        int dp[][] = new int[x + 1][y + 1];
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                // base case initialisation
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (a.get(i - 1) == b.get(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        // store our result in list array
        List<Integer> ans = new ArrayList<>();
        int p1 = x, p2 = y;
        while (p1 > 0 && p2 > 0) {
            // if element matches then reduce both x & y
            // digonal move from i->i-1 & j->j-1
            if (a.get(p1 - 1) == b.get(p2 - 1)) {
                ans.add(a.get(p1 - 1));
                p1--;
                p2--;
            }
            // move in the direction of greater
            // horizontal move from j to j-1
            else if (dp[p1][p2 - 1] > dp[p1 - 1][p2]) {
                p2--;
            }
            // vertical move from i to i-1
            else {
                p1--;
            }
        }
        // reverse the list
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> i1 = new ArrayList<>();
        List<Integer> i2 = new ArrayList<>();
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 4, 6, 9, 5 };
        for (int i : arr1) {
            i1.add(i);
        }
        for (int i : arr2) {
            i2.add(i);
        }
        int x = i1.size();
        int y = i1.size();
        List<Integer> res = lcs(i1, i2, x, y);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

}