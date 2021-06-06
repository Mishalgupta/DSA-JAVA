package Arrays;

import java.util.*;

//Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
//Note: can you take care of the duplicates without using any additional Data Structure?
public class CommonElementsThreeSortedArray {
//    Expected Time Complexity: O(n1 + n2 + n3)
//    Expected Auxiliary Space: O(n1 + n2 + n3)
    static ArrayList<Integer> common(int A[], int B[], int C[], int n1, int n2, int n3) {
        // using DATA STRUCTURES
        Set<Integer> a1 = new HashSet<Integer>();
        Set<Integer> a2 = new HashSet<Integer>();
        Set<Integer> a3 = new HashSet<Integer>();
        for (int i : A) {
            a1.add(i);
        }
        for (int j : B) {
            a2.add(j);
        }
        for (int k : C) {
            a3.add(k);
        }
        a1.retainAll(a2);
        // System.out.println(a1);
        a1.retainAll(a3);
        // System.out.println(a1);
//        int n = a1.size();
        // System.out.println(n);
        ArrayList<Integer> ans = new ArrayList<Integer>(a1.size());
        for (int i : a1) {
            ans.add(i);
//            Collections.sort(ans); // arrays are already sorted
        }
        return (ans);
    }

//     Method-2 Can you extend the idea of the 2-pointer approach to something like a 3 pointer approach?
//    Maintain 3 pointers, one for each array and traverse till any of them reaches the end of the array.
//        ArrayList<Integer> arr = new ArrayList<>();
//        int i = 0, j = 0, k = 0;
//        // Iterate through three arrays while all arrays have elements
//        while (i < n1 && j < n2 && k < n3) {
//            // If x = y and y = z, print any of them and move ahead
//            // in all arrays
//            if (A[i] == B[j] && C[j] == C[k]) {
//                arr.add(A[i]);
//                int temp = A[i];
//                while (i < n1 && A[i] == temp) {
//                    i++;
//                }
//                while (k < n2 && A[i] == temp) {
//                    j++;
//                }
//                while (k < n3 && A[i] == temp) {
//                    k++;
//                }
//
//            }
//            // x < y
//            else if (A[i] < B[j]) {
//                i++;
//            }
//            // y < z
//            else if (B[j] < C[k]) {
//                j++;
//            }
//            // We reach here when x > y and z < y, i.e., z is smallest
//            else {
//                k++;
//            }
//            return arr;
//        }
//    }

    public static void main(String[] args) {
        int A[] = { 1, 1, 2, 2, 3, 3, 5 };
        int B[] = { 1, 2, 3 };
        int C[] = { 1, 2, 3, 4, 5 };
        int n1 = A.length;
        int n2 = B.length;
        int n3 = C.length;
        ArrayList<Integer> ar = common(A, B, C, n1, n2, n3);
        for (int i : ar) {
            System.out.print(i);
        }
    }

}
