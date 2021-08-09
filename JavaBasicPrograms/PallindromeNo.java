package JavaBasicPrograms;

import java.util.Scanner;

// palindrome no. are those no. who can be the same as previous after reversing them.
public class PallindromeNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n = sc.nextInt();
        int res = 0, rem, a;
        // n value becomes zero in the loop so we need to asign it in another variable
        // so that we can used it further.
        a = n;
        while (n != 0) {
            rem = n % 10;
            n = n / 10;
            res = res * 10 + rem;
        }
//        System.out.println(r);
//        System.out.println(n);
        System.out.println("Reverse of " + a + " is: " + res);
        if (a == res) {
            System.out.println("Palindrome no.");
        } else {
            System.out.println("Not Palindrome no.");
        }
        sc.close();

    }

}
