package JavaBasicPrograms;

import java.util.Scanner;

public class TmaxFourNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.'s:");
        int w = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        // from here we can get 3rd max
        int m1 = Math.min(Math.max(w, x), Math.max(y, z));
        // from here we can get 3rd max
        int m2 = Math.max(Math.min(w, x), Math.min(y, z));
        if (m1 < m2) {
            System.out.println("Tmax=" + m1);
        } else {
            System.out.println("Tmax=" + m2);
        }
        sc.close();

    }

}
