package Strings;

import java.util.*;

public class PermutationOfStrings {

    // Time : O(n!*n) for a string their are n! permutations
    // Space : O(n)
    static public String swap(String s, int i, int j) {
        char[] charArray = s.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        // valueOf will convert charArray into string
        return String.valueOf(charArray);
    }

    // Declare a global list
    // Creating a public static Arraylist such that we can store values
    static List<String> str = new ArrayList<>();

    static void solve(String s, int l, int r) {
        if (l == r) {
            str.add(s);
            return;
        }
        for (int i = l; i <= r; i++) {
            s = swap(s, l, i);
            solve(s, l + 1, r);
            // backtrack as we need to again swap after permute
            s = swap(s, l, i);
        }
    }

    public static List<String> find_permutation(String S) {
        solve(S, 0, S.length() - 1);
        // this will arrange arrayList elements in alphabetical order
        Collections.sort(str);
        return str;
    }

    public static void main(String[] args) {
        String s = "abc";
        find_permutation(s); // Calling a function
        System.out.println("Permutation of string are: " + str);
    }

}