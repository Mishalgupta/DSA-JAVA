package Strings;

public class IsomorphicStrings {
//    Expected Time Complexity: O(|str1|+|str2|).
//    Expected Auxiliary Space: O(Number of different characters)
    public static boolean areIsomorphic(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        // if length are different return false
        if (n1 != n2) {
            return false;
        }
        // For counting the previous appearances of character in both the strings
        int[] countChars1 = new int[256];
        int[] countChars2 = new int[256];
        for (int i = 0; i < n1; i++) {
            // count of occourance of each character
            countChars1[str1.charAt(i)]++;
            countChars2[str2.charAt(i)]++;
            // Two strings str1 and str2 are called isomorphic if there is
            // a one to one mapping possible for every character of str1 to every
            // character of str2 while preserving the order. if it is not same we
            // return false.
            if (countChars1[str1.charAt(i)] != countChars2[str2.charAt(i)]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "xxy";
        System.out.println("Isomorphic strings: " + areIsomorphic(str1, str2));
    }

}
