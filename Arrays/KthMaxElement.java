package Arrays;

import java.util.*;

public class KthMaxElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        System.out.println("Enter k");
        int k = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            if (i < k) {
                pq.add(a[i]);
//                System.out.println(pq);
            } else if (pq.peek() < a[i]) {
                pq.poll();
//                System.out.println(pq);
                pq.add(a[i]);
//                System.out.println(pq);
            }
        }
//        System.out.println(pq);
        ArrayList<Integer> arr = new ArrayList<Integer>(pq);
        Collections.sort(arr, Collections.reverseOrder());
        System.out.print("Top k max elements are: ");
        for (int i : arr) {
            System.err.print(i + " ");
        }
        sc.close();
    }

}
