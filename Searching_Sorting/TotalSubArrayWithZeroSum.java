package Searching_Sorting;

import java.util.*;
//You are given an array arr[] of size n. Find the total count of sub-arrays having their sum equal to 0.

public class TotalSubArrayWithZeroSum {
//    Use Hashing. Keep on hashing the prefix sum at each element. When we get the same sum again,
//    this means somewhere a subarray with sum equal to 0 would have occurred. So, simply we can add it to the total count.
    public static long findSubarray(long[] arr, int n) {
//        Expected Time Complexity : O(n)
//        Expected Auxilliary Space : O(n)
        HashMap<Long, Integer> a = new HashMap<Long, Integer>();
        long sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum == 0) {
                count++;
            }
            if (a.containsKey(sum)) {
                count += a.get(sum);
                a.put(sum, a.get(sum) + 1);
            } else {
                a.put(sum, 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        long arr[] = { 0, 0, 5, 5, 0, 0 };
//        long arr[] = { 6, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
        int n = arr.length;
        System.out.println(findSubarray(arr, n));
    }

}
