package JavaBasicPrograms;

import java.util.Scanner;

public class PowerOfX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Enter n");
        int n = sc.nextInt();
        int pow = 1;
        for (int i = 0; i < n; i++) {
            pow = pow * x;
        }
//        double pow = Math.pow(x, n);
        System.out.println("Power of X & n is: " + pow);
        sc.close();

    }

}
