package Strings;

import java.util.*;

public class SubsequenceOfString {
    // Time : O(2^n) for a string their are 2^n subsequences
    // Space : O(n)

    // Declare a global list
    // Creating a public static Arraylist such that we can store values
    static List<String> al = new ArrayList<>();

    static void findsubsequences(String s, String ans) {
        if (s.length() == 0) {
            al.add(ans);
            return;
        }

// Not adding first character of the string
// because the concept of subsequence either
// character will present or not.
        findsubsequences(s.substring(1), ans);

// We add adding 1st character in string excluding 0th position character
        findsubsequences(s.substring(1), ans + s.charAt(0));

    }

    public static void main(String[] args) {
        String s = "ab";
        findsubsequences(s, ""); // Calling a function
        System.out.println(al);
    }

}
