package Heap;

public class HeapSort {
//    Expected Time Complexity: O(N * Log(N)).
//    Expected Auxiliary Space: O(1).
    
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    static void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // Function to build a Max-Heap from the Array
    static void buildHeap(int arr[], int n) {
        // Index of last non-leaf node
        int startIdx = (n / 2) - 1;

        // Perform reverse level order traversal
        // from last non-leaf node and heapify
        // each node
        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    static void heapsort(int arr[], int n) {
        buildHeap(arr, n);
        for (int i = n - 1; i > 0; i--) {
            int swap = arr[0];
            arr[0] = arr[i];
            arr[i] = swap;
            heapify(arr, i, 0);
        }
    }

    // A utility function to print the array
    // representation of Heap
    static void printHeap(int arr[], int n) {
        System.out.println("Array representation of Heap is:");

        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
        int n = arr.length;
        heapsort(arr, n);
        System.out.println("Sorted array: ");
        printHeap(arr, n);
    }

}
