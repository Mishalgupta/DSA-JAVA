package ArrayStringProgram;

import java.util.Scanner;

public class TwoDmatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of the matrix");
        int a[][] = new int[3][3];
        int sum = 0, E = 0, Avg = 0, G = 0, Totallength = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
                sum = sum + a[i][j];
                Totallength++;
            }
        }
        Avg = sum / Totallength;
        System.out.println("Enter value to check");
        int val = sc.nextInt();
        int P = 0, F = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]);
                if (a[i][j] % 2 == 0) {
                    E++;
                }
                if (a[i][j] > Avg) {
                    G++;
                }
                if (a[i][j] == val) {
                    P = 1;
                }
                if (a[i][j] == val) {
                    F++;
                }
            }
            System.out.print("\n");
        }
        System.out.print("Sum of values of 2D array is: " + sum + "\n");
        System.out.print("total no. of Even values in 2D array is: " + E + "\n");
        System.out.print("Avg. of values in 2D array is: " + Avg + "\n");
        System.out.print("Values greater than Avg. of values in 2D array is: " + G + "\n");
        if (P == 1) {
            System.out.println(val + " Value exist");
        } else {
            System.out.println(val + " Value not exist");
        }
        System.out.print("frequency of " + val + " values in 2D array is: " + F + "\n");

        sc.close();
    }

}
