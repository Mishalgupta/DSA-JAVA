package Stack;

import java.util.Stack;

public class NextGreaterElement {

//  Method-1: Brute force using loop
//  Expected Time Complexity : O(N^2)
//  Expected Auxilliary Space : O(1)
//    static void greater(int arr[], int n) {
//        int res = 0;
//        for (int i = 0; i < n; i++) {
//            if (i < n - 1) {
//                for (int j = i + 1; j < n; j++) {
//                    if (arr[i] < arr[j]) {
//                        res = arr[j];
//                        break;
//                    } else {
//                        res = -1;
//                    }
//                }
//            } else {
//                res = -1;
//            }
//            System.out.print(res + " ");
//        }
//    }

//    Method-2: using stack
//    Expected Time Complexity : O(N)
//    Expected Auxilliary Space : O(N)
    static int[] greater(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        int res[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                if (st.peek() > arr[i]) {
                    res[i] = st.peek();
                }
                while (st.peek() <= arr[i]) {
                    st.pop();
                    if (st.isEmpty()) {
                        res[i] = -1;
                        break;
                    } else {
                        res[i] = st.peek();
                    }
                }
            }
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
//        int arr[] = { 1, 3, 2, 4 };
        int arr[] = { 1, 3, 2, 4 };
//        int arr[] = { 11, 13, 21, 3 };
        int n = arr.length;
//        greater(arr, n);
        int ans[] = greater(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
