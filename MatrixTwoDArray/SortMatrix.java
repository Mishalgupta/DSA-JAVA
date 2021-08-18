package MatrixTwoDArray;

import java.util.*;

public class SortMatrix {
//    Expected Time Complexity:O(N2LogN)
//    Expected Auxillary Space:O(N2)
    static int[][] sortedMatrix(int n, int mat[][]) {
        // temporary matrix of size n^2
        int temp[] = new int[n * n];
        int k = 0;

        // copy the elements of matrix one by one into temp[]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[k++] = mat[i][j];
            }
        }
        // sort temp[] array
        Arrays.sort(temp);

        // copy the elements of temp[] one by one in mat[][]
        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = temp[k++];
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int mat[][] = { { 5, 4, 7 }, { 1, 3, 8 }, { 2, 9, 6 } };
        int n = 3;
        sortedMatrix(n, mat);
        System.out.println("Sorted matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}