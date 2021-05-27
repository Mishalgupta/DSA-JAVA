package JavaBasicPrograms;

import java.util.Scanner;

public class HcfGcd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two no.'s");
        int gcd=0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("Gcd is: " + gcd);
        sc.close();
    }

}
