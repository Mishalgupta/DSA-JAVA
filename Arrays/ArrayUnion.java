package Arrays;

//Java program to find union of two
//sorted arrays (Handling Duplicates)
class ArrayUnion {

//    Time: o(n+m) for sorted array
//    Time Complexity : O((n+m)log(n+m)) for unsorted array
//    Auxilliary Space : O(n+m)
    static void UnionArray(int arr1[], int arr2[]) {
        // Taking max element present in either array
        int m = arr1[arr1.length - 1];
        int n = arr2[arr2.length - 1];

        int ans = 0;

        if (m > n) {
            ans = m;
        } else {
            ans = n;
        }
        // Finding elements from 1st array
        // (non duplicates only). Using
        // another array for storing union
        // elements of both arrays
        // Assuming max element present
        // in array is not more than 10^7
        int newtable[] = new int[ans + 1];

        // First element is always
        // present in final answer
        System.out.print(arr1[0] + " ");

        // Incrementing the First element's count
        // in it's corresponding index in new table
        newtable[arr1[0]]++;

        // Starting traversing the first
        // array from 1st index till last
        for (int i = 1; i < arr1.length; i++) // o(n-1) times
        {
            // Checking whether current element
            // is not equal to it's previous element
            if (arr1[i] != arr1[i - 1]) {
                System.out.print(arr1[i] + " ");
                newtable[arr1[i]]++;
            }
        }

        // Finding only non common elements from 2nd array
        for (int j = 0; j < arr2.length; j++) // o(m) times
        {
            // By checking whether it's already
            // present in new table or not
            if (newtable[arr2[j]] == 0) {
                System.out.print(arr2[j] + " ");
                newtable[arr2[j]]++;
            }
        }
    }

    public static void main(String args[]) {
        int arr1[] = { 11, 2, 2, 2, 3, 5, 6, 7, 8, 9 };
        int arr2[] = { 11, 2, 3, 4, 5, 5, 6, 7, 10, 12, 13, 14 };

        UnionArray(arr1, arr2);
    }

    // O(n+m) but this is not for the duplicates
    // Java program to find union of
    // two sorted arrays
//     Function prints union of arr1[] and arr2[] , m is the number of elements in
//     arr1[] n is the number of elements in arr2[]

//    static int printUnion(int arr1[], int arr2[], int m, int n) {
//        int i = 0, j = 0;
//        while (i < m && j < n) {
//            if (arr1[i] < arr2[j])
//                System.out.print(arr1[i++] + " ");
//            else if (arr2[j] < arr1[i])
//                System.out.print(arr2[j++] + " ");
//            else {
//                System.out.print(arr2[j++] + " ");
//                i++;
//            }
//        }
//
//          Print remaining elements of the larger array if one of i or j crosses the above while loop
//        while (i < m)
//            System.out.print(arr1[i++] + " ");
//        while (j < n)
//            System.out.print(arr2[j++] + " ");
//
//        return 0;
//    }
//
//    public static void main(String args[]) {
//        int arr1[] = { 1, 2, 4, 5, 6 };
//        int arr2[] = { 2, 3, 5, 7 };
//        int m = arr1.length;
//        int n = arr2.length;
//        printUnion(arr1, arr2, m, n);
//    }
}
