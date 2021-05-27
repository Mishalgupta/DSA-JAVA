package Searching_Sorting;

import java.util.*;

//Given an array Arr[] of size L and a number N, you need to write a program to find if there exists a pair of elements 
//in the array whose difference is N.
public class PairGivenDifference {
//    Expected Time Complexity: O(L* Log(L)).
//    Expected Auxiliary Space: O(1).
    public static boolean findPair(int arr[], int size, int n) {
        // Method-1 binary search
        Arrays.sort(arr);
        for (int i = 0; i < size; i++) {
            // to avoid printing duplicates (skip adjacent duplicates)
            while (i < size - 1 && arr[i] == arr[i + 1]) {
                i++;
            }

            // perform a binary search(methods of Array Class) on element `A[i]-diff`
            if (Arrays.binarySearch(arr, arr[i] - n) >= 0) {
                return true;
            }
        }
        return false;

        // Method-2 O(nlogn) approx Time complexity
//        Arrays.sort(arr);
//        int i = 0, j = 1;
//        while (i < size && j < size) {
//            if (arr[j] - arr[i] < n) {
//                j++;
//            } else if (arr[j] - arr[i] > n) {
//                i++;
//            } else if (i != j && arr[j] - arr[i] == n) {
//                return true;
//            }
//        }
//        return false;

        // Method-3 Brute force O(n^2)
//        for (int i = 0; i < size; i++) {
//            int y = arr[i] + n;
//            for (int j = 0; j < size; j++) {
//                if (arr[j] == y) {
//                    return true;
//                }
//            }
//        }
//        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 20, 3, 2, 5, 80 };
        int N = 78;
        int size = arr.length;
        System.out.println(findPair(arr, size, N));
    }

}
