package Strings;

import java.util.*;

public class NonRepeatingCharacter {
    // Method-Hashmap
//    Expected Time Complexity: O(N).
//    Expected Auxiliary Space: O(Number of distinct characters)
    static char nonrepeatingCharacter(String S) {
        HashMap<Character, Integer> hs = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            if (hs.containsKey(S.charAt(i))) {
                // if character repeat then increment the char value by 1
                hs.put(S.charAt(i), hs.get(S.charAt(i)) + 1);
            } else {
                // set the character value to 1
                hs.put(S.charAt(i), 1);
            }
        }
        int k = 0;
        for (int i = 0; i < S.length(); i++) {
            char temp = S.charAt(i);
            // check if char is non repeative, if found then return it
            if (hs.get(temp) == 1) {
                // this k is used to get kth repeating character
                if (k == 0) {
                    return temp;
                }
                k++;
            }
        }
        // if no non-repetative char then return $
        return '$';
    }

    public static void main(String[] args) {
        String str = "zxvczbtxyzvy";
        System.out.println("char is: " + nonrepeatingCharacter(str));
    }

}
