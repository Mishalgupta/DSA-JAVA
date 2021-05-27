package JavaBasicPrograms;

import java.util.Scanner;

//Armstrong no. are those no. who can get there same no.by cubic it's individual no.
public class ArmstrongNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.: ");
        int n = sc.nextInt();
        int r = 0, rem, a;
        a = n;// n value becomes zero in the loop so we need to asigning it in another
              // variable
              // so that we can used it further.
        while (n != 0) {
            rem = n % 10;
            n = n / 10;
            r = r + (rem * rem * rem);
        }
        System.out.println(r);
        System.out.println(n);
        if (a == r) {
            System.out.println("Armstrong no.");
        } else {
            System.out.println("Not armstrong no.");
        }

        sc.close();

    }

}
