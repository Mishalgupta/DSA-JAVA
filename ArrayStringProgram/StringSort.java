package ArrayStringProgram;

import java.util.Scanner;

public class StringSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of strings");
        int n = sc.nextInt();
        String str[] = new String[10];
        String s;
        System.out.println("Enter the strings");
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        int round;
        for (round = 1; round < n; round++) {
            // harr round mai comparsion ki value kamm ho isliye n-round
            for (int i = 0; i < n - round; i++) {
                int r = str[i].compareTo(str[i + 1]);
                System.out.println(r);
                if (r > 0) {
                    s = str[i];
                    str[i] = str[i + 1];
                    str[i + 1] = s;
                }
            }
        }
        System.out.println("Strings in dictionary order is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }
        sc.close();
    }

}
