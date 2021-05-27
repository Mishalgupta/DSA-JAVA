package Searching_Sorting;

import java.util.*;

public class AggresiveCows {
    // Method Binary search
    // Time: O(Nlogn)
    // space: O(1)
    public static int larMinGap(int stall[], int cows) {
        int n = stall.length;
        Arrays.sort(stall); // nlogn
        int low = 0, high = n - 1, mid;
        int gap = 0;
        while (low < high) // logn
        {
            mid = low + (high - low) / 2;
            int count = 1;
            int prev = stall[0];
            for (int i = 0; i < n; i++) // n*logn
            {
                if (stall[i] - prev >= mid) {
                    prev = stall[i];
                    count++;
                    if (count == cows) {
                        break;
                    }

                }
            }
            if (cows == count) {
                gap = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return gap;
    }

    public static void main(String[] args) {
        int stall[] = { 1, 2, 8, 4, 9 };
        int cows = 3;
        System.out.println("Hence Largest Min. Gap is: " + larMinGap(stall, cows));
    }

}
