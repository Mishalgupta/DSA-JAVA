package Strings;

import java.util.*;

public class GroupAnagrams {
    // Method-using hashmap
//    Expected Time Complexity: O(N*|S|*log|S|), where |S| is the length of the strings.
//    Expected Auxiliary Space: O(N*|S|), where |S| is the length of the strings.
    public static List<List<String>> Anagrams(String string_list[]) {
        List<List<String>> ans = new ArrayList<>();

        // adding elements to hashmap in new list if they are not present.
        // else simply add them with respective list.
        HashMap<String, List<String>> hash = new HashMap<>();

        for (String i : string_list) {
            // convert this string to array so that we can sort it
            char ch[] = i.toCharArray();
            // sort the char array using custom sorting comparator
            Arrays.sort(ch);

            // this String() contains default method that convert char array to string
            String str = new String(ch);
            if (!hash.containsKey(str)) {
                hash.put(str, new ArrayList<>());
            }
            // if already present then add in the list appropriate index
            hash.get(str).add(i);
        }

        // finally add all values to list & then return the list
        ans.addAll(hash.values());
        return ans;
    }

    public static void main(String[] args) {
        String str[] = { "act", "god", "cat", "dog", "tac" };
        System.out.println("Groups are: " + Anagrams(str));
    }

}