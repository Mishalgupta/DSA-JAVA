package Greedy;

import java.util.*;

public class ActivitySelection_Nmeetings {
//    Expected Time Complexity : O(N*LogN)
//    Expected Auxilliary Space : O(N)

    static class Pair {
        int start;
        int finish;

        Pair(int c, int d) {
            start = c;
            finish = d;
        }
    }

    static class Mycmp implements Comparator<Pair> {

        public int compare(Pair p1, Pair p2) {
            // pairs in order
            if (p1.finish < p2.finish) {
                return -1;
            }
            // not in order
            else if (p1.finish > p2.finish) {
                return 1;
            }
            return 0;
        }
    }

    // Function to find the maximum number of meetings that can be performed in a
    // meeting room.
    public static int maxMeetings(int start[], int end[], int n) {
        // this will store our pairs of start & end time
        ArrayList<Pair> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) // O(n)
        {
            arr.add(new Pair(start[i], end[i]));
        }
        // we need to custom sort pair based on finishing time so we use comparator
        Mycmp mc = new Mycmp();
        Collections.sort(arr, mc); // O(nlogn)
        int res = 1;
        int prev = arr.get(0).finish;
        for (int i = 1; i < n; i++) // O(n)
        {
            if (arr.get(i).start > prev) {
                res++;
                // update the prev value with current finish
                prev = arr.get(i).finish;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        int n = start.length;
        System.out.println("Max. meetings is: " + maxMeetings(start, end, n));
    }

}
