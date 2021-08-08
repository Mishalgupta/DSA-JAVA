package Strings;

import java.util.*;

public class RomanToInteger {
    // Method-1 iterative
//        Expected Time Complexity: O(n)
//        Expected Auxiliary Space: O(1)
    static int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    // Finds decimal value of a given roman numeral
    public static int romanToInt(String str) {
        int n = str.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int s1 = value(str.charAt(i));
            if (i + 1 < n) {
                int s2 = value(str.charAt(i + 1));
                // Value of current symbol is greater or equal to the next symbol
                if (s1 >= s2) {
                    res = res + s1;
                } else {
                    // Value of current symbol is less than the next symbol
                    res = res + s2 - s1;
                    // we move our current index i+1
                    i++;
                }
            } else {
                res = res + s1;
            }
        }
        return res;
    }

    // Method-2 using hashmap
//        Expected Time Complexity: O(n)
//        Expected Auxiliary Space: O(1)
    // public static int romanToInt(String s) {
//        Map<Character, Integer> hs = new HashMap<>();
//        hs.put('I', 1);
//        hs.put('V', 5);
//        hs.put('X', 10);
//        hs.put('L', 50);
//        hs.put('C', 100);
//        hs.put('D', 500);
//        hs.put('M', 1000);
//        int n = s.length();
//        int res = 0;
//        for (int i = 0; i < n; i++) {
//            // if prev value is smaller than we remove the previous value as oops add this
//            // bymistake(it does not supposed to be additive but it supposed to be
//            // subtractive one) & then we again subtract this with current res.
//            if (i > 0 && hs.get(s.charAt(i)) > hs.get(s.charAt(i - 1))) {
//                res = res + hs.get(s.charAt(i)) - 2 * hs.get(s.charAt(i - 1));
//            } else {
//                res = res + hs.get(s.charAt(i));
//            }
//        }
//        return res;
//    }

    public static void main(String[] args) {
        String input = "MCMIV";
        System.out.print("Integer form of Roman Numeral " + input + " is: " + romanToInt(input));
    }

}