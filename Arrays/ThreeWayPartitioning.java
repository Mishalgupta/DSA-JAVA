package Arrays;

//Given an array of size n and a range [a, b]. 
//The task is to partition the array around the range such that array is divided into three parts.
//1) All elements smaller than a come first.
//2) All elements in range a to b come next.
//3) All elements greater than b appear in the end.
//The individual elements of three sets can appear in any order. You are required to return the modified array.
public class ThreeWayPartitioning {
//This will not run as we don't have driver code

//Expected Time Complexity: O(n)
//Expected Auxiliary Space: O(1)
    public static void threeWayPartition(int array[], int a, int b) {
        int n = array.length;
        int low = 0, high = n - 1, temp = 0;
        for (int i = 0; i <= high;) {
            // If current element is smaller than range,
            // put it on next available smaller position.
            if (array[i] < a) {
                temp = array[i];
                array[i] = array[low];
                array[low] = temp;
                low++;
                i++;
            }
            // If current element is greater than range,
            // put it on next available greater position.
            else if (array[i] > b) {
                temp = array[i];
                array[i] = array[high];
                array[high] = temp;
                high--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 3, 4 };
        int a = 1, b = 2;
        threeWayPartition(array, a, b);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }

}
