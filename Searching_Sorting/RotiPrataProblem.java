package Searching_Sorting;

public class RotiPrataProblem {
//    Method-Binary Search
//    Time: O(nlogn)
//    Space: O(1);
    static int minTime(int a[], int n, int prata) {
        int start = 0;
        int end = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            end = Math.max(end, a[i]);
        }
        end = end * (prata * (prata + 1) / 2);
//        System.out.println(end);
        int res = 0;
        while (start <= end) {
            int mid = start + ((int) end - start) / 2;
            if (time(a, n, prata, mid)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    static boolean time(int a[], int n, int prata, int mid) {
        int p = 0, time = 0;
        for (int i = 0; i < n; i++) // n times
        {
            time = a[i];
            int j = 2;
            while (time <= mid) {
                time = time + (a[i] * j);
                j++;
                p++;
//                System.out.println(time);
            }
//            System.out.println("prata" + p);
        }
        if (p >= prata) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
//        int a[] = { 1, 2, 3, 4 };
//        int prata = 10;
//        int a[] = { 1, 1, 1, 1, 1, 1, 1, 1 };
//        int prata = 8;
        int a[] = { 1 };
        int prata = 8;
        int n = a.length;
        System.out.println("Min. time to cook prata is: " + minTime(a, n, prata));
    }

}
