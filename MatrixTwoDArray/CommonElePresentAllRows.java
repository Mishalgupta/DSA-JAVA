package MatrixTwoDArray;

import java.util.*;

public class CommonElePresentAllRows {

    public static void findCommonElements(int mat[][], int n, int m) {
        Map<Integer, Integer> mp = new HashMap<>();

        // initialize 1st row elements with value 1
        for (int j = 0; j < m; j++) {
            mp.put(mat[0][j], 1);
        }
        // starting from 2nd row & compare it with 1st
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // If element is present in the map and
                // is not duplicated in current row.
                if (mp.containsKey(mat[i][j]) && mp.get(mat[i][j]) == i) {
                    // we increment count of the element in map by 1
                    mp.put(mat[i][j], i + 1);

                    // If this is last row
                    if (i == n - 1) {
                        System.out.print(mat[i][j] + " ");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 1, 4, 8 }, { 3, 7, 8, 5, 1 }, { 8, 7, 7, 3, 1 }, { 8, 1, 2, 7, 9 }, };
        int n = mat.length;
        int m = mat[0].length;
        findCommonElements(mat, n, m);
    }
}