package Arrays;

//Given an array of positive integers. We need to make the given array a ‘Palindrome’. 
//The only allowed operation is”merging” (of two adjacent elements). Merging two adjacent elements means replacing them with their sum.
//The task is to find the minimum number of merge operations required to make the given array a ‘Palindrome’.
public class MinMergeOperationsTomakeArrayPalindrome {
//    The time complexity for the given program is: O(n)
    public static int merge(int arr[], int n) {
        int count = 0;
        for (int i = 0, j = n - 1; i <= j;) // n times
        {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } else if (arr[i] > arr[j]) {
                j--;
                arr[j] = arr[j] + arr[j + 1];
                count++;
            } else {
                i++;
                arr[i] = arr[i] + arr[i - 1];
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Already pallindrome");
        }
        return count;
    }

//    Therefore this problem can be solved iteratively using two pointers (first pointer pointing to start of the array and
//    second pointer pointing to the last element of the array) method and keeping count of total merging operations done till now.
    public static void main(String[] args) {
//        int arr[] = new int[] { 15, 4, 15 };
        int arr[] = { 1, 4, 5, 11 };
        int n = arr.length;
        System.out.println("Min. no. of operations is:  " + merge(arr, n));

    }

}
