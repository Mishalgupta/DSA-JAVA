package MatrixTwoDArray;

import java.util.*;

public class SpiralMatrix {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        int row = matrix.length, col = matrix[0].length;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int top = 0, left = 0, right = col - 1, down = row - 1, direction = 0;
        while (top <= down && left <= right) {
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    arr.add(matrix[top][i]);
                }
                top++;
            } else if (direction == 1) {
                for (int i = top; i <= down; i++) {
                    arr.add(matrix[i][right]);
                }
                right--;
            } else if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    arr.add(matrix[down][i]);
                }
                down--;
            } else if (direction == 3) {
                for (int i = down; i >= top; i--) {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
            direction = (direction + 1) % 4;
        }
        return arr;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int r = matrix.length;
        int c = matrix[0].length;
        ArrayList<Integer> ob = spirallyTraverse(matrix, r, c);
        for (int i : ob) {
            System.out.print(i + " ");
        }

    }

}