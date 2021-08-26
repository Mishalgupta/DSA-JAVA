package Strings;

public class RemoveConsecutiveCharacters {
    // Method-2 Recursive
    // Time : O(n) worst case O(n^2)
    // space: O(1)
//    public static String removeDuplicates(String S) {
//        if (S.length() < 2) {
//            return S;
//        } else if (S.charAt(0) == S.charAt(1)) {
//            return removeDuplicates(S.substring(1));
//        }
//        return S.charAt(0) + removeDuplicates(S.substring(1));
//    }

    // Method-1 iterative
    // Time : O(n)
    // space: O(1)
    public static String removeDuplicates(String S) {
        String res = "";
        if (S.length() < 2) {
            return S;
        }
        int curr = 0;
        res = res + S.charAt(curr);
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(curr) != S.charAt(i)) {
                res = res + S.charAt(i);
                curr = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String S1 = "geeksforgeeks";
        System.out.println(removeDuplicates(S1));

        String S2 = "aabcca";
        System.out.println(removeDuplicates(S2));
    }

}