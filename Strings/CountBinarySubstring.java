package Strings;

public class CountBinarySubstring {
// Time : O(n)  where N is the length of string 
// Space : O(1)

    // Function to return the count of maximum substrings str can be divided into
//    static int maxSubStr(String str, int n) {
//        // To store the count of 0s and 1s
//        int count0 = 0, count1 = 0;
//
//// To store the count of maximum substrings str can be divided into
//        int cnt = 0;
//        for (int i = 0; i < n; i++) {
//            if (str.charAt(i) == '0') {
//                count0++;
//            } else {
//                count1++;
//            }
//            if (count0 == count1) {
//                // reseting the count- & count1
//                count0 = 0;
//                count1 = 0;
//                cnt++;
//            }
//        }
//
//// It is not possible to split the string
//        if (cnt == 0) {
//            return -1;
//        }
//        return cnt;
//    }

//    method-2 all the 0's and all the 1's in these substrings are grouped consecutively.
    static int maxSubStr(String str, int n) {
        int curdup = 1;
        int prevdup = 0;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                prevdup = curdup;
                curdup = 1; // reset curdup for next sequence
            } else {
                curdup++; // count the duplicate character
            }
            if (prevdup >= curdup) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "0100110101";
//        String str = "00110011";
        int n = str.length();
        System.out.println("total binary Substrings are: " + maxSubStr(str, n));
    }
}