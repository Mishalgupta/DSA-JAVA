package javapractice;

import java.util.*;

public class PriorityQueueProg {

    public static void main(String[] args) {
        PriorityQueue<Character> pq = new PriorityQueue<Character>();
        pq.add('A');
        pq.add('b');
        pq.add('c');
        pq.add('d');
        System.err.println(pq);
        pq.remove();
        System.out.println(pq);
        System.out.println(pq.element());// view head element without removing it.

        Iterator it = pq.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        PriorityQueue<Character> pq1 = new PriorityQueue<Character>();
        pq1.offer('A');
        pq1.offer('b');
        pq1.offer('c');
        pq1.offer('d');
        System.err.println(pq1);
        pq1.poll();
        System.out.println(pq1);
        System.out.println(pq1.peek());// view head element without removing it.

        Iterator it1 = pq1.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

    }

}
