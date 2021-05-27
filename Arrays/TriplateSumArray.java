package Arrays;

import java.util.*;

//Given an array A of size n and an integer X.
//Find if there's a triplet in the array which sums up to the given integer X.
public class TriplateSumArray {
//    Expected Time Complexity: O(n2)
//    Expected Auxiliary Space: O(1)
    // Method - Two Pointer approach
    public static int find3Numbers(int A[], int n, int X) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = temp;
                }

            }
        }
//        for (int item : A) {
        // System.out.print(item+" ");
//        }
        // System.out.print("\n");
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int e = n - 1;
            while (j < e) {
                if (A[j] + A[i] + A[e] == X) {
                    return 1;
                } else if (A[j] + A[i] + A[e] < X) {
                    j++;
                } else if (A[j] + A[i] + A[e] > X) {
                    e--;
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
