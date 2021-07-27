package Arrays;

import java.util.Scanner;

//Given an array of n positive integers and a number k. 
//Find the minimum number of swaps required
//to bring all the numbers less than or equal to k together.
public class MinimumswapsandKtogether {
//    A simple approach is to use two pointer technique and sliding window.
//    Expected Time Complexity: O(N).
//    Expected Auxiliary Space: O(1).

    public static int minSwap(int arr[], int n, int k) {
        // find good one elements which are less than & equal to given no.
        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (arr[i] <= k) {
                ++count;
            }
        }
        System.out.println("Count= " + count);

        // Find unwanted elements in current
        // window of size 'count'
        int bad = 0;
        for (int i = 0; i < count; ++i) {
            if (arr[i] > k) {
                ++bad;
            }
        }

        System.out.println("Bad= " + bad);

        // Initialize answer with 'bad' value of current window
        int ans = bad;
        for (int i = 0, j = count; j < n; ++i, ++j) {

            // Decrement count of previous window if start of window is bed
            if (arr[i] > k) {
                --bad;
            }
//            System.out.println(bad);

            // Increment count of current window
            if (arr[j] > k) {
                ++bad;
//                System.out.println(bad);
            }
            // Update ans if count of 'bad' is less in current window
            ans = Math.min(ans, bad);
//            System.out.println("ans" + ans);
        }
        return ans;
    }

    public static void main(String[] args) {
//        int arr[] = { 2, 1, 5, 6, 3 };
        int arr[] = { 2, 7, 9, 5, 8, 7, 4 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int k = sc.nextInt();
        int n = arr.length;
        System.out.println("swap= " + minSwap(arr, n, k));
        sc.close();

    }

}
