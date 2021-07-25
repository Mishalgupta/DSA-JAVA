package Strings;

import java.util.*;

//A pangram is a sentence containing every letter in the english alphabet
public class K_Panagrams {
//    Expected Time Complexity: O(N) where N is length of str.
//    Expected Auxiliary Space: O(N)  

    static boolean kPangram(String str, int k) {
        // Create a hash table to mark the characters present in the string
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                hs.add(str.charAt(i));
                count++;
            }
        }
        if (count >= 26 && 26 - hs.size() <= k) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog";
        int k = 0;
        System.out.println("Pangram: " + kPangram(str, k));
    }

}
