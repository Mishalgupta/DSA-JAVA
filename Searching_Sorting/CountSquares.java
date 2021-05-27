package Searching_Sorting;
//Consider a sample space S consisting of all perfect squares starting from 1, 4, 9 and so on. You are given a number N, 
//you have to output the number of integers less than N in the sample space S.
public class CountSquares {
//    Expected Time Complexity: O(sqrt(N))
//    Expected Auxiliary Space: O(1)
    static int countSquares(int N) {
        int count = 0;
        for (int i = 1; i < Math.sqrt(N); i++) {
            if (i * i < N) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int N = 9;
        System.out.println(countSquares(N));
    }

}
