package Searching_Sorting;

import java.util.*;

public class MergeWithoutExtraSpace {

//Expected Time Complexity: O((n+m)*log(n+m))
//Expected Auxiliary Space: O(1)
    public static void merge(int arr1[], int arr2[], int n, int m) {
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
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7 };
        int arr2[] = { 0, 2, 6, 8, 9 };
        int n = arr1.length;
        int m = arr2.length;
        merge(arr1, arr2, n, m);
        StringBuffer sg = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sg.append(arr1[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            sg.append(arr2[i] + " ");
        }
        System.out.println("Merged array is: " + sg);
    }

}
