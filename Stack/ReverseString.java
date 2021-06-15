package Stack;

class Stack {
    int size;
    int top;
    char a[];

    Stack(int size) {
        this.size = size;
        top = -1;
        a = new char[size];
    }

    // (push) adding elements in stack
    void push(char ch) {
        if (top >= size) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        a[top] = ch;
    }

    // pop means retrive with deleting element
    int pop() {
        if (top == -1) {
            System.out.println("\nNo element to pop Stack is empty");
            return 0;
        }
        int res = a[top];
        top--;
        return res;
    }

    // peep means retrive without deleting element
    char peek() {
        if (top == -1) {
            System.out.println("\nNo element to peek Stack is empty");
            return 0;
        }
        char res = a[top];
        return res;
    }

    boolean isEmpty() {
        return (top == -1);
    }

}

public class ReverseString {
//    Method-1 using stack
//    Expected Time Complexity: O(N)
//    Expected Auxiliary Space: O(N)
    static String reverse(String s) {
        int n = s.length();
        Stack st = new Stack(n);
        char ch[] = s.toCharArray();
        for (char c : ch) {
            st.push(c);
        }
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char a = st.peek();
            st.pop();
            str = str + a;
        }
        return str;
    }

//    Method-2 using swapping
//    Expected Time Complexity: O(N)
//    Expected Auxiliary Space: O(1)
//    static void swap(char a[], int index1, int index2) {
//        char temp = a[index1];
//        a[index1] = a[index2];
//        a[index2] = temp;
//    }
//
//    static void reverse(char ch[]) {
//        int n = ch.length;
//        for (int i = 0; i < n / 2; i++) {
//            swap(ch, i, n - i - 1);
//        }
//    }

    public static void main(String[] args) {
        String s = new String("mishalGupta");

        // reverse method call
        s = reverse(s);
        System.out.println("Reverse string is: " + s);

//        char[] ch = s.toCharArray();
//        reverse(ch);
//        System.out.println("Reverse string is: " + String.valueOf(ch));
    }

}
