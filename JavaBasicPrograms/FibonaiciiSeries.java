package JavaBasicPrograms;

import java.util.Scanner;

public class FibonaiciiSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.:");
        int n = sc.nextInt();
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        int fab;
        for (int i = 3; i <= n; i++) {
            // as the answer could be large so divide by modulo 10^7
            fab = (n1 + n2) % 1000000007;
            n1 = n2;
            n2 = fab;
            System.out.print(fab + " ");
        }
        sc.close();
    }

}
