package ArrayStringProgram;

import java.util.Scanner;

public class ArrayTransfer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values:");
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];
        for (int i = 0; i <= 4; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (a[0] < a[i]) {
                a[0] = a[i];
            }
            b[i] = a[i];
            System.out.println("b[" + i + "]= " + b[i]);
        }
        System.out.println("\n");
        for (int i = 4; i >= 0; i--) {
            c[i] = a[i];
            System.out.println("c[" + (4 - i) + "]= " + c[i]);
        }
        System.out.println("\n");
        System.out.println("Maximum is: " + a[0]);
        sc.close();
    }

}
