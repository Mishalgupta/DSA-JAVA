package MatrixTwoDArray;

import java.util.Scanner;

// Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
// -> Integers in each row are sorted from left to right.
// -> The first integer of each row is greater than the last integer of the previous row.

public class MatrixSearch {
    public static boolean matrixSearch(int[][] matrix, int r, int c, int k) {
        // method-1 brute force
        // Time O(n^2)
        // space O(1)
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                if (matrix[i][j] == k) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

        // Method-2 Binary search O(n*log m) space O(1)
        int low = 0, high = (r * c) - 1;
        while (low <= high) {
            int mid = (low + (high - low) / 2); // to avoid overflow
            // we get index by dividing mid by col no.
            if (matrix[mid / c][mid % c] == k) {
                return true;
            } else if (matrix[mid / c][mid % c] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    // Method-3 two pointer
    // Time complexity O(n)
    // Space complexity O(1)
//        int i = 0, j = c - 1;
//        while (i < r && j >= 0) {
//            if (matrix[i][j] == k) {
//                return true;
//            } else if (matrix[i][j] > k) {
//                j--;
//            } else {
//                i++;
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int r = matrix.length;
        int c = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to search: ");
        int k = sc.nextInt();
        System.out.println(matrixSearch(matrix, r, c, k));
        sc.close();
    }

}
