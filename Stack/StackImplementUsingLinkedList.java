package Stack;

public class StackImplementUsingLinkedList {

    class Node {
        int data;
        Node next;

        Node(int val) {
            next = null;
            this.data = val;
        }
    }

    // create global top reference variable global
    Node top;

    StackImplementUsingLinkedList() {
        this.top = null;
    }

    public void push(int x) {

        // create new node temp and allocate memory &
        // initialize data into temp data field
        Node temp = new Node(x);

        // check if stack (heap) is full
//        (But in linked list space grows dynamically) as compared to arrays
//        Then inserting an element would lead to stack overflow
//        if (temp == null) {
//            System.out.println("\nStack overflow");
//            return;
//        }

        // put top reference into temp next
        temp.next = top;

        // update top reference
        top = temp;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }

    // Utility function to return top element in a stack
    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // Utility function to pop top element from the stack
    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        // set top to null as top.next==null
        top = top.next;
    }

    public void display() {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            return;
        } else {
            Node temp = top;
            while (temp != null) {

                // print node data till temp is null
                System.out.printf(temp.data + " ");

                // assign temp next to temp
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        StackImplementUsingLinkedList obj = new StackImplementUsingLinkedList();
        // insert Stack value
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

        // print Stack elements
        System.out.println("Stack elements before operations");
        obj.display();

        // print Top element of Stack
        System.out.printf("\nTop element is %d\n", obj.peek());

        // Delete top element of Stack
        obj.pop();
        obj.pop();

        // print Stack elements
        obj.display();

        // print Top element of Stack
        System.out.printf("\nTop element is %d\n", obj.peek());

    }

}
