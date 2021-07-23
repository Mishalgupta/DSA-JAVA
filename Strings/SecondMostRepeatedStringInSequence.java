package Strings;

import java.util.*;

public class SecondMostRepeatedStringInSequence {
//    Expected Time Complexity: O(N*max(|Si|).
//    Expected Auxiliary Space: O(N).
    static String secFrequent(String arr[], int N) {
        HashMap<String, Integer> hs = new HashMap<>();
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (hs.containsKey(arr[i])) {
                hs.put(arr[i], hs.get(arr[i]) + 1);
                if (max < hs.get(arr[i])) {
                    max = hs.get(arr[i]);
                }
            } else {
                hs.put(arr[i], 1);
            }
        }
        int smax = 0;
        String res = "";
        for (Map.Entry<String, Integer> map : hs.entrySet()) {
            int value = (int) map.getValue();
            if (smax < value && value < max) {
                smax = value;
                res = (String) map.getKey();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String arr[] = { "aaa", " bbb", "ccc", "bbb", "aaa", "aaa" };
        int N = arr.length;
        System.out.println("Second most repetative String is: " + secFrequent(arr, N));
    }

}
