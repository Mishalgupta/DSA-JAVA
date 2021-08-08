package Strings;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
//Method-1 Brute force
        // Time: O(N^2)
        // Space: O(1)
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        // label continue will help to execute continue for outer loop
        // as by-default it is for inner loop only.
        outer: for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt((i + j) % s.length()) != goal.charAt(j)) {
                    continue outer;
                }
            }
            return true;
        }
        return false;
    }

    // Method-2
//        Time Complexity: O(N^2) where N is the length of s. and here we use s+s so O(N*N) 
//        Space Complexity: O(N), the space used building A+A.
//    public static boolean rotateString(String s, String goal) {
//        if (s.length() == goal.length() && (s + s).contains(goal)) {
//            return true;
//        }
//        return false;
//    }

    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
//        String s = "abcde", goal = "abced";
        System.out.println("Strings are rotatable: " + rotateString(s, goal));
    }

}