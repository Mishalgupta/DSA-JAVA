package Searching_Sorting;

import java.util.*;

//Given an array of n distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.
public class MinSwapToSort {

//Expected Time Complexity: O(nlogn)
//Expected Auxiliary Space: O(n)
    public static int minSwaps(int nums[]) {
        int count = 0;
        int n = nums.length;
        // it copies the given array to another array
        // copyOfRange(original array,starting index , last index)
        int[] temp = Arrays.copyOfRange(nums, 0, n);
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>(); // O(n)
        Arrays.sort(temp); // O(Nlogn)
        for (int i = 0; i < n; i++) {
            h.put(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != temp[i]) {
                count++;
                int init = nums[i];
                swap(nums, i, h.get(temp[i]));
                h.put(init, h.get(temp[i]));
                h.put(temp[i], i);
            }
        }
        return count;
    }

    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 8, 5, 4 };
        System.out.println("Min. Swap is: " + minSwaps(nums));
    }

}
