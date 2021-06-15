package Stack;

import java.util.Stack;

public class ReverseSentence {
//Method-1
//Time: O(n)
//Space: O(n)
//    static void reverse(String str) {
//        Stack<String> st = new Stack<>();
//        // this method will split the string with " "
//        String res[] = str.split(" ");
//        int n = res.length;
//        System.out.println(n);
//        for (int i = 0; i < n; i++) {
//            st.push(res[i]);
//        }
//        while (!st.isEmpty()) {
//            System.out.print(st.peek() + " ");
//            st.pop();
//        }
//    }

//Method-2
//Time: O(n)
//Space: O(n)
    static void reverse(String str) {
        Stack<String> st = new Stack<>();
        String res = "";
        int n = str.length();
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != ' ') {
                res = res + str.charAt(i);
            } else {
                // Push the temporary
                // variable into the stack
                st.push(res);

                // Assigning temporary
                // variable as empty
                res = "";
            }
        }
        st.push(res);
        while (!st.isEmpty()) {
            System.out.print(st.peek() + " ");
            st.pop();
        }
    }

    public static void main(String[] args) {
        String str = "Hey! how are you doing?";
        reverse(str);

    }

}
