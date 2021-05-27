package Searching_Sorting;

public class AllocateMinPages {
    // Function to find minimum number of pages.
    public static int findPages(int[] a, int n, int m) {
        // Method- Binary search
// Expected Time Complexity: O(NlogN)
//        Expected Auxilliary Space: O(1)

        // if no. of students are greater than books then return -1
        if (n < m) {
            return -1;
        }
        int start = Integer.MIN_VALUE;
        int end = 0;
        for (int i = 0; i < n; i++) {
            start = Math.max(start, a[i]);
            end = end + a[i];
        }
//        System.out.println("min pages by 1 student : " + start);
//        System.out.println("max pages by 1 student : " + end);
//   ......................
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isFeasible(a, n, m, mid)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    static boolean isFeasible(int a[], int n, int m, int res) {
        int student = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + a[i] > res) {
                student++;
                sum = a[i];
            } else {
                sum = sum + a[i];
            }
        }
        return student <= m;
    }

    public static void main(String[] args) {
//        int a[] = { 12, 34, 67, 90 };
//        int a[] = { 15, 17, 20 };
//        int m = 2;
//        int a[] = { 250, 74, 159, 181, 23, 45, 129, 174 };
//        int m = 6;
        int a[] = { 51, 151, 227, 163, 55 };
        int m = 3;
        int n = a.length;
        System.out.println("Min. Pages allocate is: " + findPages(a, n, m));
    }

}
