package Searching_Sorting;

public class PainterPartitionProblem {
//            Expected Time Complexity: O(n log m) , m = sum of all boards' length
//            Expected Auxiliary Space: O(1)
    static long minTime(int[] a, int n, int k) {
        long min = Integer.MIN_VALUE;
        long max = 0;
        for (int i = 0; i < n; i++) {
            min = Math.max(min, a[i]);
            max = max + a[i];
        }
        if (n < k) {
            long time = (long) min;
            return time;
        }
//  ......................
        long res = -1;
        while (min <= max) {
            long mid = min + (max - min) / 2;
            if (isFeasible(a, n, k, mid)) {
                res = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return res;
    }

    static boolean isFeasible(int a[], int n, long k, long res) {
        int painter = 1;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
            if (sum > res) {
                painter++;
                sum = a[i];
            }
        }
        if (painter > k) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        int arr[] = { 5, 10, 30, 20, 15 };
//        int k = 3;
        int arr[] = { 10, 20, 30, 40 };
        int k = 2;
        int n = arr.length;
        System.out.println("Min. time req.: " + minTime(arr, n, k));
    }

}
