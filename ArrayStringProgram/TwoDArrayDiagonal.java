package ArrayStringProgram;

import java.util.Scanner;

public class TwoDArrayDiagonal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of Array");
        int a[][] = new int[3][3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.print("\n");
        }

        // sum of diagonal elements
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (a[i] == a[j]) {
//                    sum = sum + a[i][j];
//                }
//
//            }
//        }
//        System.out.println("Sum of Diagonal elements is: " + sum);

//        sum of elements below diagonal
//        i=1 => j=0
//        i=2 => j=1,j=0
//        for (int i = 0; i < 3; i++) {
//            for (int j = i - 1; j >= 0; j--) {
//                sum = sum + a[i][j];
//            }
//        }
//        System.out.println("Sum of elements below diagonal is: " + sum);

//      sum of elements above diagonal
//      i=0 => j=1,2
//      i=1 => j=2
//        for (int i = 0; i < 3; i++) {
//            for (int j = i + 1; j < 3; j++) {
//                sum = sum + a[i][j];
//            }
//        }
//        System.out.println("Sum of elements Above diagonal is: " + sum);

//      sum of elements row-wise
//      i=0 => j=0,1,2
//      i=1 => j=0,1,2
//      i=2 => j=0,1,2
//        for (int i = 0; i < 3; i++) {
//            sum = 0;
//            for (int j = 0; j < 3; j++) {
//                sum = sum + a[i][j];
//            }
//            System.out.println("Sum of elements Row " + i + " is: " + sum);
//        }

//      sum of elements column-wise
//      j=0 => i=0,1,2
//      j=1 => i=0,1,2
//      j=2 => i=0,1,2
        for (int i = 0; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                sum = sum + a[j][i];
            }
            System.out.println("Sum of elements column " + i + " is: " + sum);
        }
        sc.close();

    }

}
