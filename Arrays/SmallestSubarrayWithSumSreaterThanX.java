package Arrays;

public class SmallestSubarrayWithSumSreaterThanX {
    public static int sb(int a[], int n, int x) {
        int result = Integer.MAX_VALUE;
        int start_index = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
            while (sum > x) {
                result = Math.min(result, i + 1 - start_index);
                sum = sum - a[start_index];
                start_index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 0, 19 };
        int x = 51;
        int n = A.length;
        System.out.println("Smallest subarray is: " + sb(A, n, x));
    }

}