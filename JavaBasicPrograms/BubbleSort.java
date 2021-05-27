package JavaBasicPrograms;

public class BubbleSort {

    public static void main(String[] args) {
        int a[] = { 1, 3, 2, 5, 4, 6, -7, 0 };
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            boolean sorted = true;// for optimisation so that loop will run n-1 , n-2 ,n-3 times on each iteration
            for (int j = 0; j < n - 1; j++) {
                if (a[j + 1] < a[j]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    sorted = false;
                }

            }
            if (sorted) {
                break;
            }
        }
//        for loop->>>
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }

        System.out.println();
//        for-each loop->>>
        for (int item : a) {
            System.out.print(item + " ");
        }
    }

}
