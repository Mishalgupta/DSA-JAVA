package Searching_Sorting;

import java.util.*;

//Given two sorted arrays arr1 and arr2 of size M and N respectively and an element K. 
//The task is to find the element that would be at the k’th position of the final sorted array.
public class KthElementTwoSortedArray {
    public static long kthElement(int arr1[], int arr2[], int n, int m, int k_req) {
        // Method 1 using sorting the arrays
        // O(log(n+m))
        int i = n - 1, j = 0;
        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        long result = 0;
        if (n >= k_req) {
            result = arr1[k_req - 1];
        } else {
            result = arr2[k_req - n - 1];
        }
        return result;

        // Method-2 Brute force with extra space
//        int[] sorted1 = new int[m + n];
//        int i = 0, j = 0, k = 0;
//        while (i < n && j < m) {
//            if (arr1[i] < arr2[j])
//                sorted1[k++] = arr1[i++];
//            else
//                sorted1[k++] = arr2[j++];
//        }
//        while (i < n) {
//            sorted1[k] = arr1[i];
//            k++;
//            i++;
//        }
//        while (j < m) {
//            sorted1[k] = arr2[j];
//            k++;
//            j++;
//        }
//        return sorted1[k_req - 1];

        // Method-3 Brute force without extra space
//Time Complexity: O(k) 
//Auxiliary Space: O(1)

//        int k = 0, i = 0, j = 0;
//
//        // Keep taking smaller of the current
//        // elements of two sorted arrays and
//        // keep incrementing k
//        while (i < m && j < n) {
//            if (arr1[i] < arr2[j]) {
//                k++;
//                if (k == k_req)
//                    return arr1[i];
//                i++;
//            } else {
//                k++;
//                if (k == k_req)
//                    return arr2[j];
//                j++;
//            }
//        }
//        // If array B[] is completely traversed
//        while (i < m) {
//            k++;
//            if (k == k_req)
//                return arr1[i];
//            i++;
//        }
//        // If array A[] is completely traversed
//        while (j < n) {
//            k++;
//            if (k == k_req)
//                return arr2[j];
//            j++;
//        }
//        return -1;
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 3, 6, 7, 9 };
        int arr2[] = { 1, 4, 8, 10 };
        int k = 5;
        int n = arr1.length;
        int m = arr2.length;
        System.out.println(kthElement(arr1, arr2, n, m, k));

    }

}
