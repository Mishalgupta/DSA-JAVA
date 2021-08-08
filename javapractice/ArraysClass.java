package javapractice;

import java.util.*;

public class ArraysClass {

    public static void main(String[] args) {
        int a[] = { 5, 3, 2, 4, 1 };
        int i;
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
//        Arrays.sort(a);
//        System.out.println("");
//        for (i = 0; i < a.length; i++) {
//            System.out.println(a[i] + "");
//        }

        Arrays.sort(a, 1, 5);
        System.out.println("");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

//        ******************************

        int ar[] = { 2, 2, 1, 8, 3, 2, 2, 4, 2 };
        for (i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

        System.out.println();
        Arrays.fill(ar, 1, 5, 10);
        for (i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println("\nArray completely filled with 10\n" + Arrays.toString(ar));

//        *********************************
        int b[] = new int[10];
        int j;
        Arrays.fill(b, 5);
        System.out.println(Arrays.toString(b));
        for (j = 0; j < b.length; j++) {
            System.out.print(b[i] + " ");
        }

        Arrays.fill(b, 5, 9, 6);
        System.out.println("\nArray completely filled with 10\n" + Arrays.toString(b));
        for (j = 0; j < b.length; j++) {
            System.out.print(b[i] + " ");
        }

        System.out.println();
        boolean eq = Arrays.equals(a, b);
        System.out.println(eq);
    }

}
