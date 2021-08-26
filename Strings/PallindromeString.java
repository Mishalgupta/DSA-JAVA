package Strings;

//Given a string S, check if it is palindrome or not.
public class PallindromeString {
//    Expected Time Complexity: O(Length of S) 
//    Expected Auxiliary Space: O(1) 
//    public static int isPlaindrome(String S) {
//        String s = "";
//        int n = S.length();
//        for (int i = n - 1; i >= 0; i--) {
//            s = s + S.charAt(i);
//        }
////        System.out.println(s);
//        if (S.equalsIgnoreCase(s)) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }

    // method-2 recursive
    // Time : O(n)
    static int solve(char ch[], int l, int r) {
        if (l >= r) {
            return 1;
        }
        if (ch[l] != ch[r]) {
            return 0;
        }
        return solve(ch, l + 1, r - 1);
    }

    static int isplaindrome(String s) {
        int l = 0;
        char ch[] = s.toCharArray();
        int r = s.length() - 1;
        int res = solve(ch, l, r);
        return res;
    }

    public static void main(String[] args) {
//      String str = new String("Mishal");
        String str = new String("abba");
        System.out.println("String is pallindome: " + isplaindrome(str));

    }

}