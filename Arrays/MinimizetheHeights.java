package Arrays;

import java.util.*;

public class MinimizetheHeights {
    // Method-1
//    Expected Time Complexity: O(N*logN)
//    Expected Auxiliary Space: O(N)
    // 1+n-1+ nlog(n)=O(n) Times

//    static int getMinDiff(int arr[], int n, int k) {
//        if (n == 1)
//            return 0;
//
//        // Sort all elements
//        Arrays.sort(arr); // nlog(n) times
//        int max = arr[n - 1];
//        int min = arr[0];
//        int result = max - min;
//        for (int i = 1; i < n; i++) // n-1 times
//        {
//            max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
//            min = Math.min(arr[0] + k, arr[i] - k);
//            result = Math.min(result, max - min);
//        }
//        return result; // 1 times
//    }

    // Method-2 Time Complexity: O(n Log n)
    // 1+n-1+ nlog(n)=O(n) Times
    static int getMinDiff(int arr[], int n, int k) {
        if (n == 1)
            return 0;

        // Sort all elements
        Arrays.sort(arr); // nlog(n)

        // Initialize result
        int ans = arr[n - 1] - arr[0];

        // Handle corner elements
        int small = arr[0] + k;
        int big = arr[n - 1] - k;
        int temp = 0;

        if (small > big) {
            temp = small;
            small = big;
            big = temp;
        }

        // Traverse middle elements
        for (int i = 1; i < n - 1; i++) // n-1 times
        {
            int subtract = arr[i] - k;
            int add = arr[i] + k;

            // If both subtraction and addition
            // do not change diff
            if (subtract >= small || add <= big)
                continue;

            // Either subtraction causes a smaller
            // number or addition causes a greater
            // number. Update small or big using
            // greedy approach (If big - subtract
            // causes smaller diff, update small
            // Else update big)
            // checking which is min. subtraction if
            // big - lowest(subtraction) is less than high(addition)-small
            if (big - subtract <= add - small)
                small = subtract;
            else
                big = add;
        }

        return Math.min(ans, big - small);
    }

    public static void main(String[] args) {
//        int arr[] = { 4, 6 };
        int arr[] = { 3, 9, 12, 16, 20 };
        int n = arr.length;
        int k = 3;
        System.out.println("Maximum difference is " + getMinDiff(arr, n, k));
    }

}
