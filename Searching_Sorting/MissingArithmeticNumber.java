package Searching_Sorting;

//Given three integers  'A' denoting the first term of an arithmetic sequence , 
//'C' denoting the common difference of an arithmetic sequence and an integer 'B'.
//you need to tell whether 'B' exists in the arithmetic sequence or not.
public class MissingArithmeticNumber {
    // method-1
//    nth term of an Arithmetc sequence starting with 'a' and common difference 'd' is a + (n-1)*d. 
//    so we can write this as n=1+(B-A)/C
    // Here B is taken as nth term and we check this using given formula.
//    Expected Time Complexity: O(1)
//    Expected Auxiliary Space: O(1)
    static int inSequence(int A, int B, int C) {
        // if C==0 & A==B
        if (C == 0) {
            if (A == B) {
                return 1;
            }
        } else if (C != 0) {
            if ((B - A) / C < 0) {
                return 0;
            } else if ((B - A) % C == 0) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int A = 1, B = 3, C = 2;
        System.out.println("B is in Sequence: " + inSequence(A, B, C));
    }
}
