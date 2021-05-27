package JavaBasicPrograms;

import java.util.Scanner;

public class MaxFourNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four no.'s:");
        int w = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (w > x) {
            if (w > y) {
                if (w > z) {
                    System.out.println(w + " is greater than " + x + "," + y + "," + z);
                } else {
                    System.out.println(z + " is greater than " + w + "," + x + "," + y);
                }
            } else {
                if (y > z) {
                    System.out.println(y + " is greater than " + w + "," + x + "," + z);
                } else {
                    System.out.println(z + " is greater than " + w + "," + x + "," + y);
                }
            }
        } else {
            if (x > y) {
                if (x > z) {
                    System.out.println(x + " is greater than " + w + "," + y + "," + z);
                } else {
                    System.out.println(z + " is greater than " + w + "," + x + "," + y);
                }
            } else {
                if (y > z) {
                    System.out.println(y + " is greater than " + w + "," + x + "," + z);
                } else {
                    System.out.println(z + " is greater than " + w + "," + x + "," + y);
                }
            }
        }
        sc.close();
    }

}
