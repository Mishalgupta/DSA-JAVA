package JavaBasicPrograms;

import java.util.Scanner;

public class NoofDaysInMonth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month no.");
        int no = sc.nextInt();
        if (no == 1 || no == 3 || no == 5 || no == 7 || no == 8 | no == 10 || no == 12) {
            System.out.println("No. of Days are 31");
        } else if (no == 2) {
            System.out.println("No.of Days are 28/29");
        } else {
            System.out.println("No. of Days are 30");
        }
        sc.close();
    }

}
