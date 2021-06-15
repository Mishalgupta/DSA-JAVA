package Stack;

//time:O(1)
//space:O(1)
public class StackBasic {
    int maxSize;
    int top;
    int arr[];

    public StackBasic(int size) {
        maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    void push(int j) {
        if (top >= maxSize) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top] = j;
    }

    // pop means retrive with deleting element
    int pop() {
        if (top == -1) {
            System.out.println("\nNo element to pop Stack is empty");
            return 0;
        }
        int res = arr[top];
        top--;
        return res;
    }

    // peep means retrive without deleting element
    int peek() {
        if (top == -1) {
            System.out.println("\nNo element to peek Stack is empty");
            return 0;
        }
        int res = arr[top];
        return res;
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        StackBasic st = new StackBasic(10);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        while (!st.isEmpty()) {
            int value = st.pop();
            System.out.print(value + " ");
        }
        System.out.println(st.peek());
    }

}
