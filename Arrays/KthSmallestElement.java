package Arrays;

import java.util.*;

//Given an array arr[] and a number K where K is smaller than size of array,
//the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
public class KthSmallestElement {
    // we need to use max. heap as we need smallest element. so for this we use
    // priority queue.
//    Expected Time Complexity: O(n)
//    Expected Auxiliary Space: O(1)
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        int n = arr.length;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            queue.add(arr[i]);
            if (queue.size() > k) {
                // we will remove element from top when the size of the queue is greater than
                // given element.
                queue.poll();
            }
        }
        return queue.peek();

    }

    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 3, 20, 15 };
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to search");
        int k = sc.nextInt();
        System.out.println(k + " smallest element is: " + kthSmallest(arr, 0, n - 1, k));
        sc.close();
    }

}
