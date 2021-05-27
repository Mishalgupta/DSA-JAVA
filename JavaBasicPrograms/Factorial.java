package JavaBasicPrograms;

import java.math.*;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int f = sc.nextInt();
//        if (f >= 0) {
//            int fact = 1;
//            while (f != 0) {
//                fact = fact * f;
//                f--;
//            }
//            System.out.println("Factorial of no. is: " + fact);
//        } else {
//            System.out.println("Invalid entry");
//        }

        // this method doesn't support for large values: so for this we use BigInteger

        // initialise bigInteger
        BigInteger b1 = new BigInteger("1");
        for (int i = 2; i <= f; i++) {
            b1 = b1.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of no. is: " + b1);

        sc.close();
    }

}
