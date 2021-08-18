package MatrixTwoDArray;

import java.util.*;

public class KthSmallestMatrix {
    public static int kthSmallest(int[][] mat, int n, int k) {
        // since it's NxN matrix so we don't need to calculate size for individual r,c
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                queue.add(mat[i][j]);
                if (queue.size() > k) {
                    queue.poll();
                }
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
//        int mat[][] = { { 16, 28, 60, 64 }, { 22, 41, 63, 91 }, { 27, 50, 87, 93 }, { 36, 78, 87, 94 } }; // k=3, n=4
        int mat[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 24, 29, 37, 48 }, { 32, 33, 39, 50 } }; // k=7, n=4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to search");
        int k = sc.nextInt();
        int n = mat.length;
        System.out.println(kthSmallest(mat, n, k));
        sc.close();
    }

}