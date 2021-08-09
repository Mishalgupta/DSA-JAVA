package JavaBasicPrograms;

import java.util.*;

public class SieveOfEratosthenes {
//    Expected Time Complexity: O(NloglogN)
//    Expected Auxiliary Space: O(N)
    static void sieveOfEratosthenes(int N) {
        boolean primes[] = new boolean[N + 1];
        // initialise all index with true
        Arrays.fill(primes, true);
        // set 0,1 as false since 0,1 is never prime
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i * i <= N; i++) {
            if (primes[i] == true) {
                // set false all the indexes which are multiple of 2,3 etc.
                for (int j = i * i; j <= N; j = j + i) {
                    primes[j] = false;
                }
            }
        }
        // adding those indexes which are true in the arraylist and then return
        for (int i = 2; i <= N; i++) {
            if (primes[i] == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int N = 15;
        System.out.println("Prime no.'s from 2 to " + N + " is: ");
        sieveOfEratosthenes(N);
    }

}
