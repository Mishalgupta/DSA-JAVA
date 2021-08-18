package Arrays;

import java.util.*;

//Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet.
//Each packet can have a variable number of chocolates. There are M students, 
//the task is to distribute chocolate packets among M students such that :
//1. Each student gets exactly one packet.
//2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.
public class ChocalateDistributionProblem {
//    Expected Time Complexity: O(N*Log(N))
//    Expected Auxiliary Space: O(1)
    public static long findMinDiff(ArrayList<Long> a, long n, long m) {
        long min = Integer.MAX_VALUE;
        int m1 = (int) (m);
        long diff = 0;
        Collections.sort(a);
        System.out.println(a);
        int n1 = (int) (n);

        // since we only give chocolate to given students & exactly one to each,
        // so we need to find min. of max. chocolate & min. chocolate given.
        for (int i = 0; i <= n1 - m1; i++) {
            diff = a.get(i + m1 - 1) - a.get(i);
            min = Math.min(diff, min);
//            System.out.println(min);
        }
        return min;
    }

    public static void main(String[] args) {
//        N = 8, M = 5
//        A = {3, 4, 1, 9, 56, 7, 9, 12}
//        17 83 59 25 38 63 25 1 3 for {9,9}
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of packets");
        long n = sc.nextLong();
        ArrayList<Long> a = new ArrayList<Long>();
        for (int i = 0; i < n; i++) {
            long x = sc.nextInt();
            a.add(x);
        }
        System.out.println("Enter no. of students");
        long m = sc.nextLong();
        System.out.println("min is: " + findMinDiff(a, n, m));
        sc.close();
    }

}