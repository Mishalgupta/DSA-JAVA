package Queue;

public class QueueUsingLinkedList {
    class Node {
        int data;
        Node next;

        Node(int val) {
            next = null;
            this.data = val;
        }
    }

    // create global front,back reference variable global
    Node front, back;

    QueueUsingLinkedList() {
        this.front = null;
        this.back = null;
    }

    void push(int x) {
        Node n = new Node(x);
        if (front == null) {
            // pointing both on same point
            back = n;
            front = n;
            return;
        }
        back.next = n;
        back = n;
    }

    void pop() {
        if (front == null) {
            System.out.println("Queue is empty");
        }
//        Node temp = front;
        front = front.next;
//        return temp;
    }

    int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
        }
        return front.data;
    }

    boolean isEmpty() {
        if (front == null) {
            return true;
        }
        return false;
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            Node temp = front;
            while (temp != null) {

                // print node data
                System.out.printf(temp.data + " ");

                // assign temp next to temp
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        QueueUsingLinkedList obj = new QueueUsingLinkedList();
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

        // print Stack elements
        System.out.println("Stack elements before operations");
        obj.display();

        // print Top element of queue
        System.out.printf("\nTop element is %d\n", obj.peek());

        // Delete top element of queue
        obj.pop();
        obj.pop();

        // print queue elements
        obj.display();

        // print Top element of queue
        System.out.printf("\nTop element is %d\n", obj.peek());
    }

}
