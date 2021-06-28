package Queue;

import java.util.*;

public class FirstNegativeIntegerInwindowOfSizeK {

    static void printFirstNegativeInteger(int arr[], int n, int k) {
        // this deque will store index of useful array elements(all -ve integers),
        // for current window of size k.
        Deque<Integer> di = new LinkedList<>();
        int i = 0;
        for (i = 0; i < k; i++) {
            if (arr[i] < 0) {
                di.add(i);
            }
        }
        for (; i < n; i++) {
            // if Di is not empty then the element
            // at the front of the queue is the first
            // negative integer of the previous window
            if (!di.isEmpty()) {
                System.out.print(arr[di.peek()] + " ");
            }
            // else the window does not have a
            // negative integer.
            else {
                System.out.println("0" + " ");
            }

            while ((!di.isEmpty()) && di.peek() < (i - k + 1)) {
                di.remove();
                if (arr[i] < 0) {
                    di.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int n = arr.length;
        int k = 3;
        printFirstNegativeInteger(arr, n, k);
    }

}
