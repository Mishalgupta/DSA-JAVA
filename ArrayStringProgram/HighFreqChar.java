package ArrayStringProgram;

import java.util.Scanner;

public class HighFreqChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch[] = new char[10];
        int f = 0, max = 0;
//        char x;
        System.out.println("Enter Chracters");
        for (int i = 0; i <= 5; i++) {
            ch[i] = sc.next().charAt(0);
        }
        for (int i = 0; i <= 5; i++) {
//            f = 1;
            for (int j = i + 1; j <= 5; j++) {
                if (ch[i] == ch[j]) {
                    f++;
                }
            }
//            if (f > max) {
//                max = f;
//                x = ch[i];
//            }
        }
        System.out.println("Higest Frequency is: " + f);
        sc.close();

    }

}
