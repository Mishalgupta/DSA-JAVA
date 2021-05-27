package JavaBasicPrograms;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int n = a.length;
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
//        for (int i = 0; i < n; i++) {
        int l = 0, h = n, mid;
        while (l <= h) {
            mid = (l + h) / 2;
            if (key == a[mid]) {
//                return mid;
            } else if (key < a[mid]) {
                h = mid + 1;
            } else {
                l = mid + 1;
            }
        }
//        return 0;
        for (int item : a) {
            System.out.print(item + " ");
        }
        sc.close();
    }

}
