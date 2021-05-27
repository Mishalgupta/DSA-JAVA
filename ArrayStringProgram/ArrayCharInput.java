package ArrayStringProgram;

import java.util.Scanner;

public class ArrayCharInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Characters");
        char a[] = new char[5];
        for (int i = 0; i <= 4; i++) {
            a[i] = sc.next().charAt(0);
        }
        int U = 0, A = 0, V = 0;
        for (int i = 0; i <= 4; i++) {
            System.out.print(a[i]);
            if (a[i] >= 65 && a[i] <= 90) {
                U++;
            }
            if ((a[i] >= 65 && a[i] <= 90) || (a[i] >= 97 && a[i] <= 122)) {
                A++;
            }
            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' || a[i] == 'A' || a[i] == 'E'
                    || a[i] == 'I' || a[i] == 'O' || a[i] == 'U') {
                V++;
            }
            if ((a[i] >= 97 && a[i] <= 122)) {
                a[i] = (char) (a[i] - 32);
                System.out.print(a[i]);
            } else {
                System.out.print(a[i]);
            }
        }
        System.out.print("\n");
        System.out.println("Total Upper Case Letters are: " + U);
        System.out.println("Total Alphabets are: " + A);
        System.out.println("Total Vowels are: " + V);
        sc.close();
    }

}
