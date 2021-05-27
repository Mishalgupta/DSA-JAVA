package Searching_Sorting;

//A step array is an array of integers where each element has a difference of at most k with its neighbor.
//Given a key x, we need to find the index value of x if multiple-element exist to return the first occurrence of the key.
public class SearchingArrayWithAdjacentDifferAtMostK {
//    time O(n)
//    space O(1)
    static int array(int arr[], int k, int x) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] == x) {
                return i;
            } else {
                // this abs(absoulte) will always gives positive values(-ve to +ve kar dega)
                int y = Math.max(1, Math.abs(arr[i] - x) / k);
                i = i + y;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int arr[] = { 4, 5, 6, 7, 6 };
//        int k = 1, x = 6;
        int arr[] = { 20, 40, 50, 70, 70, 60 };
        int k = 20, x = 60;
        System.out.println("Index no.: " + array(arr, k, x));

    }

}
