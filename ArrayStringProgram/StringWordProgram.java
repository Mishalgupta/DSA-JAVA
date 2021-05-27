package ArrayStringProgram;

import java.util.Scanner;

public class StringWordProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String str = sc.nextLine();
        int C = 1, i;
        System.out.println(str.length());
        for (i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                C++;
            }

        }
        System.out.println("Count is: " + C);

        // method 1 to remove white spaces.
        String s = str.replace(" ", "");
        System.out.println(s);

//        String s1 = "aaa";
//        System.out.println(s1.replace("aa", "b")); //ba rather than ab

        // method 2 to remove white spaces.
//        char[] strarr = str.toCharArray();
        StringBuffer str1 = new StringBuffer(); // StringBuffer() size is 16 bytes bydefault and it's used to create
                                                // mutable(Changable) string.
//        for (i = 0; i < strarr.length; i++) {
//            if (strarr[i] != ' ' && strarr[i] != '\t' && strarr[i] != '\n') {
//                str1.append(strarr[i]);
//            }
//        }
//        String str2 = str1.toString(); // string str1 copy to another string str2
//        System.out.println(str2);

        // method 3 to remove white spaces.
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '\t' && str.charAt(i) != '\n') {
                str1.append(str.charAt(i));
            }
        }
        System.out.println(str1);
        sc.close();
    }

}
