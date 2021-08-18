package Arrays;

public class MaxMinArray {
    static class Pair {
        int min;
        int max;
    }

//    METHOD 1 (Simple Linear Search)
    // if there is only 1 element
    // Time Complexity: O(n)
    // In this method, the total number of comparisons is 1 + 2(n-2) in the worst
    // case and 1 + n – 2 in the best case.
    // In the above implementation, the worst case occurs when elements are sorted
    // in descending order and the best case occurs when elements are sorted in
    // ascending order.

//    static Pair getminmax(int arr[], int n) {
//
//        Pair minmax = new Pair();
//        int i;
    // if only 1 element is there
//        if (n == 1) {
// accessing static class method using minmax
//            minmax.max = arr[0];
//            minmax.min = arr[0];
//            return minmax;
//        }
//
//        // if there is 2 or more than 2 element
//        if (arr[0] > arr[1]) {
//            minmax.max = arr[0];
//            minmax.min = arr[1];
//        } else {
//            minmax.max = arr[1];
//            minmax.min = arr[0];
//        }
//
//        for (i = 2; i < n; i++) // (n-2) times
//        {
//            if (arr[i] > minmax.max) {
//                minmax.max = arr[i];
//            } else {
//                minmax.min = arr[i];
//            }
//        }
//        return minmax; // (1) time
//    }

//    METHOD 2 (Tournament Method): Algorithmic Paradigm: Divide and Conquer 
// Time Complexity: O(n)
// T(n) = 2T(n/2) + 2
//    After solving the above recursion, we get 
//    T(n)  = 3n/2 -2
//    Thus, the approach does 3n/2 -2 comparisons if n is a power of 2.(even size if array)
//    And it does more than 3n/2 -2 comparisons if n is not a power of 2(odd size of array)

    static Pair getminmax(int arr[], int low, int high) {
        Pair minmax = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();
        int mid;

        // if only 1 element
        if (low == high) {
            minmax.min = arr[low];
            minmax.max = arr[high];
            return minmax;
        }

        // if 2 elements are there

        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minmax.max = arr[low];
                minmax.min = arr[high];
            } else {
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            return minmax;
        }

        // if 2 or more than 2 elements are there
        mid = (low + high) / 2; // 1 times
        mml = getminmax(arr, low, mid); // T(n/2)
        mmr = getminmax(arr, mid + 1, high); // T(n/2)

        // for max.
        if (mml.max > mmr.max) {
            minmax.max = mml.max;
        } else {
            minmax.max = mmr.max;
        }

        // for min.
        if (mml.min < mmr.min) {
            minmax.min = mml.min;
        } else {
            minmax.min = mmr.min;
        }
        return minmax; // 1 times
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
//        int arr[] = { 1, 2 };
        int n = arr.length;
        // passing arguments to the static method
//        Pair minmax = getminmax(arr, n);
        Pair minmax = getminmax(arr, 0, n - 1);
        System.out.println("Max. is: " + minmax.max);
        System.out.println("Min. is: " + minmax.min);
    }

}
