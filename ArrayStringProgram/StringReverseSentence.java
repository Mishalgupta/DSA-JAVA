package ArrayStringProgram;

import java.util.Scanner;

public class StringReverseSentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String str = sc.nextLine();
        String ans = "";
        int i = str.length() - 1;
        while (i >= 0) {
            while (i >= 0 && str.charAt(i) == ' ') {
                i--;
            }
            int j = i;
            if (i < 0) {
                break;
            }
            while (i >= 0 && str.charAt(i) != ' ') {
                i--;
            }
            if (str.isEmpty()) {
                ans = ans.concat(str.substring(i + 1, j + 1));
            } else {
                ans = ans.concat(' ' + str.substring(i + 1, j + 1));
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
