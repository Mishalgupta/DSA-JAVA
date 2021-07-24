package Greedy;

import java.util.*;

public class MinimumPlatform {
    // Time: O(2nlogn) +O(2n) => O(nlogn)
    // Space: O(1)
    static int findPlatform(int arr[], int dep[], int n) {
        // sort both arr & dep
        Arrays.sort(arr);
        Arrays.sort(dep);
        // using two pointer one for arr & another for dep
        int i = 1, j = 0;
        int res = 1, plat_needed = 1;
        while (i < n && j < n) {
            if (arr[i] > dep[j]) {
                plat_needed--;
                j++;
            }
            // arrival & dep should not be same if so, then we need to move to next platform
            else if (arr[i] <= dep[j]) {
                plat_needed++;
                i++;
            }
            // update the res with plat_needed
            if (plat_needed > res) {
                res = plat_needed;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 120, 50, 550, 200, 700, 800 };
        int dep[] = { 600, 550, 700, 500, 900, 2000 };
        int n = arr.length;
        System.out.println("Min. platform req. is: " + findPlatform(arr, dep, n));
    }

}
