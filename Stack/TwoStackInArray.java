package Stack;

//Method-1: it is a space-optimised method. 
//Time Complexity: 
//Push operation : O(1)
//Pop operation : O(1)
//Auxiliary Space :O(N). 
//Use of array to implement stack.
public class TwoStackInArray {
    int size;
    int top1, top2;
    int arr[];

    public TwoStackInArray(int size) {
        this.size = size;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        if (top1 >= top2) {
            return;
        }
        top1++;
        arr[top1] = x;
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        if (top1 >= top2) {
            return;
        }
        top2--;
        arr[top2] = x;
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        if (top1 == -1) {
            return -1;
        }
        int res1 = arr[top1];
        top1--;
        return res1;
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        if (top2 == size) {
            return -1;
        }
        int res2 = arr[top2];
        top2++;
        return res2;
    }

    public static void main(String[] args) {
        TwoStackInArray st = new TwoStackInArray(5);
        st.push1(5);
        st.push1(10);
        st.push2(15);
        st.push1(11);
        st.push2(7);
        System.out.print("popped fron stack 1: " + st.pop1());
        st.push2(40);
        System.out.print("\npopped fron stack 1: " + st.pop2());

    }

}
