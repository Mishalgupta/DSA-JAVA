package JavaBasicPrograms;

import java.util.Scanner;

public class UpperCaseOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        // Character input
        char c = sc.next().charAt(0);
        if (c >= 'A' && c <= 'Z') {
            System.out.println("Upper case");
        } else if (c >= 'a' && c <= 'z') {
            System.out.println("Lower Case");
        } else {
            System.out.println("Invalid input");
        }
        sc.close();

    }

}
