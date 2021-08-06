package Queue;

import java.util.*;

public class CircularQueue {
// Time Complexity: enQueue(), deQueue() operation is O(1) 
// as there is no loop in any of the operation.
// Space: O(n)
    ArrayList<Integer> qu = new ArrayList<>();
    int size, front, rear;

    public CircularQueue(int size) {
        this.size = size;
        this.front = this.rear = -1;
    }

    // insert element in queue
    void enQueue(int x) {
        // Condition if queue is full.
        if (front == 0 && rear == size - 1) {
            System.out.println("Stack Overflow");
        }
        // condition for empty queue.
        else if (front == -1) {
            front = 0;
            rear = 0;
            qu.add(rear, x);
        }
        // if any element from front is removed & rear is at the max. size,
        // so we set it to initial point
        else if (rear == size - 1 && front != 0) {
            rear = 0;
            qu.set(rear, x);
        } else {
            rear = rear + 1;
            // Adding a new element if
            if (front <= rear) {
                qu.add(rear, x);
            }
            // Else updating old value
            else {
                qu.set(rear, x);
            }
        }
    }

    // delete elements from queue
    int deQueue() {
        int temp;
        // if front is -1
        if (front == -1) {
            System.out.println("queue is empty");
            return -1;
        }
        temp = qu.get(front);
        // Condition for only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        // if front reaches the max. size,
        // then it means we need to set it to initial point
        else if (front == size - 1) {
            front = 0;
        } else {
            front = front + 1;
        }
        // Returns the dequeued element
        return temp;

    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
        }
        // If rear has not crossed the max size
        // or queue rear is still greater then
        // front.
        System.out.print("Elements in the " + "circular queue are: ");
        if (rear >= front) {
            // loop from front to rear
            for (int i = front; i <= rear; i++) {
                System.out.print(qu.get(i) + " ");
            }
            System.out.println();
        }
        // If rear crossed the max index and
        // indexing has started in loop
        else {
            // Loop for printing elements from
            // front to max size or last index
            for (int i = front; i < size; i++) {
                System.out.print(qu.get(i) + " ");
            }

            // Loop for printing elements from
            // 0th index till rear position
            for (int i = 0; i <= rear; i++) {
                System.out.print(qu.get(i) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Initialising new object of
        // CircularQueue class.
        CircularQueue qu = new CircularQueue(5);
        qu.enQueue(14);
        qu.enQueue(22);
        qu.enQueue(13);
        qu.enQueue(-6);

        qu.display();

        int x = qu.deQueue();
        // Checking for empty queue.
        if (x != -1) {
            System.out.print("Deleted value = ");
            System.out.println(x);
        }
        x = qu.deQueue();
        if (x != -1) {
            System.out.print("Deleted value = ");
            System.out.println(x);
        }

        qu.display();

        qu.enQueue(9);
        qu.enQueue(20);
        qu.enQueue(5);

        qu.display();

        qu.enQueue(20);
    }

}
