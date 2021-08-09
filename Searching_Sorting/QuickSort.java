package Searching_Sorting;

public class QuickSort {
//Expected Time Complexity: O(N*logN)
//Expected Auxiliary Space: O(1)
    static void quickSort(int arr[], int l, int h) {
        if (l >= h) {
            return;
        } else {
            int pivot = partition(arr, l, h);
            quickSort(arr, l, pivot - 1);
            quickSort(arr, pivot + 1, h);
        }
    }

    static int partition(int arr[], int l, int h) {
        int pivot = arr[l];
        int i = l;
        int j = h;
        while (i < j) {
            while (arr[i] <= pivot && i < j) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 3, 9, 7 };
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
