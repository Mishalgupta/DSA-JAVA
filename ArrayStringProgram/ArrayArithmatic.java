package ArrayStringProgram;

import java.util.Scanner;

public class ArrayArithmatic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of 2D array");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter the values of both the arrays");
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
//3*3 Array Addition 
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                c[i][j] = a[i][j] + b[i][j];
//                System.out.print(c[i][j] + " ");
//            }
//            System.out.print("\n");
//        }

//3*3 Array Multiplication 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = 0;
                for (int k = 0; k < 3; k++) {
                    sum = sum + a[i][k] * b[k][j];
                }
                c[i][j] = sum;
                System.out.print(c[i][j] + " ");
            }
            System.out.print("\n");
        }
        sc.close();

    }

}
