package Strings;

public class ValidSuffle {
    public static boolean shuffleCheck(String s1, String s2, String s3) {
        int l = s1.length();
        int m = s2.length();
        int n = s3.length();
        if (l + m != n) {
            return false;
        }

        // variables to track each character of 3 strings
        int i = 0, j = 0, k = 0;

        // iterate through all characters of result
        while (k < n) {
            // check if first character of result matches
            // with first character of first string
            if (i < l && s1.charAt(i) == s3.charAt(k)) {
                i++;
            }
            // check if first character of result matches
            // with first character of second string
            else if (j < m && s2.charAt(j) == s3.charAt(k)) {
                j++;
            }
            // if the character doesn't match
            else {
                return false;
            }
            // access next character of result
            k++;
        }
        // after accessing all characters of result
        // if either s1 or s2 has some characters left
        if (i < s1.length() || j < s2.length()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String first = "XY";
        String second = "12";
        String[] results = { "1XY2", "Y12X", "Y21XX" };

        // call the method to check if result string is
        // shuffle of the string first and second
        for (String result : results) {
            if (shuffleCheck(first, second, result) == true) {
                System.out.println(result + " is a valid shuffle of " + first + " and " + second);
            } else {
                System.out.println(result + " is not a valid shuffle of " + first + " and " + second);
            }
        }
    }
}
