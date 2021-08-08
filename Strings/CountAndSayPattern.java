package Strings;

public class CountAndSayPattern {
    static String lookandsay(int n) {
        if (n == 1) {
            return "1";
        }
        if (n == 2) {
            return "11";
        }
        // Every term is generated using previous term.
        // Initialize previous term.
        String str = "11";
        for (int i = 3; i <= n; i++) {
            // In below for loop, previous character is processed in
            // current iteration. That is why a dummy character is
            // added to make sure that loop runs one extra iteration.
            str = str + "#";

            // Initializing count for matching chars
            int count = 1;

            // Initialize i'th term in series
            String temp = "";

            char ch[] = str.toCharArray();
            for (int j = 1; j < str.length(); j++) {
                // if current char doesn't match
                if (ch[j] != ch[j - 1]) {
                    // append the count of ch[j-1]
                    temp = temp + count;

                    // append ch[j-1]
                    temp = temp + ch[j - 1];

                    // reset count for next char
                    count = 1;
                }
                // if the char matches than increment the count of matching char
                else {
                    count++;
                }
            }
            // update str
            str = temp;
        }
        return str;
    }

    public static void main(String[] args) {
        int N = 4;
        System.out.println("pattern is: " + lookandsay(N));
    }

}
