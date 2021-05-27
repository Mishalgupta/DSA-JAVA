package Arrays;

public class ArrangeNegativeOneSide {
//    public static void negative(int arr[], int n) {
//        int temp = 0;
    // o(n^2) time complexity
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[j + 1] < arr[j]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//
//            }
//        }

    // o(n) time complexity (quick sort partition process)
    // Auxiliary Space: O(1)
//        int j = 0, temp;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] < 0) {
//                if (i != j) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//                j++;
//            }
//        }

//    }

//    public static void printarray(int arr[], int n) {
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }

    // using two pointers(two variables)
//    Time Complexity: O(N)
//    Auxiliary Space: O(1)
    static void negative(int arr[], int left, int right) {
        int temp;
        // iterating loop from left to right
        while (left <= right) {

            // Condition to check if the left
            // and the right elements are
            // negative
            if (arr[left] < 0 && arr[right] < 0) {
                left++;
            }
            // Condition to check if the left
            // pointer element is positive and
            // the right pointer element is negative
            else if (arr[left] > 0 && arr[right] < 0) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            // Condition to check if both the
            // elements are positive
            else if (arr[left] > 0 && arr[right] > 0) {
                right--;
            } else {
                left++;
                right--;
            }

        }
    }

    public static void printarray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
//        int arr[] = { 1, -2, 3, -4, 1 };
        int arr[] = { -1, 2, 3, -4, -2 };
        int n = arr.length;
//        negative(arr, n);
//        printarray(arr, n);
        negative(arr, 0, n - 1);
        printarray(arr, n);
    }

}