package Strings;

public class ReverseString {
    static char[] reverse(char s[], int n) {
        char ch[] = new char[n];
        int start = 0, end = n - 1;
        while (start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
            ch = s;

        }
        return ch;
    }

    public static void main(String[] args) {
        String str = new String("Mishal");
        char ch[] = str.toCharArray();
        int n = str.length();
        System.out.println(reverse(ch, n));

    }

}
