package Greedy;

import java.util.*;

public class JobSequencingProblem {
//Expected Time Complexity: O(NlogN)
//Expected Auxiliary Space: O(N)

    static class Job {
        int id, profit, deadline;

        public Job(int x, int y, int z) {
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
    }

    static class Mycmp implements Comparator<Job> {
        public int compare(Job j1, Job j2) {
            return j2.profit - j1.profit;
        }
    }

    // Function to find the maximum profit and the number of jobs done.
    static int[] JobScheduling(ArrayList<Job> arr, int n) {
        // sort profit in decreasing order
        Collections.sort(arr, new Mycmp());
        int max = 0;
        // finding the max. deadline to create array
        for (int i = 0; i < n; i++) {
            if (arr.get(i).deadline > max) {
                max = arr.get(i).deadline;
            }
        }
        // Initializing the array with -1
        int result[] = new int[max + 1];
        for (int i = 1; i <= max; i++) {
            result[i] = -1;
        }

        int countJobs = 0, jobProfit = 0;
        // traversing in the array for all job id's
        for (int i = 0; i < n; i++) {
            // traversing from last to first
            for (int j = arr.get(i).deadline; j >= 0; j--) {
                // free slot found then add the job
                if (result[j] == -1) {
                    result[j] = i;
                    countJobs++;
                    jobProfit += arr.get(i).profit;
                    // we can perform only one job at given day,so we break it
                    break;
                }
            }
        }
        // Returning the result
        int ans[] = new int[2];
        ans[0] = countJobs;
        ans[1] = jobProfit;
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Job> arr = new ArrayList<Job>();
        arr.add(new Job(1, 4, 20));
        arr.add(new Job(2, 5, 60));
        arr.add(new Job(3, 6, 70));
        arr.add(new Job(4, 6, 65));
        arr.add(new Job(5, 4, 25));
        arr.add(new Job(6, 2, 80));
        arr.add(new Job(7, 2, 10));
        arr.add(new Job(8, 2, 22));
        int n = arr.size();
        int res[] = JobScheduling(arr, n);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

}
