package Arrays;

import java.util.*;
//Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. 
//Task is to check whether a2[] is a subset of a1[] or not. 
//Both the arrays can be sorted or unsorted. It may be assumed that elements in both array are distinct.

public class ArraysubsetOfanotherArray {
    // this method can also used in Intersaction of two arrays(sorted or unsorted)
//    Expected Time Complexity: O(n)
//    Expected Auxiliary Space: O(n)
    public static String isSubset(long a1[], long a2[], long n, long m) {
        // String ans="No";
        int n1 = (int) n;
        int m1 = (int) m;
        Set<Long> hash = new HashSet<Long>();
        for (int i = 0; i < n1; i++) {
            hash.add(a1[i]);
        }
        for (int i = 0; i < m1; i++) {
            if (!hash.contains(a2[i])) {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        long a1[] = { 11, 1, 13, 21, 3, 7 };
//        long a2[] = { 11, 3, 7, 1};
        long a2[] = { 11, 3, 7, 1, 9 };
        long n = a1.length;
        long m = a2.length;
        System.out.println(isSubset(a1, a2, n, m));
    }

}
