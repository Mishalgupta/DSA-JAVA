package MatrixTwoDArray;

public class CommonElePresentAllRows {

    public static int findCommonElements(int mat[][]) {
        int N = mat.length;
        int M = mat[0].length;
        for (int j = 0; j < M; j++) {
            int mincommon = mat[0][j];
            int i = 1;
            for (; i < N; i++) {
                if (binarySearch(mat[i], mincommon)) {
                    continue;
                } else {
                    break;
                }
            }
            if (mincommon == i) {
                return mincommon;
            }
        }
        return -1;
    }

    private static boolean binarySearch(int mat[], int k) {
        int low = 0, high = mat.length - 1;
        while (low <= high) {
            int mid = (low + (high - low) / 2); // to avoid overflow
            // we get index by dividing mid by col no.
            if (mat[mid] == k) {
                return true;
            } else if (mat[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        System.out.println("Common element: " + findCommonElements(mat));

    }

}
