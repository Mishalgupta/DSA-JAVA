package Strings;

//Given a string S, check if it is palindrome or not.
public class PallindromeString {
//    Expected Time Complexity: O(Length of S) 
//    Expected Auxiliary Space: O(1) 
    public static int isPlaindrome(String S) {
        String s = "";
        int n = S.length();
        for (int i = n - 1; i >= 0; i--) {
            s = s + S.charAt(i);
        }
//        System.out.println(s);
        if (S.equalsIgnoreCase(s)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
//        String str = new String("Mishal");
        String str = new String("abba");
        System.out.println("String is pallindome: " + isPlaindrome(str));

    }

}
