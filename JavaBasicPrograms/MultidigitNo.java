package JavaBasicPrograms;

import java.util.Scanner;

public class MultidigitNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n = sc.nextInt();
        int rem, sum = 0, i = 0, j = 0, k = 0, d = 0, e = 0;
        while (n != 0) {
            rem = n % 10;
            n = n / 10;
            sum = sum + rem;
            i++;
            if (rem % 2 == 0) {
                j++;
            } else {
                k++;
            }
            if (rem == 0) {
                d++;
            }
            if (rem == 7) {
                e++;
            }

        }
        System.out.println("Sum of all digits is: " + sum);
        System.out.println("Count of all digits is: " + i);
        System.out.println("Count of Even digits is: " + j);
        System.out.println("Count of Odd digits is: " + k);
        System.out.println("Count of Zero Exist: " + d);
        System.out.println("Count of 7 occourance is: " + e);
        sc.close();

    }

}