package Arrays;

import java.util.*;

public class KthMaxElement {
    // Method-1
    public static void main(String[] args) {
        int a[] = { 12, 5, 787, 1, 23 };
        int k = 3;
        int n = a.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            if (i < k) {
                pq.add(a[i]);
//                System.out.println(pq);
            } else if (pq.peek() < a[i]) {
                pq.poll();
//                System.out.println(pq);
                pq.add(a[i]);
//                System.out.println(pq);
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
        System.out.print("Top k max elements are: ");
        for (int i : res) {
            System.err.print(i + " ");
        }
    }

}