package Greedy;

import java.util.*;

public class MinimumCoins {
//    Time Complexity: O(v) in worst if all changes are 1 of rs., where v is V Rs.
//    Auxiliary Space: O(v) or nearly constant.
    static void findMin(int amount, int deno[]) {
        int n = deno.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            // till amount is greater than deno value subtract it
            while (amount >= deno[i]) {
                amount = amount - deno[i];
                ans.add(deno[i]);
            }
        }
        // Print result
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(" " + ans.get(i));
        }
    }

    public static void main(String[] args) {
        int amount = 93;
        // All denominations of Indian Currency
        int deno[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
        System.out.print("Following is minimal number of change for " + amount + ": ");
        findMin(amount, deno);
    }
}