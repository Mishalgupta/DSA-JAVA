package Heap;

import java.util.*;

public class KthLargestElement {
    // method-PriorityQueue min heap
//    Expected Time Complexity: O(N)
//    Expected Auxiliary Space: O(K*logK)

    static int[] kLargest(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < n; i++) {
            if (pq.peek() < arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        // now we have k largest elements now store them in stack and find the largest
        // one
        int[] res = new int[k];
        int index = 0;

        Stack<Integer> st = new Stack<>();

        while (!pq.isEmpty()) {
            st.push(pq.poll());
        }
        // pop from stack so the elements are now in reverse order means Max. at first
        // pop the kth element and return
        while (!st.isEmpty()) {
            res[index++] = st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 23, 12, 9, 30, 2, 50 };
        int n = arr.length;
        int k = 3;
        System.err.println("Kth largest element are: ");
        int res[] = kLargest(arr, n, k);
        for (int i = 0; i < res.length; i++) {
            System.err.print(res[i] + " ");
        }
    }

}
