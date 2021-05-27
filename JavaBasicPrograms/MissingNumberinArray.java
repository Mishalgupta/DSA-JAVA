package JavaBasicPrograms;

import java.util.*;

public class MissingNumberinArray {
    public static int missingNumber(int[] nums) {
        // Method-1 sorting
        // Time O(Nlogn)
        // space O(1)
//        Arrays.sort(nums);
//
//        // Ensure that n is at the last index
//        if (nums[nums.length - 1] != nums.length) {
//            return nums.length;
//        }
//        // Ensure that 0 is at the first index
//        else if (nums[0] != 0) {
//            return 0;
//        }
//
//        // If we get here, then the missing number is on the range (0, n)
//        for (int i = 1; i < nums.length; i++) {
//            int expectedNum = nums[i - 1] + 1;
//            if (nums[i] != expectedNum) {
//                return expectedNum;
//            }
//        }
//
//        // Array was not missing any numbers
//        return -1;
//    }

        // Method-2 Hashing method
        // Time O(n)
        // Space O(n)
        Set<Integer> numSet = new HashSet<Integer>();
        for (int num : nums)
            numSet.add(num);

        int expectedNumCount = nums.length + 1;
        System.out.println(expectedNumCount);
        for (int number = 0; number < expectedNumCount; number++) {
            if (!numSet.contains(number)) {
                return number;
            }
        }
        return -1;
    }

    // Method-3 Gauss method
    // Time O(n)
    // Space O(1)
//        We can compute the sum of nums in linear time, and by Gauss' formula, we can compute the sum of the first n natural numbers
//        in constant time. Therefore, the number that is missing is simply the result of Gauss' formula minus the sum of nums,
//        as nums consists of the first nn natural numbers minus some number.

//        int sum = nums.length * (nums.length + 1) / 2;
//        int arraysum = 0;
//        for (int i : nums) {
//            arraysum = arraysum + i;
//        }
//        return sum - arraysum;
//    }

    public static void main(String[] args) {
        int nums[] = { 3, 0, 1 };
        System.out.println(missingNumber(nums));
    }

}
