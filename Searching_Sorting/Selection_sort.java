package Searching_Sorting;

public class Selection_sort {
    // Time: O(n^2)
    // Space: O(1)
    static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            // updating min element on every iteration till end
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // after that swap that min. element with current element
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 8, -3, 6, 4, 1, 2 };
        int n = arr.length;
        selectionSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
