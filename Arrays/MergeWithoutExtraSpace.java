package Arrays;

//Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order.
//Merge the two arrays into one sorted array in non-decreasing order without using any extra space.

public class MergeWithoutExtraSpace {
    // Method-1 using GAP method
//    Expected Time Complexity: O((n+m)*log(n+m))
//    Expected Auxiliary Space: O(1)
    public static int Gap(int gap) {
        if (gap <= 1) {
            return 0;
        } else {
            return (gap / 2) + (gap % 2);
        }
    }

    public static void merge(int arr1[], int arr2[], int n, int m) {

        int gap = n + m;
        int temp, i = 0, j = 0;

        // gap will divide by two on every iteration.
        for (gap = Gap(gap); gap > 0; gap = Gap(gap)) // log(m+n) times as we divide gap at every iteration.
        {
            for (i = 0; i + gap < n; i++) // n times traversing
            {
                if (arr1[i] > arr1[i + gap]) {
                    temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }
            }
            // if gap pointer goes outside arr1 then we enter into arr2.
            for (j = (gap > n) ? gap - n : 0; i < n && j < m; i++, j++) {
                if (arr1[i] > arr2[j]) {
                    temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }

            if (j < m) {
                for (j = 0; j + gap < m; j++) // m times
                {
                    if (arr2[j] > arr2[j + gap]) {
                        temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = temp;
                    }
                }
            }
        }
    }

    // Method-2
//  Expected Time Complexity: O((n+m)*log(n+m))
//  Expected Auxiliary Space: O(1)
//        int i = n - 1, j = 0;
//        while (i >= 0 && j < m) {
//            if (arr1[i] > arr2[j]) {
//                int temp = arr1[i];
//                arr1[i] = arr2[j];
//                arr2[j] = temp;
//            }
//            i--;
//            j++;
//        }
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7 };
        int arr2[] = { 0, 2, 6, 8, 9 };
        int n = arr1.length;
        int m = arr2.length;
        merge(arr1, arr2, n, m);
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < n; i++) {
            str.append(arr1[i] + " ");
        }
        for (int i = 0; i < m; i++) {
            str.append(arr2[i] + " ");
        }
        System.out.println("Merged array: " + str);

    }

}
