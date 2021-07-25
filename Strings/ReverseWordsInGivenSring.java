package Strings;

public class ReverseWordsInGivenSring {
    // Method-1
//Expected Time Complexity: O(n^2)
//Expected Auxiliary Space: O(|S|)
//    static String reverseWords(String str) {
//        String ans = "";
//        int i = str.length() - 1;
//        while (i >= 0) {
//            while (i >= 0 && str.charAt(i) == '.') {
//                i--;
//            }
//            int j = i;
//            if (i < 0) {
//                break;
//            }
//            while (i >= 0 && str.charAt(i) != '.') {
//                i--;
//            }
//            if (str.isEmpty()) {
//                ans = ans.concat(str.substring(i + 1, j + 1));
//            } else {
//                ans = ans.concat('.' + str.substring(i + 1, j + 1));
//            }
//        }
//        return ans;
//    }
    
    // Method-2
//Expected Time Complexity: O(|S|)
//Expected Auxiliary Space: O(|S|)
    static String reverseWords(String S) {
        String str[] = S.split("\\.");
        String res = "";
        for (int i = str.length - 1; i > 0; i--) {
            res += str[i] + ".";
        }
        // since we have not print . after 1st word so we add it seperatly from loop
        res += str[0];
        return res;
    }

    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        System.out.println("Before: " + str);
        System.out.println("After: " + reverseWords(str));
    }

}
