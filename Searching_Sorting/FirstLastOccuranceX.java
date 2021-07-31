package Searching_Sorting;

import java.util.*;

//Given a sorted array arr containing n elements with possibly duplicate elements,
//the task is to find indexes of first and last occurrences of an element x in the given array.
public class FirstLastOccuranceX {
//    Expected Time Complexity: O(logN)
//    Expected Auxiliary Space: O(1).
    static ArrayList<Long> find(long arr[], int n, int x) {
        ArrayList<Long> arr1 = new ArrayList<Long>();
        // Method Binary search O(logN)
        int s = -1, l = -1;
        // checking for the first index
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + (high - low) / 2);
            if (x == arr[mid]) {
                s = mid;
                // array contain duplicates value & we need only the first occourance.
                high = mid - 1;
            } else if (x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // now checking for the last index
        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = (low + (high - low) / 2);
            if (x == arr[mid]) {
                // array contain duplicates value & we need only the last occourance.
                l = mid;
                low = mid + 1;
            } else if (x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        arr1.add(0, (long) s);
        arr1.add(1, (long) l);
        return arr1;
    }

    public static void main(String[] args) {
        long arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int x = 5;
        int n = arr.length;
        System.out.println("First & Last Occourance of " + x + " is: " + find(arr, n, x));
    }

}
