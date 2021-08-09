package JavaBasicPrograms;

import java.util.Scanner;

public class Primeno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int Num = sc.nextInt();
        int i;// 1 is not prime no. that's why loop starting from 2
        for (i = 2; i < Num; i++) {
            if (Num % i == 0) {
                break;
            }
        }
        if (Num == i) {
            System.out.println("Entered No. " + Num + " is prime");
        } else {
            System.out.println("Entered No. " + Num + " is not prime");
        }

        sc.close();

    }

}