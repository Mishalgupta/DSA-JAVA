package Arrays;

import java.util.Scanner;

public class ReverseArray {
    static void reversearray(int arr[], int start, int end) {
        int temp;
        // iterative approach o(n) Time complexity
//        while (start < end) {
//            temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }

        // Recursive approach o(n)
        if (start >= end) {
            return;
        } else {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reversearray(arr, start + 1, end - 1);

        }
    }

    static void printarray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        reversearray(arr, 0, n - 1);
        printarray(arr, n);

        sc.close();

    }

}
