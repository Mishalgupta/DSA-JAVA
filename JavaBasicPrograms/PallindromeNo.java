package JavaBasicPrograms;

import java.util.Scanner;

// palindrome no. are those no. who can be the same as previous after reversing them.
public class PallindromeNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n = sc.nextInt();
        int c = 0, rem, a;
        a = n;// n value becomes zero in the loop so we need to asign it in another variable
              // so that we can used it further.
        while (n != 0) {
            rem = n % 10;
            n = n / 10;
            c = c * 10 + rem;
        }
//        System.out.println(r);
//        System.out.println(n);
        System.out.println("Reverse of " + n + " is: " + c);
        if (a == c) {
            System.out.println("Palindrome no.");
        } else {
            System.out.println("Not Palindrome no.");
        }
        sc.close();

    }

}
