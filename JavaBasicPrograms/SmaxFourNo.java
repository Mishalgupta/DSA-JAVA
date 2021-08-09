package JavaBasicPrograms;

import java.util.Scanner;

public class SmaxFourNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.'s:");
        int w = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int smax, max;
        if (w > x) {
            max = w;
            smax = x;
        } else {
            max = x;
            smax = w;
        }
        if (y > max) {
            smax = max;
            max = y;
        } else if (y > smax) {
            smax = y;
        }
        if (z > max) {
            smax = max;
            max = z;
        } else if (z > smax) {
            smax = z;
        }
        System.out.println("Smax=" + smax);
        sc.close();
    }
}