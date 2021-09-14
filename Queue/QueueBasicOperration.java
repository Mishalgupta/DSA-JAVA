package Queue;

//Auxiliary Time: 
//Enque(insertion)           O(1)
//Deque(deletion)            O(1)
//Front(Get front)           O(1)
//Rear(Get Rear)             O(1)
//Auxiliary Space: O(N).  n is arrya size
public class QueueBasicOperration {
    int maxSize;
    int front, back;
    int arr[];

    QueueBasicOperration(int size) {
        maxSize = size;
        arr = new int[maxSize];
        front = -1;
        back = -1;
    }

    void push(int x) {
        if (back >= maxSize - 1) {
            System.out.println("Queue overflow");
            return;
        }
        back++;
        arr[back] = x;
        // set first to initial
        if (front == -1) {
            front++;
        }
    }

    int pop() {
        if (front == -1 || front > back) {
            System.out.println("Queue is empty");
            return -1;
        }
        front++;
        int res = arr[front];
        return res;
    }

    int peek() {
        if (front == -1 || front > back) {
            System.out.println("Queue is empty");
            return -1;
        }
        int res = arr[front];
        return res;
    }

    boolean isEmpty() {
        if (front == -1 || front > back) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        QueueBasicOperration st = new QueueBasicOperration(10);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        while (!st.isEmpty()) {
            int value = st.pop();
            System.out.print(value + " ");
        }
        System.out.println("\n" + st.peek());
    }

}