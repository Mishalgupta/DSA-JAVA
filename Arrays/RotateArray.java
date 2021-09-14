package Arrays;

public class RotateArray {
//        // O(n) time complexity
//        // O(1) space complexity
    static void rotateLeft(int arr[], int d, int n) {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }

    static void leftRotatebyOne(int arr[], int n) {
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

//        int i, temp;
//        temp = arr[0];
//        for (i = 0; i < n - 1; i++) {
//            arr[i] = arr[i + 1];
//        }
//        arr[i] = temp;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5};
        int n = a.length;
        int d = 2;
        rotateLeft(a, d, n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}