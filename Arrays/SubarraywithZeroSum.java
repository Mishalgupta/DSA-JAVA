package Arrays;

import java.util.*;

//Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
public class SubarraywithZeroSum {
//    Expected Time Complexity: O(n).
//    Expected Auxiliary Space: O(n).
//    If we consider all prefix sums, we can
//    notice that there is a subarray with 0
//    sum when :
//    1) Either a prefix sum repeats or
//    2) Or prefix sum becomes 0.
//    we store sum of each prefix in the hashset
    static boolean findsum(int arr[], int n) {
        int sum = 0;
        Set<Integer> a = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (a.contains(sum) || sum == 0) {
                return true;
            } else {
                a.add(sum);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, -3, 1, 6 };
//        int arr[] = { 4, 2, 0, 1, 6 };
//        int arr[] = { 4, 2, 1, 6 };
        int n = arr.length;
        System.out.println(findsum(arr, n));

    }

}
