package Arrays;

//Find the max contiguous sum sub-array.
//if we solve this normally then it took O(n^2) time. as we had to sort array and then take max sum sub array.
//to solve this problem in O(n) we use kadane algorithm.
public class KadaneAlgo {
    static int kadane(int arr[], int n) {
//        Integer.MAX_VALUE
//        Integer.MAX_VALUE is a constant in the Integer class of java.lang package that 
//        specifies that stores the maximum possible value for any integer variable in Java.
//        The actual value of this is: 2^31-1 = 2147483647

//        Integer.MIN_VALUE
//        Integer.MIN_VALUE is a constant in the Integer class of java.lang package that
//        specifies that stores the minimum possible value for any integer variable in Java.
//        The actual value of this is: -2^31 = -2147483648

        int max = Integer.MIN_VALUE;// MIN.VALUE use karne se agr sare elements -ve bhi hoge to ye chalega ku ki int
                                    // ki range (-2^31 , 2^31-1) hoti hai.
        int current = 0;
        for (int i = 0; i < n; i++) // O(n) Times
        {
            current = current + arr[i];
            if (current > max) {
                max = current;
            } else if (current < 0) {
                current = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        int arr[] = { 1, 2, -1, -2, 1, 9 };
//        int arr[] = { -1, -2, -3, -4 };
        int arr[] = { 1, 2, 3, -2, 5 };
        int n = arr.length;
        System.out.print(kadane(arr, n));

    }

}