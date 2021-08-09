package JavaBasicPrograms;

import java.util.Scanner;

public class SmaxThreeNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.'s:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int smax, max;
        if (x > y) {
            max = x;
            smax = y;
        } else {
            max = y;
            smax = x;
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