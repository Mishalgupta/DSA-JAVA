package Arrays;

//given an array of integers (A[])  and a number x, find the smallest subarray with sum greater than the given value.
//Note: The answer always exists. It is guaranteed that x doesn't exceed the summation of a[i] (from 1 to N).
public class MinSumSubarray {
//Method -1 (Two Pointer approach)
//    Expected Time Complexity: O(N)
//    Expected Auxiliary Space: O(1)
    public static int minSubArrayLen(int target, int[] nums) {

        int result = Integer.MAX_VALUE;
        int start = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            while (sum > target) {
                result = Math.min(result, i + 1 - start);
                sum = sum - nums[start];
                start++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 4, 45, 6, 0, 19 };
        int target = 51;
//        int nums[] = { 1, 10, 5, 2, 7 };
//        int target = 9;
        System.out.println("Min. subarray length is: " + minSubArrayLen(target, nums));
    }

}
