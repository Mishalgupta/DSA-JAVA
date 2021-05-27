package Searching_Sorting;
//COPY MAI LIKHA HAI LOGIC 

//Given the array nums after the rotation and an integer target, return the index of target if it is in nums,
//or -1 if it is not in nums.
public class RotateSortedArray {
//     O(log n) runtime complexity.
//     O(1) space complexity
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + (high - low) / 2);
            if (target == nums[mid]) {
                return mid;
            } else if (target == nums[low]) {
                return low;
            } else if (target == nums[high]) {
                return high;
            } else if (nums[mid] >= nums[low]) {
                if (target <= nums[mid] && nums[low] <= target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] <= nums[low]) {
                if (target >= nums[mid] && nums[high] >= target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(target + " Lies in " + search(nums, target) + " index");

    }

}
