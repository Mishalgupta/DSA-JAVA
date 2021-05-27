package Arrays;

public class SortArrayWithoutSortingAlgo {
    static void sortArray(int a[], int n) {
// Method-1
//        Time Complexity: O(n)
//        Only one traversal of the array is needed.
//        Space Complexity: O(1). 
//        No extra space is required.

//        int low = 0, mid = 0, high = n - 1, temp;
//        while (mid <= high) {
//            switch (a[mid]) {
//            case 0: {
//                temp = a[low];
//                a[low] = a[mid];
//                a[mid] = temp;
//                mid++;
//                low++;
//                break;
//            }
//            case 1:
//                mid++;
//                break;
//            case 2: {
//                temp = a[mid];
//                a[mid] = a[high];
//                a[high] = temp;
//                high--;
//                break;
//            }
//            }
//        }
//    }

// Method-2
//        Time Complexity: O(n). 
//        Only two traversals of the array is needed.
//        Space Complexity: O(1). 
//        As no extra space is required.
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < n; i++) {
            switch (a[i]) {
            case 0: {
                c0++;
                break;
            }
            case 1:
                c1++;
                break;
            case 2: {
                c2++;
                break;
            }
            }
        }
        int i = 0;
        while (c0 > 0) {
            a[i] = 0;
            i++;
            --c0;
        }
        while (c1 > 0) {
            a[i] = 1;
            i++;
            --c1;
        }
        while (c2 > 0) {
            a[i] = 2;
            i++;
            --c2;
        }
    }

    public static void main(String[] args) {
        int a[] = { 0, 0, 1, 2, 1, 0, 1, 2 };
        int n = a.length;
        sortArray(a, n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
