package JavaBasicPrograms;

import java.util.Scanner;

public class VowelOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
//        String s = sc.next();
//        char c = s.charAt(0);
        char c = sc.next().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Not vowel");
        }
        sc.close();
    }

}
