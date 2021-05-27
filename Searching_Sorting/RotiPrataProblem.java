package Searching_Sorting;

public class RotiPrataProblem {
    static int minTime(int a[], int n, int prata) {
        int start = 1;
        int end = 10000007;
        int res = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
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
        for (int i = 0; i < n; i++) {
            time = a[i];
            int j = 2;
            while (time <= mid) {
                time = time + (a[i] * j);
                j++;
                p++;
            }
        }
        if (p >= prata) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int a[] = { 4, 1, 2, 3, 4 };
        int n = a.length;
        int prata = 10;
//        int a[] = { 8, 1, 1, 1, 1, 1, 1, 1, 1 };
//        int prata = 8;
        System.out.println("Min. time to cook prata is: " + minTime(a, n, prata));
    }

}
