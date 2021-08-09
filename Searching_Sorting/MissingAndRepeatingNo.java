package Searching_Sorting;

import java.util.*;

public class MissingAndRepeatingNo {
    // method-1 hashtable
    // Time: O(n)
    // Space: O(n)
//    static int[] findTwoElement(int arr[], int n) {
//        int a[] = new int[n];
//        HashSet<Integer> hs = new HashSet<>();
//        // repeating no.
//        for (int i = 0; i < n; i++) {
//            // if it comes first times add to hashset
//            if (!hs.contains(arr[i])) {
//                hs.add(arr[i]);
//            } else {
//                // this is repeating no. in array 1 to N
//                a[0] = arr[i];
//            }
//        }
//        // missing no. between 1 to N
//        for (int i = 1; i <= n; i++) {
//            // if from 1 to N the element not found then it's missing one.
//            if (!hs.contains(i)) {
//                a[1] = i;
//                break;
//            }
//        }
//        return a;
//    }

    // Method-2
    // Time: O(n)
    // Space: O(n) or O(1)
    static int[] findTwoElement(int arr[], int n) {
        int ans[] = new int[2];
        int freq[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            // repeatative
            if (freq[i] > 1) {
                ans[1] = i;
            }
            // missing
            if (freq[i] == 0) {
                ans[0] = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2 };
        int n = arr.length;
        int res[] = findTwoElement(arr, n);
        System.out.println("Missing no: " + res[0]);
        System.out.println("Repeating no: " + res[1]);
    }

}
