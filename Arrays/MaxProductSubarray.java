package Arrays;

public class MaxProductSubarray {
    static long maxProduct(int[] arr, int n) {
//        Given an array Arr that contains N integers (may be positive, negative or zero).
//        Find the product of the maximum product subarray.

        // Expected Time Complexity: O(n). linear time
        // Expected Auxiliary Space: O(1). constant space
//      Variables to store maximum and minimum product till n-1th index.
        long minVal = arr[0];
        long maxVal = arr[0];
        long maxProduct = arr[0];

        for (int i = 1; i < n; i++) // n times complexity
        {
            // When multiplied by -ve number,
            // maxVal becomes minVal and minVal becomes maxVal.
            if (arr[i] < 0) {
                long temp = maxVal;
                maxVal = minVal;
                minVal = temp;
            }
            // maxVal and minVal stores the
            // product of subarray ending at arr[i].
            maxVal = Math.max(arr[i], maxVal * arr[i]);
            minVal = Math.min(arr[i], minVal * arr[i]);

            // Max Product of array.
            maxProduct = Math.max(maxProduct, maxVal);
        }
        // Return maximum product found in array.
        return maxProduct;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -2, -9, 0, 99, 2 };
//        int arr[] = { 0, 3, -5, -2, 8, -7, -6, -2, -3, -9 };
        int n = arr.length;
        System.out.println(maxProduct(arr, n));
    }

}