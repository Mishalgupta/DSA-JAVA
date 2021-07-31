package Searching_Sorting;

public class Insertion_sort {

    // Time: O(N"2)
    // space: O(1)
    static void insert(int arr[], int i) {
        // if prev element is less than current element
        // than swap them till i>0
        while (i > 0 && arr[i - 1] > arr[i]) {
            int temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;
            i--;
        }
    }

    // Function to sort the array using insertion sort algorithm.
    public static void insertionSort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            insert(arr, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 8, -3, 6, 4, 1, 2 };
        int n = arr.length;
        insertionSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
