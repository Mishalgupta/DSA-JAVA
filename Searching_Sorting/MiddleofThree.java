package Searching_Sorting;
//Given three distinct numbers A, B and C. Find the number with value in middle (Try to do it with minimum comparisons).
public class MiddleofThree {
//    Expected Time Complexity:O(1)
//    Expected Auxillary Space:O(1)
    static int middle(int A, int B, int C) {
        int max1 = Math.max(A, B);
        int max2 = Math.max(max1, C);
        int min1 = Math.min(A, B);
        int min2 = Math.min(min1, C);
        if (A > min2 && A < max2) {
            return A;
        } else if (B > min2 && B < max2) {
            return B;
        } else {
            return C;
        }
    }

    public static void main(String[] args) {
        int A = 978, B = 518, C = 300;
        System.out.println("Middle Element between min & min: " + middle(A, B, C));
    }

}