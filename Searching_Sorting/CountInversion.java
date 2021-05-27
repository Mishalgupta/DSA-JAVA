package Searching_Sorting;

import java.util.*;

//Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
public class CountInversion {
    // Method-1 Brute force
//    Expected Time Complexity: O(N^2).
//    Expected Auxiliary Space: O(1).
//    static long inversionCount(long a[], long N) {
//        long count = 0;
//        for (int i = 0; i < N - 1; i++) {
//            for (int j = i + 1; j < N; j++) {
//                if (a[i] > a[j]) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
    // Method-2 Merge sort
//    Expected Time Complexity: O(NLogN).
//    Expected Auxiliary Space: O(N).
    static long inversionCount(long a[], long N) {
        if (N == 1 || N == 0) {
            return 0;
        }
        long b[] = Arrays.copyOfRange(a, 0, (int) N);
        return mergeSort(a, b, 0, N - 1);
    }

    static long mergeSort(long a[], long b[], long l, long r) {
        long count = 0;
        if (l == r) {
            return 0;
        }
        if (l <= r) {
            long m = l + (r - l) / 2;
            count += mergeSort(a, b, l, m);
            count += mergeSort(a, b, m + 1, r);
            count += merge(a, b, l, m, r);
        }
        return count;
    }

    static long merge(long a[], long b[], long l, long m, long r) {
        long count = 0;
        int i = (int) l;
        int j = (int) m + 1;
        int k = (int) l;
        while (i <= m && j <= r) {
            if (a[i] <= a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j++];
                count = count + (m + 1 - i);
            }
            k++;
        }
        if (i > m) {
            while (j <= r) {
                b[k] = a[j];
                k++;
                j++;
            }
        } else {
            while (i <= m) {
                b[k] = a[i];
                k++;
                i++;
            }
        }
        for (i = (int) l; i <= (int) r; i++) {
            a[i] = b[i];
        }
        return count;
    }

    public static void main(String[] args) {
        long arr[] = { 2, 4, 1, 3, 5 };
        long N = arr.length;
        System.out.println("Total Count is: " + inversionCount(arr, N));
    }

}
