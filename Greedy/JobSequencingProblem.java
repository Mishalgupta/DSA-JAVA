package Greedy;

import java.util.*;

class Job {
    int id, profit, deadline;

    public Job(int x, int y, int z) {
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

public class JobSequencingProblem {
//Expected Time Complexity: O(NlogN)
//Expected Auxilliary Space: O(N)

    static class Mycmp implements Comparator<Job> {
        public int compare(Job j1, Job j2) {
            return j2.profit - j1.profit;
        }
    }

    // Function to find the maximum profit and the number of jobs done.
    static int[] JobScheduling(Job arr[], int n) {
        // sort profit in decreasing order
        Arrays.sort(arr, new Mycmp());
        int max = 0;
        // finding the max. deadline to create array
        for (int i = 0; i < n; i++) {
            if (arr[i].deadline > max) {
                max = arr[i].deadline;
            }
        }
        // initialising the array with -1
        int result[] = new int[max + 1];
        for (int i = 1; i <= max; i++) {
            result[i] = -1;
        }

        int countJobs = 0, jobProfit = 0;
        // traversing in the array for all job id's
        for (int i = 0; i < n; i++) {
            // traversing from last to first
            for (int j = arr[i].deadline; j >= 0; j--) {
                // free slot found then add the job
                if (result[j] == -1) {
                    result[j] = i;
                    countJobs++;
                    jobProfit += arr[i].profit;
                    break;
                }
            }
        }
        // returing the result
        int ans[] = new int[2];
        ans[0] = countJobs;
        ans[1] = jobProfit;
        return ans;
    }

    public static void main(String[] args) {
        Job arr[] = { { 1, 4, 20 }, { 2, 1, 10 }, { 3, 1, 40 }, { 4, 1, 30 } };
        int n = arr.length;
        int res[] = JobScheduling(arr, n);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

}
