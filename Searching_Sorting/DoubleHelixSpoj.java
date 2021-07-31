package Searching_Sorting;

public class DoubleHelixSpoj {
    // Method-2 pointer approach
// Time = O(n+m)
// Space = O(1)
    static int largeSum(int a[], int b[], int n, int m) {
        int sum1 = 0, sum2 = 0;
        int i = 0, j = 0;
        int max = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                sum1 += a[i];
                i++;
            } else if (a[i] > b[j]) {
                sum2 += b[j];
                j++;
            } else {
                // can add either a[i] or a[j] as both are same
                max = max + Math.max(sum1, sum2) + a[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
        // if any of i or j finish so add remaining elements in the sum
        if (i > n) {
            while (j < m) {
                sum2 = sum2 + b[j];
                j++;
            }
        } else {
            while (i < n) {
                sum1 = sum1 + a[i];
                i++;
            }
        }
        max = max + Math.max(sum1, sum2);
        return max;
    }

    public static void main(String[] args) {
//        int a[] = { 3, 5, 7, 9, 20, 25, 30, 40, 55, 56, 57, 60, 62 };
//        int b[] = { 1, 4, 7, 11, 14, 25, 44, 47, 55, 57, 100 };
        int a[] = { -5, 100, 1000, 1005 };
        int b[] = { -12, 1000, 1001 };
        int n = a.length;
        int m = b.length;
        System.out.println("Maximum sum is: " + largeSum(a, b, n, m));

    }

}
