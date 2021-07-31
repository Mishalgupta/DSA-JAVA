package Searching_Sorting;

//Given an array A of N elements. Find the majority element in the array.
//A majority element in an array A of size N is an element that appears more than N/2 times in the array.
public class MajorityElement {
//    Expected Time Complexity: O(N).
//    Expected Auxiliary Space: O(1).
    static int majorityElement(int a[], int size) {
        int count = 0;
        int maj_element = 0;
        // here we will find the maj_element
        for (int i = 0; i < size; i++) {
            if (count == 0) {
                maj_element = a[i];
            }
            if (maj_element == a[i]) {
                count += 1;
            } else {
                count -= 1;
            }
        }
        // here we check if that element present more than n/2 times
        int count1 = 0;
        int X = size / 2;
        for (int i = 0; i < size; i++) {
            if (maj_element == a[i]) {
                count1++;
            }
        }
        if (count1 > X) {
            return maj_element;
        }
        return -1;
    }

    public static void main(String[] args) {
        int A[] = { 3, 1, 3, 3, 2 };
        int size = A.length;
        System.out.println(majorityElement(A, size));
    }

}
