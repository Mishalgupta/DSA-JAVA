package JavaBasicPrograms;

import java.util.Scanner;

public class RootsofQuadratic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cofficients of x^2, x and constant:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double x, y;
        int d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Roots are imaginary");
        }
        if (d == 0) {
            System.out.println("Roots are equal");
            x = (-b) / (2 * a);
            y = (-b) / (2 * a);
            System.out.println("Roots are: " + x + " " + y);
        }
        if (d > 0) {
            System.out.println("Roots are distinct and real");
            x = (-b + Math.sqrt(d)) / (2 * a);
            y = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are: " + x + " " + y);
        }
        sc.close();
    }

}
