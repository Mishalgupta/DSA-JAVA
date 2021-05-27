package Strings;

public class ValidSuffle {
    public static boolean shuffleCheck(String s1, String s2, String s3) {
        int l = s1.length();
        int m = s2.length();
        int n = s3.length();
        if (l + m != n) {
            return false;
        }
        int i = 0, j = 0, k = 0;
        while (k < n) {
            if (i < l && s1.charAt(i) == s3.charAt(k)) {
                i++;
            } else if (j < m && s2.charAt(j) == s3.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }
        if (i < s1.length() || j < s2.length()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String first = "XY";
        String second = "12";
        String[] results = { "1XY2", "Y12X" };

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
