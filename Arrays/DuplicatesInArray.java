package Arrays;

import java.util.*;

public class DuplicatesInArray {
    // Method-1 using sorting n(log(n))
    public static int findDuplicate(int[] nums) {
//        int n = nums.length;
//        for (int i = 1; i < n; i++) // n-1 Time
//        {
//            Arrays.sort(nums); // n(log(n)) time
//            if (nums[i] == nums[i - 1]) {
//                return nums[i];
//            }
//        }
//        return -1;

        // Method-2 O(n) Time complexity
//        using set(we will store array in the new array with comparing)
//        In order to achieve linear time complexity,
//        we need to be able to insert elements into a data structure (and look them up) in constant time. 
//        A Set satisfies these constraints nicely, so we iterate over the array and insert each element into seen. 
//        Before inserting it, we check whether it is already there.
//        If it is, then we found our duplicate, so we return it.

        // This will take extra linear space O(n) to store array
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) // O(n)
        {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1, 0 };
        System.out.print("Duplicate no. is: " + findDuplicate(nums));
    }

}
