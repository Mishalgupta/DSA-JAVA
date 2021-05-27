package JavaBasicPrograms;

import java.util.Scanner;

public class MaxThreeNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three no.'s");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
//        if (x > y && x > z) {
//            System.out.println(x + " is greater than " + y + " & " + z);
//        }
//        if (y > x && y > z) {
//            System.out.println(y + " is greater than " + x + " & " + z);
//        } else {
//            System.out.println(z + " is greater than " + x + " & " + y);
//        }

// ******Nested if-else*******
        if (x > y) {
            if (x > z) {
                System.out.println(x + " is greater than " + y + " & " + z);
            } else {
                System.out.println(z + " is greater than " + x + " & " + y);
            }

        } else {
            if (y > z) {
                System.out.println(y + " is greater than " + x + " & " + z);
            } else {
                System.out.println(z + " is greater than " + x + " & " + y);
            }
        }
        sc.close();
    }

}
