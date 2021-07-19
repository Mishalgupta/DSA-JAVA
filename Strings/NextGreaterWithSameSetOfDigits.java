package Strings;

public class NextGreaterWithSameSetOfDigits {
// Time: O(n) => n+n+n=3n=>n
// since we are doing two times traversal & one reversal of 3n
// Space: O(1)

    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void reverse(int a[], int i, int j) {
        while (i < j) {
            swap(a, i++, j--);
        }
    }

    public static void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int i = nums.length - 2;
        // finding break point
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        // again traverse from last and check which is just greater than i
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // swap i with j index
            swap(nums, i, j);
        }
        // reverse the all elements just after the i
        reverse(nums, i + 1, nums.length - 1);
    }

    static void print(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        nextPermutation(nums);
        System.out.println("Next greater permutation is: ");
        print(nums);
    }

}
