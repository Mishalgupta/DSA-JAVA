package Strings;

import java.util.*;

public class LongestNonRepeativeSubstring {
    // Method- Using hashtable(hashset)
//Expected Time Complexity: O(|S|).
//Expected Auxiliary Space: O(K) where K is constant.
    static int longestUniqueSubsttr(String S) {
        Set<Character> hs = new HashSet<>();
        int j = 0, max = 0;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            while (hs.contains(ch)) {
                // remove all elements from list
                hs.remove(S.charAt(j++));
            }
            hs.add(ch);
            // i keeps the index of hashset & j is the elements remove from table
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    public static void main(String[] args) {
//        String str = "geeksforgeeks";
        String str = "aaaaaaaaaaaa";
        System.out.println("char is: " + longestUniqueSubsttr(str));
    }

}
