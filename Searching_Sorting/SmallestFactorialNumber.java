package Searching_Sorting;

//We can notice that, the maximum value whose factorial contain n trailing zeroes is 5*n.
//So, to find minimum value whose factorial contains n trailing zeroes, use binary search on range from 0 to 5*n. 
//And, find the smallest number whose factorial contains n trailing zeroes. 
public class SmallestFactorialNumber {
//    Expected Time Complexity: O(log2 N * log5 N).
//    Expected Auxiliary Space: O(1).
    static int findNum(int n) {
        // If n equal to 1, return 5.
        // since 5! = 120.
        if (n == 1) {
            return 5;
        }
        int start = 1, end = 5 * n, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (zeroCount(mid, n)) {
                ans = mid;
                // if zeros is feasible then we try to find min. no by reducing the high=mid-1.
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static boolean zeroCount(int k, int n) {
        int count = 0, f = 5;
        while (f <= k) {
            k = k / f;
            count = count + k;
        }
        if (count >= n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
//        int n = 1;
        int n = 6;
        System.out.println("Smallest Factorial no: " + findNum(n));
    }

}
