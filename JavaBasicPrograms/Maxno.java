package JavaBasicPrograms;

import java.util.Scanner;

public class Maxno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no.'s");
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A > B) {
            System.out.println(A + " is greater than " + B);
        } else if (B > A) {
            System.out.println(B + " is greater than " + A);
        } else {
            System.out.println("Both are Equal");
        }
        sc.close();

    }

}
