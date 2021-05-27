package Searching_Sorting;

//Given an array arr[] of distinct integers of size N and a sum value X,
//the task is to find count of triplets with the sum smaller than the given sum value X.
import java.util.*;

//Consider an array {4, 6, 8, 12, 15, 18, 20} with sum = 29. The outer most loop will fix the i (1st element),
//so in the first iteration we have fixed one of our element to be 4. Now we need to find the pairs whose sum is less than 25.
//Starting with j=1, k=6; 6+20=26>25, this pair do not contribute to ans, so k--. j=1, k=5; 6+18=24<25, 
//now observe that along with {6, 18}; sum of pairs {6, 15}, {6, 12} and {6, 8} are also less than 25. 
//So with i and j fixed there are k-j (5-1=4 in this case) triplets.
public class CountTriplatesSumLessthanX {
//    Expected Time Complexity: O(N2).
//    Expected Auxiliary Space: O(1).
    long countTriplets(long arr[], int n, int sum) {
        Arrays.sort(arr);
        long count = 0;
        for (int i = 0; i < n - 2; i++) {
            int k = n - 1, j = i + 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] >= sum) {
                    k--;
                } else {
                    count = count + (k - j);
                    j++;
                    // count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
