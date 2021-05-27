package Searching_Sorting;

public class EkoSpoj {

    // Function to find minimum number of pages.
    public static int findHeight(int[] a, int n, int m) {
        // Method- Binary search
//        Expected Time Complexity: O(NlogN)
//        Expected Auxilliary Space: O(1)

        int start = 0;
        int end = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            end = Math.max(start, a[i]);
            end = end + a[i];
        }
//   ......................
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isFeasible(a, n, m, mid)) {
                res = mid;
                // if we need min. then we used to set upper bound ,
                // but here we need max. so we'll set lower bound
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }

    static boolean isFeasible(int a[], int n, int m, int res) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > res) {
                sum = sum + (a[i] - res);
            }
        }
        if (sum >= m) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // heights of trees
//      int a[] = { 20, 15, 10, 17 };
        int a[] = { 4, 42, 40, 26, 46 };
        // Mirko's required wood amount
//      int m = 7;
        int m = 20;
        int n = a.length;
        System.out.println("maximum integer height is: " + findHeight(a, n, m));
    }

}
