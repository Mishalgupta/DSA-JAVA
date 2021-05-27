package Strings;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
//Approach #2: Simple Check [Accepted]
//        Time Complexity: O(N^2) where N is the length of s. anFd here we use s+s so O(N*N) 
//        Space Complexity: O(N), the space used building A+A.
        if (s.length() == goal.length() && (s + s).contains(goal)) {
            return true;
        }
        return false;

//Approach #3: KMP algorithm [Accepted]
    }

    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
//        String s = "abcde", goal = "abced";
        System.out.println(rotateString(s, goal));
    }

}