package Arrays;

import java.util.*;

//Given an array of N integers, and an integer K, 
//find the number of pairs of elements in the array whose sum is equal to K.
public class CountPairWithGivenSum {
    static int getPairsCount(int[] arr, int n, int k) {
//        Expected Time Complexity: O(N)
//        Expected Auxiliary Space: O(N)
        // Method-1 Two Pointer
//        int i = 0;
//        int j = n - 1;
//        int count = 0;
//        while (i < n && j >= 0) {
//            if (i != j) {
//                if ((arr[i] + arr[j]) == k) {
//                    count++;
//                }
//                System.out.println(j--);
//            } else {
//                j = n - 1;
//                i++;
//            }
//        }
//        return count;
//    }

        // Method-2 using hashmap
        HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (!h1.containsKey(arr[i])) {
                // initializing value to 0, if key not found
                h1.put(arr[i], 0);
            }
            h1.put(arr[i], h1.get(arr[i]) + 1);
        }

        int count = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            if (h1.get(arr[i] - k) == arr[i]) {
                count++;
            } else if (h1.get(arr[i] - k) != 0) {
                sum = sum + h1.get(arr[i] - k);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 7, 1 };
//        int arr[] = { 1, 1, 1, 1 };
        int n = arr.length;
        int k = 6;
//        int k = 2;
        System.out.println("count is: " + getPairsCount(arr, n, k));
    }

}
