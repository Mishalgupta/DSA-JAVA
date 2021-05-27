package ArrayStringProgram;

import java.util.Scanner;

public class NoofCamelCaseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        // Character input
        String s = sc.next();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                count++;
            }
        }
        System.out.println("sequence of words in CamelCase: " + count);
        sc.close();

    }
}
