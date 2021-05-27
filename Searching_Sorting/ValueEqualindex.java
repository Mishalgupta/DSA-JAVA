package Searching_Sorting;

import java.util.*;

//Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value.
public class ValueEqualindex {
//    Expected Time Complexity: O(N)
//    Expected Auxiliary Space: O(1)
    static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == i + 1) {
                arr1.add(i + 1);
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
//        int arr[] = { 15, 2, 45, 12, 7, 6 };
        int arr[] = { 1, 1 };// since duplicates are not allowed in the list interface.
        int n = arr.length;
        System.out.println("Value Equal To index: " + valueEqualToIndex(arr, n));
    }

}
