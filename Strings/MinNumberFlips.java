package Strings;

public class MinNumberFlips {
//    Expected Time Complexity: O(n).
//    Expected Auxiliary Space: O(1).
    public static int minFlips(String S) {
        int c1 = 0, c2 = 0;
        int n = S.length();
        // Only 2 possibilities are there.
        // First to have a sequence "010101..." and
        // second to have a sequence "1010101...".
        for (int i = 0; i < n; i++) {
            // for 1st possibility for odd 1st char should be 0 otherwise increase count
            // if even then first char should be 1 otherwise increase count
            if (i % 2 != 0 && S.charAt(i) == '0') {
                c1++;
            } else if (i % 2 == 0 && S.charAt(i) == '1') {
                c1++;
            }
            // for 2nd possibility for odd 1st char should be 1 otherwise increase count
            // if even then first char should be 0 otherwise increase count
            if (i % 2 != 0 && S.charAt(i) == '1') {
                c2++;
            } else if (i % 2 == 0 && S.charAt(i) == '0') {
                c2++;
            }
        }
        int res = Math.min(c1, c2);
        return res;
    }

    public static void main(String[] args) {
        String S = "001";
        System.out.println("Min. swap require is: " + minFlips(S));

    }

}
