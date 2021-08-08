package Strings;

public class LongestCommonPrefix {
// Method-1
//    Time complexity : O(S)
//    Space complexity : O(1)
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return null;
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                // return when i is equal to length of strs or char is not equal
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }

//   Method-2
//  Time complexity : O(S)
//  Space complexity : O(1)
//    static String commonPrefixUtil(String str1, String str2) {
//        String result = "";
//        int n1 = str1.length(), n2 = str2.length();
//
//        // Compare str1 and str2
//        for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++) {
//            if (str1.charAt(i) != str2.charAt(j)) {
//                break;
//            }
//            result += str1.charAt(i);
//        }
//
//        return (result);
//    }
//
//    // A Function that returns the longest common prefix
//    // from the array of strings
//    static String longestCommonPrefix(String arr[]) {
//        int n = arr.length;
//        String prefix = arr[0];
//
//        for (int i = 1; i <= n - 1; i++) {
//            prefix = commonPrefixUtil(prefix, arr[i]);
//        }
//        return (prefix);
//    }

    public static void main(String[] args) {
        String str[] = { "flower", "flow", "flight" };
        System.out.print("Longest common prefix is: " + longestCommonPrefix(str));

    }

}
