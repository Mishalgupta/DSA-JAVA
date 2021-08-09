package JavaBasicPrograms;

import java.util.Scanner;

public class NaturalNo {

    public static void main(String[] args) {

//      *****print Fist ten Natural no.*****
        System.out.println("1st-10 Natural No. are=");
        for (int i = 1; i <= 10; i++) {
            if (i < 10) {
                System.out.print(i + ",");
            } else {
                System.out.println(i);
            }
        }

//      *****print Fist ten odd Natural no.*****
        System.out.println("1st-10 odd Natural No. are=");
        for (int i = 1; i <= 10; i++) {

            if (i < 10) {
                System.out.print(2 * i - 1 + ",");
            } else {
                System.out.println(2 * i - 1);
            }
        }

//        *****print Fist ten Natural no. in reverse*****
        System.out.println("1st-10 Natural No. are=");
        for (int i = 10; i >= 1; i--) {
            if (i > 1) {
                System.out.print(i + ",");
            } else {
                System.out.println(i);
            }
        }

//        ****printing first N natural no.******
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural no.");
        int N = sc.nextInt();
        System.out.println("Fist " + N + " Natural No. are=");
        for (int j = 1; j <= N; j++) {
            if (j < N) {
                System.out.print(j + ",");
            } else {
                System.out.println(j);
            }
        }
//        sc.close();

//      ****printing first N odd natural no.******
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the natural no.");
        int No = sc2.nextInt();
        System.out.println("Fist " + No + " odd Natural No. are=");
        for (int j = 1; j <= No; j++) {
            if (j < No) {
                System.out.print(j * 2 - 1 + ",");
            } else {
                System.out.println(j * 2 - 1);
            }
        }
//      sc.close();

//      ****printing first N even natural no.******
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the natural no.");
        int Ne = sc3.nextInt();
        System.out.println("Fist " + Ne + " even Natural No. are=");
        for (int j = 1; j <= Ne; j++) {
            if (j < Ne) {
                System.out.print(j * 2 + ",");
            } else {
                System.out.println(j * 2);
            }
        }
//      sc.close();

//      ****printing first N natural no. sum******
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter the natural no.");
        int Ns = sc4.nextInt();
        System.out.println("Fist " + Ns + " Natural No. sum is=");
        int sum = 0;
        for (int j = 1; j <= Ns; j++) {
            sum = sum + j;
        }
        System.out.println("Sum is=" + sum);
//      sc.close();

//      ****printing first N even natural no. sum******
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Enter the natural no.");
        int Nes = sc5.nextInt();
        System.out.println("Fist " + Nes + " even Natural No. sum is=");
        int sumE = 0;
        for (int j = 1; j <= Nes; j++) {
            sumE = sumE + j * 2;
        }
        System.out.println("Sum is=" + sumE);
//      sc.close();

//        ***First N natural no. in reverse order*****
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the natural no.");
        int Nat = sc1.nextInt();
        System.out.println("Fist " + Nat + " Natural No. are=");
        for (int j = Nat; j >= 1; j--) {
            if (j > 1) {
                System.out.print(j + ",");
            } else {
                System.out.println(j);
            }
        }
        sc1.close();

    }

}