package Arrays;

import java.util.*;

//Given an array A of size n and an integer X.
//Find if there's a triplet in the array which sums up to the given integer X.
public class TriplateSumArray {
//    Expected Time Complexity: O(n2)
//    Expected Auxiliary Space: O(1)
    // Method - Two Pointer approach
    public static int find3Numbers(int A[], int n, int X) {
        // sort the array
        Arrays.sort(A);
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                if (A[j] + A[i] + A[k] == X) {
                    return 1;
                } else if (A[j] + A[i] + A[k] < X) {
                    j++;
                } else if (A[j] + A[i] + A[k] > X) {
                    k--;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
//        int A[] = { 1, 4, 45, 6, 10, 8 }; // X=13
        int A[] = { 1, 2, 4, 3, 6 }; // X=10
        int n = A.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X");
        int X = sc.nextInt();
        System.out.println("Triplte is exist: " + find3Numbers(A, n, X));
        sc.close();
    }

}