package Strings;

import java.util.*;

//Print all the duplicates in the input string
public class DuplicateInStrings {
    static final int NO_OF_CHARS = 256;

//    Time Complexity: O(n), where n = length of the string passed
//    Space Complexity: O(NO_OF_CHARS)
    public static void printDups(String str) {
//        Method-1
//        int count[] = new int[NO_OF_CHARS];
//        this will count the character occourence
//        for (int i = 0; i < str.length(); i++) {
//            count[str.charAt(i)]++;
//        }
//        System.out.println(count[str.charAt(i)]);
//        for (int i = 0; i < NO_OF_CHARS; i++) {
//            if (count[i] > 1) {
//                System.out.println((char) i + "," + count[i]);
//            }
//        }

//        Thus, Space Complexity is potentially high for such cases. 
//        So, to avoid any discrepancies and to improve Space Complexity, maps are generally preferred over long-sized arrays. 

        // Method-2 here we use maps to store counts
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            // initialising for 1st key at 0
            if (!hash.containsKey(str.charAt(i))) {
                hash.put(str.charAt(i), 1);
//                System.out.println(hash.put(str.charAt(i), 1));
            } else {
                hash.put(str.charAt(i), hash.get(str.charAt(i)) + 1);
//                System.out.println(hash.put(str.charAt(i), hash.get(str.charAt(i)) + 1));
            }
        }
//        System.out.println(hash);
        for (Map.Entry<Character, Integer> mapElement : hash.entrySet()) {
            char key = (char) mapElement.getKey();
            int value = ((int) mapElement.getValue());

            if (value > 1)
                System.out.println(key + ", count = " + value);
        }
    }

    public static void main(String[] args) {

        String str = "test string";
        printDups(str);

    }

}
