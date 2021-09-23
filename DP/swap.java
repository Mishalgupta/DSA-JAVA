package DP;

public class swap {
    // Swap array elements by k index val
    // Time: O(n)
    static void find(int arr[], int n, int val) {
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            int k = (i + 3) % n;
            res[i] = arr[k];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = 25143;
        String s = String.valueOf(n);
        int arr[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - 48;
        }
        int N = arr.length;
        int target = 3;
        find(arr, N, target);
    }
}