package Greedy;

import java.util.*;
//Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet.
//Each packet can have a variable number of chocolates. There are M students, 
//the task is to distribute chocolate packets among M students such that :
//1. Each student gets exactly one packet.
//2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

public class ChocolateDistributionProblem {
//  Expected Time Complexity: O(N*Log(N))
//  Expected Auxiliary Space: O(1)
    public static long findMinDiff(ArrayList<Integer> a, int n, int m) {
        int min = Integer.MAX_VALUE;
        int diff = 0;
        Collections.sort(a);
        // since we only give chocolate to given students & exactly one to each,
        // so we need to find min. difference of max. chocolate & min. chocolate given.
        for (int i = 0; i <= n - m; i++) {
            diff = a.get(i + m - 1) - a.get(i);
            min = Math.min(diff, min);
        }
        return min;
    }

    public static void main(String[] args) {
        int n = 8;
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(4);
        a.add(1);
        a.add(9);
        a.add(56);
        a.add(7);
        a.add(9);
        a.add(12);
        int m = 5;
        System.out.println("min difference is: " + findMinDiff(a, n, m));
    }
}