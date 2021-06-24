package Queue;

public class DequeImplementation {
    // Class for a node of deque
    static class node {
        int val;
        node next;
        node prev;

        public node(int val) {
            this.val = val;
        }
    }

//    implementing deque class
    static class deque {
        private node head, tail;

        public deque() {
            head = tail = null;
        }

        // if list is empty
        boolean isEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }

        // count no. of nodes in the list
        int size() {
            if (!isEmpty()) {
                node temp = head;
                int size = 0;
                while (temp != null) {
                    size++;
                    temp = temp.next;
                }
                return size;
            }
            return 0;
        }

        // insertion at first position
        void insert_first(int x) {
            node temp = new node(x);
            // if the element is first element
            if (head == null) {
                head = tail = temp;
                temp.next = temp.prev = null;
            } else {
                head.prev = temp;
                temp.next = head;
                temp.prev = null;
                head = temp;
            }
        }

        // insertion at first position
        void insert_last(int x) {
            node temp = new node(x);
            // if the element is first element
            if (head == null) {
                head = tail = temp;
                temp.next = temp.prev = null;
            } else {
                tail.next = temp;
                temp.next = null;
                temp.prev = tail;
                tail = temp;
            }
        }

        // remove from first position
        void remove_first() {
            if (isEmpty()) {
                System.out.println("List is empty");
            }
//            node temp = head;
            head = head.next;
            head.prev = null;
            return;
        }

        // remove from first position
        void remove_last() {
            if (isEmpty()) {
                System.out.println("List is empty");
            }
//            node temp = tail;
            tail = tail.prev;
            tail.next = null;
            return;
        }

        // display the elements in deque
        void display() {
            if (isEmpty()) {
                System.out.println("List is empty");
            }
            node temp = head;
            while (temp != null) {
                System.out.println(temp.val + " ");
                temp = temp.next;
            }
            return;
        }
    }

    // Class to implement queue using deque
    static class Queue {
        deque d = new deque();

        // enqueue to insert element at last
        // using insert at last function of deque
        public void enqueue(int element) {
            d.insert_last(element);
        }

        // dequeue to remove element from first
        // using remove at first function of deque
        public void dequeue() {
            d.remove_first();
        }

        // display
        public void display() {
            d.display();
        }

        // size
        public int size() {
            return d.size();
        }
    }

    // Class to implement stack using Deque
    static class Stack {
        deque d = new deque();

        // push to push element at top of stack
        // using insert at last function of deque
        public void push(int element) {
            d.insert_last(element);
        }

        // Returns size
        public int size() {
            return d.size();
        }

        // pop to remove element at top of stack
        // using remove at last function of deque
        public void pop() {
            d.remove_last();
        }

        // Display
        public void display() {
            d.display();
        }
    }

    public static void main(String[] args) {
        // Object of Stack
        Stack stk = new Stack();
        // push 7 and 8 at top of stack
        stk.push(7);
        stk.push(8);
        System.out.print("Stack: ");
        stk.display();
        // pop an element
        stk.pop();
        System.out.print("Stack after deletion: ");
        stk.display();
        System.out.println("Size of stack is: " + stk.size());

        // Object of queue
        Queue qu = new Queue();
        qu.enqueue(12);
        qu.enqueue(13);
        System.out.println("Queue initially: ");
        qu.display();
        qu.dequeue();
        System.out.println("Queue after deletion: ");
        qu.display();
        System.out.println("Size of queue is: " + qu.size());
    }

}