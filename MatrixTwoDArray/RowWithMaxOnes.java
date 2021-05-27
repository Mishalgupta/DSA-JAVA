package MatrixTwoDArray;

//Given a boolean 2D array of n x m dimensions where each row is sorted.
//Find the 0-based index of the first row that has the maximum number of 1's.
public class RowWithMaxOnes {
//    Expected Time Complexity: O(N+M)
//    Expected Auxiliary Space: O(1)

    static int rowWithMax1s(int arr[][], int n, int m) {
        // Method-1 using two pointer
        int i = 0, j = m - 1, max = -1;
        while (i < n && j >= 0) // O(n+m)
        {
            if (arr[i][j] == 1) {
                max = Math.max(i, max);
                j--;
            } else if (arr[i][j] == 0) {
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
//      int arr[][] = { { 0, 1, 1, 1 }, { 0, 0, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 0, 0 } };
        int arr[][] = { { 0, 0 }, { 1, 1 } };
        int n = arr.length;
        int m = arr[0].length;
        System.out.println("Row: " + rowWithMax1s(arr, n, m));
    }

}
