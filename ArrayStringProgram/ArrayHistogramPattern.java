package ArrayStringProgram;

import java.util.Scanner;

public class ArrayHistogramPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Elements");
        for (int i = 0; i <= 4; i++) {
            a[i] = sc.nextInt();
        }

        // HORIZONTAL HISTOGRAM
//        *****
//        **
//        ********
//        ******
//        *********
        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= a[i]; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // VERTICAL HISTOGRAM

//        for (int j = 0; j <= 4; j++) {
//            for (int i = 1; i < a[i]; i++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        sc.close();

    }

}
