package JavaBasicPrograms;

import java.util.Scanner;

public class MarksPassFail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        if (m1 < 40) {
            if (m2 < 40) {
                if (m3 < 40) {
                    System.out.println("Failed");
                } else {
                    System.out.println("Failed");
                }
            } else {
                if (m3 < 40) {
                    System.out.println("Failed");
                } else {
                    System.out.println("Supp");
                }
            }
        } else {
            if (m2 < 40) {
                if (m3 < 40) {
                    System.out.println("Failed");
                } else {
                    System.out.println("Supp");
                }
            } else {
                if (m3 < 40) {
                    System.out.println("Supp");
                } else {
                    System.out.println("Pass");
                }
            }
        }
        sc.close();
    }

}
