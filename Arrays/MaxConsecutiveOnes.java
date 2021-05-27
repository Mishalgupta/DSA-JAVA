package Arrays;

//Given a binary array nums, return the maximum number of consecutive 1's in the array.
public class MaxConsecutiveOnes {
//    Time complexity O(n)
//    Space Complexity O(1)
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else if (nums[i] == 0) {
                count = 0;
            }
            max = Math.max(count, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 1, 1, 1 };
        System.out.println(findMaxConsecutiveOnes(nums));
    }

}
