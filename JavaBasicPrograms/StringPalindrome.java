package JavaBasicPrograms;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String a = sc.next();
        String b = "";
        int l = a.length();
        // string/array index is start from 0 to length-1 as the first element is
        // exactly contain in the memory location
        for (int i = l - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        if (a.equalsIgnoreCase(b)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not Palindrome String");
        }
        sc.close();

    }

}
