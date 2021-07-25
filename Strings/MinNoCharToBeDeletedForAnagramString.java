package Strings;

public class MinNoCharToBeDeletedForAnagramString {
//    Expected Time Complexity: O(max(|S1|, |S2|)), where |S| = length of string S.
//    Expected Auxiliary Space: O(26)
    public static int remAnagrams(String str1, String str2) {
        int arr[] = new int[256];
        // store the char count in the array
        for (int i = 0; i < str1.length(); i++) {
            // acscii value of 'a' is 65 & b is 66.
            // so , suppose 66-65=1 then this count will store in 1 index;
            arr[str1.charAt(i) - 'a']++;
        }
        // if char present in str2 then decrement the char count in arr
        for (int i = 0; i < str2.length(); i++) {
            arr[str2.charAt(i) - 'a']--;
        }

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += Math.abs(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "bcadeh";
        String s2 = "hea";
        System.out.println("Min. chars to be deleted: " + remAnagrams(s1, s2));
    }

}
