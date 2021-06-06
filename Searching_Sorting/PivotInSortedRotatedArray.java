package Searching_Sorting;
//Suppose we have a sorted array, and now we rotate it N times, find the pivot element. 
//The pivot element would be the largest element. Also, can you calculate N?
public class PivotInSortedRotatedArray {
    // Method-Binary Search
//    Time O(log N)
//    Space O(1)
//    Can you think of a binary search based solution where you keep comparing the middle element with the last element?
    static int pivot(int a[], int n) {
//        The pivot element is basically, the largest element in an array. For a sorted and rotated array, it might be somewhere in between.
        int low = 0, high = n - 1, mid = 0;
        while (low < high) {
            mid = low + (high - low) / 2;
//            If the mid element is greater than the last element, then the pivot should be in the second half of the array.
            if (a[mid] > a[high]) {
                low = mid + 1;
            } 
//            If the mid element is less than the last element, then the pivot should be in the first half of the range.
            else if (a[mid] < a[high]) {
                high = mid;
            }
        }
        return a[low];
    }

    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40 };
        int n = a.length;
        System.out.println("pivot element is: " + pivot(a, n));
    }
}
