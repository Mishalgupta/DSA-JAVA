package JavaBasicPrograms;

import java.util.Scanner;

public class LcmLcd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two no.'s");
        int L;
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Now loop will execute from either a or b depending on their no.
        // also this will only execute till multiples of a or b.
        for (L = a > b ? a : b; L <= a * b; L = L + (a > b ? a : b)) {
            if (L % a == 0 && L % b == 0) {
                break;
            }
        }
        System.out.println("Lcd is: " + L);

        sc.close();
    }

}
