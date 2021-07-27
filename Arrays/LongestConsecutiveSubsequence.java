package Arrays;

import java.util.*;

//Given an array of positive integers. Find the length of the longest
//sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
public class LongestConsecutiveSubsequence {
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(N).
    static int findLongestConseqSubseq(int arr[], int N) {
        // Method-0 Brute force technique
//        Time complexity: O(nLogn). 
//        Time to sort the array is O(nlogn).
//        Auxiliary space : O(1). 

//since : array starts from 0 so we need to add extra 1 in count
//        int ans = 0, count = 1 + 1;
//        Arrays.sort(arr);
//        ArrayList<Integer> v = new ArrayList<Integer>();
//
//        // Insert repeated elements
//        // only once in the array
//        for (int i = 1; i < N; i++) {
//            if (arr[i] != arr[i - 1])
//                v.add(arr[i]);
//        }
//
//        // Find the maximum length
//        // by traversing the array
//        for (int i = 1; i < v.size(); i++) {
//
//            // Check if the current element is
//            // equal to previous element +1
//            if (v.get(i) == v.get(i - 1) + 1)
//                count++;
//            else
//                count = 1;
//
//            // Update the maximum
//            ans = Math.max(ans, count);
//        }
//        return ans;

        // Method-1 HashSet O(n+n+n)=O(3n)=O(n)
        Set<Integer> hash = new HashSet<Integer>(); // space O(n)
        for (int i : arr) // O(n) while pushing in set
        {
            hash.add(i);
        }
        int max = 0, j = 0;
        System.out.println(hash);
        for (int i = 0; i < N; i++) // O(n)
        {
            if (!hash.contains(arr[i] - 1)) {
                j = arr[i];
//                System.out.println(j);
                int count = 1;
                // loop continue till we got the no. in while loop
                // and we'll outside the loop when number is not found
                while (hash.contains(j + 1)) // O(n)
                {
                    j++;
                    count++;
                }
//                System.out.println(j);
                max = Math.max(max, count);
//                System.out.println(max);
            }
        }
        return max;

        // Method-2 PriorityQueue
        // It's has same time complexity as above one
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for (int i = 0; i < N; i++) {
//            pq.add(arr[i]);
//        }
//        int prev = pq.poll();
//        int c = 1, max = 1;
//        for (int i = 1; i < N; i++) {
//            if (pq.peek() - prev > 1) {
//                c = 1;
//                prev = pq.poll();
//            } else if (pq.peek() - prev == 0) {
//                prev = pq.poll();
//            } else if (pq.peek() - prev == 1) {
//                c++;
//                prev = pq.poll();
//            }
//            max = Math.max(max, c);
//        }
//        return max;
    }

    public static void main(String[] args) {
//        int a[] = { 2, 6, 1, 9, 4, 5, 3 };
        int a[] = { 1, 9, 3, 10, 4, 20, 2 };
        int N = a.length;
        System.out.println("Longest sequnece is: " + findLongestConseqSubseq(a, N));
    }

}
