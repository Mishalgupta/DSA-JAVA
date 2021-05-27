package Searching_Sorting;

//Given an array of integers and another number. Find all the unique quadruple from the given array that sums up to the given number.
import java.util.*;

//Sort the array. Take two elements from the array using two nested loop and take other two elements using two pointer technique.
public class FourSum {
//    Expected Time Complexity: O(N3).
//    Expected Auxiliary Space: O(N2).
    public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int left = j + 1, right = n - 1;
                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == k) {
                        ArrayList<Integer> res = new ArrayList<Integer>();
                        res.add(arr[i]);
                        res.add(arr[j]);
                        res.add(arr[left]);
                        res.add(arr[right]);
                        arr1.add(res);

                        // processing the dupliactes of left
                        while (left < right && arr[left] == res.get(2)) {
                            left++;
                        }
                        // processing the dupliactes of right
                        while (left < right && arr[right] == res.get(3)) {
                            right--;
                        }
                    } else if (sum < k) {
                        left++;
                    } else {
                        right--;
                    }
                }
                while (j + 1 < n - 2 && arr[j] == arr[j + 1]) {
                    j++;
                }
                while (i + 1 < n - 3 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
//        int arr[] = { 0, 0, 2, 1, 1 };
//        int k = 3;
        int arr[] = { 10, 2, 3, 4, 5, 7, 8 };
        int k = 23;
        System.out.println(fourSum(arr, k));

    }

}
