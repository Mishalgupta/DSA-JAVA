package Searching_Sorting;

public class Bubble_sort {
    // Time: O(n^2)
    // Space: O(1)
    public static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean sorted = false;
            // since array is sorted from right so we don't need
            // to check it again as it's already sorted so we take n-1-i
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    sorted = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!sorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 8, -3, 6, 4, 1, 2 };
        int n = arr.length;
        bubbleSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
