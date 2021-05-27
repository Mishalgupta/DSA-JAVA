package Arrays;

import java.util.Scanner;

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
            while (sum >= target) {
                result = Math.min(result, i + 1 - start);
                sum = sum - nums[start];
                start++;
            }
        }
        return (result != Integer.MAX_VALUE) ? result : 0;

    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 1, 2, 4, 3 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value:"); // 7 then 2 length subarray is answer
        int target = sc.nextInt();
        System.out.println(minSubArrayLen(target, nums));
        sc.close();

    }

}
