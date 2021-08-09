package ArrayStringProgram;

import java.util.Scanner;

public class StringBasicProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String str = sc.next();
        int V = 0, A = 0, F = 0;
        System.out.println("Enter a character to check");
        char ch = sc.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                V++;
            }
            if (str.charAt(i) == ch) {
                A = 1;
            }
            if (str.charAt(i) == ch) {
                F++;
            }
            char ch1 = str.charAt(i);
            if (ch1 >= 97 && ch1 <= 122) {
                ch1 = (char) (ch1 - 32);
                System.out.print(ch1);
            }
            // else keep the same alphabet or any character
            else {
//                ch1 = (char) (ch1 - 32);
                ch1 = str.charAt(i);
                System.out.print(ch1);
            }
        }
        System.out.print("\n");
        System.out.println("No. of vowels in String are: " + V);
        System.out.println("No. of Characters in String are: " + str.length());
        if (A == 1) {
            System.out.println("Character exist");
        } else {
            System.out.println("Character not exist");
        }
        System.out.println("Frequency of a particular character is: " + F);

        // String reverse
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.print("\n");
        System.out.println("Enter the another string");
        String str1 = sc.next();
        System.out.println(str + str1);
        System.out.println(str.concat(str1));
        sc.close();
    }

}
