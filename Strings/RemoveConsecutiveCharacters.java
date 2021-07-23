package Strings;

public class RemoveConsecutiveCharacters {
    // Method-2 Recursive
    // Time : O(n) worst case O(n^2)
    // space: O(1)
    public static String removeDuplicates(String S) {
        if (S.length() < 2) {
            return S;
        } else if (S.charAt(0) == S.charAt(1)) {
            return removeDuplicates(S.substring(1));
        }
        return S.charAt(0) + removeDuplicates(S.substring(1));
    }

    public static void main(String[] args) {
        String S1 = "geeksforgeeks";
        System.out.println(removeDuplicates(S1));

        String S2 = "aabcca";
        System.out.println(removeDuplicates(S2));
    }

}
