package Arrays;

import java.util.*;
import java.math.*;

public class FactorialOfLargerNo {
    static ArrayList<Integer> factorial(int N) {
        BigInteger b1 = new BigInteger("1");
        for (int i = 2; i <= N; i++) {
            b1 = b1.multiply(BigInteger.valueOf(i));
        }
        return b1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int N = sc.nextInt();
        System.out.println(factorial(N));
        sc.close();
    }

}
