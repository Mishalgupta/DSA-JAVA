package ArrayStringProgram;

import java.util.Scanner;

public class SumofArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four Values");
        int a[] = new int[4];
        int sum = 0, E = 0, O = 0, Avg = 0;
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                E++;
            } else {
                O++;
            }
            sum = sum + a[i];
            Avg = sum / a.length;
        }
        System.out.println("Sum of values is: " + sum);
        System.out.println("Average of values is: " + Avg);
        System.out.println("Even Values: " + E);
        System.out.println("Odd values: " + O);

        System.out.println("Enter the value to check");
        int v, c = 0, F = 0, D = 0;
        v = sc.nextInt();
        for (int i = 0; i < 4; i++) {
            if (a[i] == v) {
                F++;
            }
            if (a[i] > 9 && a[i] < 100) {
                D++;
            }
            if (a[i] == v) {
                c = 1;
//                break;
            }

        }
        if (c == 1) {
            System.out.println("Value Exist");
        } else {
            System.out.println("Not Exist");
        }
        System.out.println("Frequency of a no. is: " + F);
        System.out.println("Two digit values are: " + D);
        sc.close();

    }

}
