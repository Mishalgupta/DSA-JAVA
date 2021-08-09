package JavaBasicPrograms;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int n = a.length;
        System.out.println("Enter no. to search");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        boolean res = false;
        int l = 0, h = n - 1, mid;
        while (l <= h) {
            mid = l + (h - l) / 2;
            if (key == a[mid]) {
                res = true;
            } else if (key < a[mid]) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(res);
        sc.close();
    }

}